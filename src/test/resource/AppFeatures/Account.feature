Feature: Account Page Feature

  Background: 
    Given user is already logged in to application
      | username              | password  |
      | abracadabra@gmail.com | Demo0162/ |

  @accounts
  Scenario: Account Page title
    Given user is on the accounts page
    When user gets the title of the page
    Then page title should be "My Account"

  @accounts
  Scenario: Accounts Section Count
    Given user is on the accounts page
    Then user gets accounts sections
      | My Account         |
      | Edit Account       |
      | Password           |
      | Address Book       |
      | Wish List          |
      | Order History      |
      | Downloads          |
      | Recurring payments |
      | Reward Points      |
      | Returns            |
      | Transactions       |
      | Newsletter         |
      | Logout             |
    And accounts section count should be 13
