package steps;

import net.thucydides.core.annotations.Step;
import pages.OHRM_EmployeeListPage;

public class AddEmployee {

    OHRM_EmployeeListPage elp;
    @Step
    public void add(){
        elp.click_add_employee();
        elp.enter_first_name();
        elp.enter_middle_name();
        elp.enter_last_name();
        elp.enter_empId();
        elp.tick_create_login_details();
        elp.enter_username();
        elp.enter_password();
        elp.enter_confirm_password();
        elp.select_status();
        elp.click_save();
    }
}
