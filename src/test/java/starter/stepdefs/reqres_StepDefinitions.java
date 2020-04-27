package starter.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import net.thucydides.core.annotations.Steps;
import steps.Register;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class reqres_StepDefinitions {
  Map<String, String> register = new HashMap<>();
    Map<String, String> hm_header = new HashMap<>();
    RequestSpecification request;
    Response response;

    @Given("User has new email and password")
    public void userHasNewEmailAndPassword() {
        hm_header.put("Content-Type","application/json");
        register.put("email", "abc@gmail.com");
        register.put("password", "abc123");

        request =
                given()
                        .baseUri("https://reqres.in")
                        .headers(hm_header).body(register);
    }

    @When("User post a register request to {string}")
    public void userPostARegisterRequestTo(String endpoint) {
        response = request.when().post(endpoint);
    }

    @Then("New user is created")
    public void newUserIsCreated() {
        response.then().statusCode(400)
        .assertThat().body("error",equalTo("Note: Only defined users succeed registration"));
    }

}
