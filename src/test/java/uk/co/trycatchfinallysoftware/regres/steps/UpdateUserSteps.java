package uk.co.trycatchfinallysoftware.regres.steps;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

public class UpdateUserSteps extends BaserUserSteps {

    @Step("When I update user with id {0} with name {1} and job {2}")
    public void update(int id, String newName, String newJob) {
        SerenityRest
                .given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().put(USER_API_WITH_ID, createApiUrlWithUserId(id));
    }

    @Step
    public void updateIsExecutedSuccesfully() {
        response.then().statusCode(HttpStatus.SC_OK);
    }
}
