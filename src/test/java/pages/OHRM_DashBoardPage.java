package pages;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class OHRM_DashBoardPage extends PageObject {
    public void vertify_valid_login(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("dashboard"));
    }
    public void vertify_invalid_login(){
        Assert.assertTrue($(By.id("spanMessage")).containsText("Invalid credentials"));
    }
    public void navigate_to_Employee_List_Page(){
        Actions act = new Actions(getDriver());
        act.moveToElement($(By.id("menu_pim_viewPimModule")))
                .click($(By.id("menu_pim_viewEmployeeList")))
                .build()
                .perform();
    }
}
