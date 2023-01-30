Feature: User logins to Reward Links Front End
Scenario: Reward Links Login
    Given User opens login page of the reward link
    When user enters otp "1000"
    And Clicks On Continue
    Then user should be able to login to rewad links
