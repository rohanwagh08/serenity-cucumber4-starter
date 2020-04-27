Feature: Register a User

  Scenario: Verify the user is able to register
    Given User has new email and password
    When User post a register request to "/api/register/"
    Then New user is created