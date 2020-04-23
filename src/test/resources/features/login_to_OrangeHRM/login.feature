Feature: Login To Orange HRM

  Scenario: Verify Login with valid credentials
    Given User is on the OrangeHRM Login page
    When User enters "Admin" as username and "admin123" as password and hit enter
    Then user should be able to see dashboard

  Scenario: Verify Login with invalid credentials
    Given User is on the OrangeHRM Login page
    When User enters "Adminnn" as username and "adminnn123" as password and hit enter
    Then user should be able to see Invalid credentials alert