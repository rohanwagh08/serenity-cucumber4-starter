package steps;


import net.thucydides.core.annotations.Step;
import pages.OHRM_LoginPage;

public class LoginPage {
    OHRM_LoginPage lp;

    @Step
    public void open_application(){
        lp.open();
    }
    @Step
    public void enter_username(String username){
        lp.enter_username(username);

    }
    @Step
    public void enter_password(String password){
        lp.enter_password(password);
    }
    @Step
    public void click_submit(){
        lp.click_submit();
    }

}
