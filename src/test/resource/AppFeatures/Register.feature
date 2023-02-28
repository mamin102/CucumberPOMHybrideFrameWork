Feature: Register page feature

  @register
  Scenario: Register a new user
    Given user in on the login page
    When user clicks on the new customer button
    Then user gets the title of the page
    And page title should be "Register Account"
    Then user enter FirstName "Adam"
    And user enter LastName "Smith"
    And user enter email "abr@gmail.com"
    And user enter Telephone "4135658689"
    And user enter password "Demo0162/"
    And user enter Confirm password "Demo0162/"
    And user choose the newsletter Subscribe option
    And user agrees to the Privecy Policy
    Then user click on the Continue button
    And user should get a massage "Your Account Has Been Created!"
    Then user gets the title of the page
    And page title should be "Your Account Has Been Created!"
    When user click on the successPage Continue button
    Then user gets the title of the page
    And page title should be "My Account"
