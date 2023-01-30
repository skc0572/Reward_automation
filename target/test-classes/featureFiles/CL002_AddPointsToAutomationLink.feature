Feature: Feature to add Points to User Links
Scenario: Add Points To User links
		Given User opens login page of the Campaigns link
    When user enters "webmaster@shakedeal.com" and "Sh@kede@l@123"
    And Clicks On SignIn
    Then user should be able to login to Campaign links
		And user clicks on Automation Campaign
		Then Click on Reward Automation link