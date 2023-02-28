Feature: Login Feature

  @login
  Scenario: Login Page Title
    Given user is on the login Page
    When user gets the title of the page
    Then page title should be "Account Login"

  @login
  Scenario: newUser button exist
    Given user is on the login Page
    Then newUser button is present

  @login
  Scenario: Login with correct credential
    Given user is on the login Page
    When user enters userName "abracadabra@gmail.com"
    And user enters password "Demo0162/"
    And user clicks on login button
    Then user gets the title of the page
    And page title should be "My Account"
