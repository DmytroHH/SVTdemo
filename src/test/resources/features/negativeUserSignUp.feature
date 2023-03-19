@smoke@ui
Feature: Unregistered user provide invalid email and password

  Scenario: User provides invalid email
    Given User at Sign Up page
    When User provides invalid email
    Then Email is invalid message will be displayed

  Scenario: User provides invalid password
    Given User at Sign Up page
    When User provides invalid password
    Then Password is invalid message will be displayed