package pages;

import net.thucydides.core.annotations.Step;

public class DashBoardPage {


    OHRM_DashBoardPage dp;
    @Step
    public void verify_login(){
        dp.vertify_login();
    }
}
