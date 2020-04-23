package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import steps.DashBoardPage;
import steps.LoginPage;


public class Login_To_OHRM_StepDefinitions {

    @Steps
    LoginPage lp;

    @Steps
    DashBoardPage dp;

    @Given("User is on the OrangeHRM Login page")
    public void user_is_on_the_OrangeHRM_Login_page() {
        lp.open_application();
    }

    @When("User enters {string} as username and {string} as password and hit enter")
    public void userEntersAsUsernameAndAsPasswordAndHitEnter(String username, String password) {
        lp.enter_username(username);
        lp.enter_password(password);
        lp.click_submit();
    }

    @Then("user should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {

        dp.verify_login();
    }


    @Then("user should be able to see Invalid credentials alert")
    public void user_should_be_able_to_see_Invalid_credentials_alert() {

    }

}
