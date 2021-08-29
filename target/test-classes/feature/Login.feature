Feature: Login functionality

  Scenario: Login with valid credentials

    Given user has valid credentials
    When user enters credentials and submit
    Then user logged in successfully
