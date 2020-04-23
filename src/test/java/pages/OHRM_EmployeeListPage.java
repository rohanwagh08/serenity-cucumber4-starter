package pages;

import net.serenitybdd.core.pages.PageObject;
import objectBuilder.employee.Employee;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OHRM_EmployeeListPage extends PageObject {
    Employee employee = new Employee.EmployeeBuilder("Rohan","Wagh")
            .middleName("M").empId(001).createLoginDetails(true)
            .username("rohan").password("rohan123").status(true).build();

    public void click_add_employee(){
        $(By.id("btnAdd")).click();
    }

    public void enter_first_name(){
        $(By.id("firstName")).type(employee.getFirstName());
    }
    public void enter_middle_name(){
        $(By.id("middleName")).type(employee.getMiddleName());
    }
    public void enter_last_name(){
        $(By.id("lastName")).type(employee.getLastName());
    }
    public void enter_empId(){
        $(By.id("employeeId")).type(employee.getEmpId().toString());
    }
    public void tick_create_login_details(){
        if(!($(By.id("chkLogin")).isSelected()))
        $(By.id("chkLogin")).click();
    }
    public void enter_username(){
        $(By.id("user_name")).type(employee.getUsername());
    }
    public void enter_password(){
        $(By.id("user_password")).type(employee.getPassword());
    }
    public void enter_confirm_password(){
        $(By.id("re_password")).type(employee.getPassword());
    }
    public void select_status(){
        Select select = new Select($(By.id("status")));
        select.selectByValue("Enabled");
    }
    public void click_save(){
        $(By.id("btnSave")).click();
    }
}
