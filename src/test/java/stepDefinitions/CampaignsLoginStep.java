package stepDefinitions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import commonUtils.ElementUtils;
import configurations.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.CampaignsLoginPage;

public class CampaignsLoginStep extends Base {
	
	private ElementUtils eu= new ElementUtils(driver);
	private CampaignsLoginPage cl = new CampaignsLoginPage(driver);
//	
	@Given("User opens login page of the Campaigns link")
	public void user_opens_login_page_of_the_campaigns_link() throws Exception {
		driver.get(config.getConfigFileElement("content_url"));
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String email, String password) {
		eu.fluentWaitVisibilityofElement(driver, cl.getEmail());
		cl.getEmail().sendKeys(email);
		cl.getPassword().sendKeys(password);
	}

	@And("Clicks On SignIn")
	public void clicks_on_sign_in() {

		eu.javascriptClick(cl.getClicksignin(), driver);	
//		eu.waitForCompleteLoad(driver);
	}

	@Then("user should be able to login to Campaign links")
	public void user_should_be_able_to_login_to_campaign_links() throws Exception {
//		eu.fluentWaitVisibilityofElement(driver, cl.getClickContent());
//		eu.waitForCompleteLoad(driver);
//		Thread.sleep(10000);
//		eu.waitForCompleteLoad(driver);
//		driver.get(config.getConfigFileElement("content_url"));
//		cl.getClickContent().submit();
		

//		String classvalue = cl.getRewardsActive().getAttribute("class");
//		
//		if(!classvalue.contains("active")) {
//			eu.javascriptClick(cl.getClickRewards(), driver);
//			}
		
//		
//		eu.javascriptClick(cl.getClickContent(), driver);	
		eu.fluentWaitVisibilityofElement(driver, cl.getClickRewardCampaigns());
		eu.javascriptClick(cl.getClickRewardCampaigns(), driver);
		String ActualTitle =	driver.getTitle();
		String ExpectedTitle = "Reward Campaigns";
		assertEquals(ExpectedTitle, ActualTitle);
	    
		
	}

}
