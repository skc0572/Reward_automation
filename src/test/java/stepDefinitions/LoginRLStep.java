package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals; 

import commonUtils.ElementUtils;
import configurations.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.RewardLinksFR;

public class LoginRLStep extends Base {
	
	private RewardLinksFR lp = new RewardLinksFR (driver);
	private ElementUtils eu= new ElementUtils(driver);
	
	
	@Given("User opens login page of the reward link")
	public void user_opens_login_page_of_the_reward_link() throws Exception {
		driver.get(config.getConfigFileElement("rl_url"));
		logger.info("Reward Links Login page is open");
//		driver.navigate().refresh();
	    }

	
	@When("user enters otp {string}")
	public void user_enters_otp(String OTP) {

		eu.fluentWaitVisibilityofElement(driver, lp.getEnterOTP());
		lp.getEnterOTP().sendKeys(OTP);
	}

	@And("Clicks On Continue")
	public void clicks_on_continue() throws InterruptedException {

		eu.fluentWaitElementToBeClickable(driver, lp.getClickContinue());
		eu.javascriptClick(lp.getClickContinue(), driver);
	}

	@Then("user should be able to login to rewad links")
	public void user_should_be_able_to_login_to_rewad_links() {
			
		String ActualTitle =	driver.getTitle();
		String ExpectedTitle = "ShakePe Rewards - Link";
		assertEquals(ExpectedTitle, ActualTitle);
	    
	}

}
