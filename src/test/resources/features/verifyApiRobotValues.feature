@smoke
Feature: Verify robots robotId,batteryLevel  is correct values

  Scenario: Get response from /robots and verify robots robotId is correct
    When Get response from robots endpoint
    And Status code is 200
    Then All robotId's should be between 1 and 100

  Scenario: Get response from /robots and verify robots batteryLevel is correct
    When Get response from robots endpoint
    And Status code is 200
    Then  batteryLevel should be between 0 and 100

  Scenario: Get response from /robots and verify robots coordinates is correct
    When Get response from robots endpoint
    And Status code is 200
    Then  coordinates should be between 0 and 100


