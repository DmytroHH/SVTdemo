@smoke@ui
Feature: Wrong email or password
  Scenario: verify that if registered user enters wrong credentials warning message will be displayed
    Given User at home page and clicked on Login button
    When Registered user click on Log In button at Login page and Enters wrong credentials
    Then Warning message will be displayed