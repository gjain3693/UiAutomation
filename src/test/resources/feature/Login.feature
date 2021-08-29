Feature: Login functionality

  Scenario: Login with valid credentials

    Given user is at Amazon login page
    When user enters credentials and submit
    Then user logged in successfully
