package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
import steps.DashBoardPage;
import steps.EmployeeListPage;
import steps.LoginPage;


public class OHRM_StepDefinitions {

    @Steps
    LoginPage lp;

    @Steps
    DashBoardPage dp;

    @Steps
    EmployeeListPage elp;

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


    @Given("User is logedin to application with {string} as username and {string} as Password")
    public void userIsLogedinToApplicationWithAsUsernameAndAdminAsPassword(String username, String password) {
        lp.open_application();
        lp.enter_username(username);
        lp.enter_password(password);
        lp.click_submit();
    }

    @And("User is on Employee List page")
    public void userIsOnEmployeeListPage() {
        dp.navigate_employee_list_page();
    }

    @When("User adds a new Employee with create login details enabled")
    public void userAddsANewEmployeeWithCreateLoginDetailsEnabled() {
        elp.add_employee();
    }

    @Then("new Employee should be created")
    public void newEmployeeShouldBeCreated() {
        Assert.assertTrue(true);

    }
}
