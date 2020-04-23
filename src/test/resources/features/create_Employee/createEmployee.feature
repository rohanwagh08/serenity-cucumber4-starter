Feature: Create new Employee

  Scenario: Create new Employee with login details

    Given User is logedin to application with "Admin" as username and "admin123" as Password
    And User is on Employee List page
    When User adds a new Employee with create login details enabled
    Then new Employee should be created