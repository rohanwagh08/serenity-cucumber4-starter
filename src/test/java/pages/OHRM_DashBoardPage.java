package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;


public class OHRM_DashBoardPage extends PageObject {
    public void vertify_valid_login(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("dashboard"));
    }
    public void vertify_invalid_login(){
        Assert.assertTrue($(By.id("spanMessage")).containsText("Invalid credentials"));

    }
}
