package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import pages.DashBoardPage;
import pages.LoginPage;


public class Login_To_OHRM_StepDefinitions {

    @Steps
    LoginPage lp;

    @Steps
    DashBoardPage dp;

    @Given("User is on the OrangeHRM Login page")
    public void user_is_on_the_OrangeHRM_Login_page() {
        lp.open_application();
    }

    @When("User enters valid {string} and {string} and hit enter")
    public void user_enters_valid_and_and_hit_enter(String username, String password) {
        lp.enter_username(username);
        lp.enter_password(password);
        lp.click_submit();
    }

    @Then("user should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {
        dp.verify_login();
    }

    @When("User enters invalid {string} and {string} and hit enter")
    public void user_enters_invalid_and_and_hit_enter(String string, String string2) {

    }

    @Then("user should be able to see Invalid credentials alert")
    public void user_should_be_able_to_see_Invalid_credentials_alert() {

    }
}
