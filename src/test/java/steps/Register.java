package steps;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Step;

import java.util.HashMap;
import java.util.Map;

public class Register {

//    Map<String, String> register = new HashMap<>();
    Map<String, String> hm_header = new HashMap<>();
    RequestSpecification request;
    Response response;
    String body_text;
//    @Step
    public RequestSpecification createRegistrationRequest() {
        hm_header.put("Content-Type","application/json");
//        register.put("email", "abc@gmail.com");
//        register.put("password", "abc123");
        body_text = "{\"email\":\"abc@reqres.in\",\"password\":\"pistol\"}";
        request =
                 given()
                .baseUri("https://reqres.in")
                .headers(hm_header);
        return request;
    }
//    @Step
    public Response postRegistrationRequest() {
        response = request.when().body(body_text).post("/api/register");
        return response;
    }
//    @Step
    public void verifyRegistrationRequest() {
        response.then().statusCode(200);

    }
}