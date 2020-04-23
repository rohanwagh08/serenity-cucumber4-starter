package steps;

import net.serenitybdd.core.pages.PageObject;

import static org.assertj.core.api.Assertions.assertThat;

public class OHRM_DashBoardPage extends PageObject {
    public void vertify_login(){
        assertThat(getDriver().getCurrentUrl().contains("dashboard"));
    }
}
