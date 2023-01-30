Feature: User logins to Campaign Links Front End
Scenario: Campaigns Links Login
    Given User opens login page of the Campaigns link
    When user enters "webmaster@shakedeal.com" and "Sh@kede@l@123"
    And Clicks On SignIn
    Then user should be able to login to Campaign links