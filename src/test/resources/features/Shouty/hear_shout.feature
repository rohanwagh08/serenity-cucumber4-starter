Feature: Hear Shout
  Scenario: Listener is within range
    Given Lucy is located 15 meters from Sean
    When Sean shouts free "free bagels at Sean's"
    Then Lucy hears Sean's message