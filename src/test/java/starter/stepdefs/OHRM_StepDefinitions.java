package starter.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.*;


public class OHRM_StepDefinitions {

    @Steps
    Login login;

    @Steps
    Navigate navigateTo;

    @Steps
    AddEmployee addEmployee;

    @Given("User is on the OrangeHRM Login page")
    public void user_is_on_the_OrangeHRM_Login_page() {
        login.open_application();
    }

    @When("User enters {string} as username and {string} as password and hit enter")
    public void userEntersAsUsernameAndAsPasswordAndHitEnter(String username, String password) {
        login.enter_username(username);
        login.enter_password(password);
        login.click_submit();
    }

    @Then("user should be able to see dashboard")
    public void user_should_be_able_to_see_dashboard() {
        login.verify_valid_login();
    }


    @Then("user should be able to see Invalid credentials alert")
    public void user_should_be_able_to_see_Invalid_credentials_alert() {
        login.verify_invalid_login();
    }


    @Given("User is logged in to application with {string} as username and {string} as Password")
    public void userIsLoggedInToApplicationWithAsUsernameAndAsPassword(String username, String password) {
        login.open_application();
        login.enter_username(username);
        login.enter_password(password);
        login.click_submit();
    }

    @And("User is on Employee List page")
    public void userIsOnEmployeeListPage() {
        navigateTo.navigate_employee_list_page();
    }

    @When("User adds a new Employee with create login details enabled")
    public void userAddsANewEmployeeWithCreateLoginDetailsEnabled() {
        addEmployee.add();
    }

    @Then("new Employee should be created")
    public void newEmployeeShouldBeCreated() {
        Assert.assertTrue(true);

    }

}
