Feature: Log In

  @MyStore_LogIn
  Scenario: Sign IN to application
    Given User is on "firstTestSite" website
    When User enters "Username" and "Password" to "Login"
    And User applies filter "Price (high to low)"
