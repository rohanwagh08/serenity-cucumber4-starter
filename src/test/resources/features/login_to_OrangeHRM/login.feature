Feature: Login To Orange HRM

  Scenario: Verify Login with valid credentials
    Given User is on the OrangeHRM Login page
    When User enters valid "username" and "password" and hit enter
    Then user should be able to see dashboard

    @skip
  Scenario: Verify Login with invalid credentials
    Given User is on the OrangeHRM Login page
    When User enters invalid "username" and "password" and hit enter
    Then user should be able to see Invalid credentials alert