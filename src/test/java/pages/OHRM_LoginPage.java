package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class OHRM_LoginPage extends PageObject {

    public void enter_username(String username){
        $(By.id("txtUsername")).type(username);
    }
    public void enter_password(String password){

        $(By.id("txtPassword")).type(password);
    }
    public void click_submit(){

        $(By.id("btnLogin")).click();
    }
}