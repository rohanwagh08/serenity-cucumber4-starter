Feature: Hear Shout
  Scenario: Listener is within range message 1
    Given Lucy is located 15 meters from Sean
    When Sean shouts free "free bagels at Sean's"
    Then Lucy hears Sean's message

  Scenario: Listener is within range message 2
    Given Lucy is located 15 meters from Sean
    When Sean shouts free "free bagels"
    Then Lucy hears Sean's message