package uk.co.trycatchfinallysoftware.regres.steps;

import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

public class BaserUserSteps {

    protected Response response;
    protected String USER_API = "https://reqres.in/api/users";
    protected String USER_API_WITH_ID = "https://reqres.in/api/users/{id}";

    protected Map<String, Object> createApiUrlWithUserId(int id) {
        Map<String, Object> parameters = new HashMap<>();

        parameters.put("id", id);

        return parameters;
    }
}
