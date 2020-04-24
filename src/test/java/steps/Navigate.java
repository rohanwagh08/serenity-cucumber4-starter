package steps;

import net.thucydides.core.annotations.Step;
import pages.OHRM_DashBoardPage;

public class Navigate {
    OHRM_DashBoardPage dp;

    @Step
    public void navigate_employee_list_page(){
        dp.navigate_to_Employee_List_Page();
    }
}
