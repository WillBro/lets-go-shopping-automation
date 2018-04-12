package uk.co.trycatchfinallysoftware.regres.steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class GetUserSteps extends BaserUserSteps {

    @Step("I try to get a user with id {0}")
    public void get(int id) {
        response = SerenityRest
                .given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().get(USER_API_WITH_ID, createApiUrlWithUserId(id));
    }

    @Step
    public void getIsExecutedSuccesfully() {
        response.then().log().all().statusCode(HttpStatus.SC_OK);
    }

    @Step
    public void getWasNotExecutedSuccessfully() {
        response.then().statusCode(HttpStatus.SC_NOT_FOUND);
    }

    @Step
    public void iShouldGetUserWithExpectedId(int id) {
        int returnedId = response.then().extract().body().path("id");

        assertThat("Returned user ID equals expected ID",
                returnedId,
                is(id)
        );
    }

    @Step
    public void iShouldFindName(String name) {
        response.then().log().all().body("RestResponse.name", is(name));
    }

    @Step
    public void iShouldFindJob(String job) {
        response.then().body("RestResponse.job", is(job));
    }

    @Step
    public void iShouldFindUserIdHasBeenGenerated() {
        response.then().body("RestResponse.id", is(greaterThan(0)));
    }

    @Step
    public void iShouldFindCreatedAt() {
        response.then().body("RestResponse.result.createdAt", not(isEmptyString()));
    }
}
