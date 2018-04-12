package uk.co.trycatchfinallysoftware.regres.steps;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.apache.http.HttpStatus;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class CreateUserSteps extends BaserUserSteps {

    @Step("I try to create user with name {0} and job {1}")
    public void create(String name, String job) {
        response = SerenityRest
                .given().contentType(ContentType.JSON).accept(ContentType.JSON)
                .when().post(USER_API);
    }

    @Step
    public void createIsExecutedSuccesfully() {
        response.then().statusCode(HttpStatus.SC_CREATED);
    }

    @Step
    public void iShouldFindUserIdHasBeenGenerated() {
        int id = response.then().body("id", is(not(empty()))).extract().as(Integer.class);

        assertThat("Id is a valid number", id, greaterThan(0));

        Serenity.setSessionVariable("id").to(id);
    }

    @Step
    public void iShouldFindCreatedAt() {
        response.then().body("createdAt", not(isEmptyString()));
    }
}
