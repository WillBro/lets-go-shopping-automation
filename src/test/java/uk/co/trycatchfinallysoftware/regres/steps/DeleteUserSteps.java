package uk.co.trycatchfinallysoftware.regres.steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

public class DeleteUserSteps extends BaserUserSteps {

    @Step("When I delete user with id {0}")
    public void delete(int id) {
        SerenityRest
                .given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().delete(USER_API_WITH_ID, createApiUrlWithUserId(id));
    }

    @Step
    public void deleteIsExecutedSuccesfully() {
        response.then().statusCode(HttpStatus.SC_NO_CONTENT);
    }

    @Step
    public void iShouldNotBeAbleToGetUserWithId(int id) {
        SerenityRest.when().get(USER_API, createApiUrlWithUserId(id)).then().statusCode(HttpStatus.SC_NOT_FOUND);
    }
}
