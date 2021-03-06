package steps;

import net.thucydides.core.annotations.Step;
import pages.OHRM_DashBoardPage;
import pages.OHRM_LoginPage;

public class Login {

    OHRM_LoginPage lp;
    OHRM_DashBoardPage dp;

    @Step("Open Orange HRM Application")
    public void open_application(){
        lp.open();
    }
    @Step("Enter {0} as username")
    public void enter_username(String username){
        lp.enter_username(username);

    }
    @Step("Enter {0} as password")
    public void enter_password(String password){

        lp.enter_password(password);
    }
    @Step("Click on Submit")
    public void click_submit()
    {
        lp.click_submit();
    }

    @Step
    public void verify_valid_login(){
        dp.vertify_valid_login();
    }

    @Step("Verify invalid login")
    public void verify_invalid_login(){
        lp.vertify_invalid_login();
    }
}
