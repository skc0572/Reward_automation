package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import commonUtils.ElementUtils;
import configurations.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyMyVoucher extends Base {
	
	private ElementUtils eu= new ElementUtils(driver);
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
		
		String HomePage = driver.getTitle();
		String ExpectedHomePage = "ShakePe Rewards";
		assertEquals(ExpectedHomePage, HomePage);
		
	}

	@When("Clicks on My Vouchers")
	public void clicks_on_my_vouchers() {
	    
	}

	@And("User can view all redeemed vouchers")
	public void user_can_view_all_redeemed_vouchers() {
	    
	}

	@Then("Verify with pin")
	public void verify_with_pin() {
	    
	}
	
	
	}
	