Feature: User wants to view redeemed vouchers
Scenario: Verify My Vouchers
		Given User opens login page of the reward link
    When user enters otp "1000"
    And Clicks On Continue
    Then user should be able to login to rewad links
		And Clicks on My Vouchers
		And User can view all redeemed vouchers
		Then Verify with pin 