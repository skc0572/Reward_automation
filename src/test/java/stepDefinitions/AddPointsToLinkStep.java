package stepDefinitions;

import commonUtils.ElementUtils;
import configurations.Base;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.AddPointsToLinkPage;

public class AddPointsToLinkStep extends Base {
	
	private ElementUtils eu= new ElementUtils(driver);
	private AddPointsToLinkPage pl = new AddPointsToLinkPage(driver);
	
	
	
	@Then("user clicks on Automation Campaign")
	public void user_clicks_on_automation_campaign() {
		eu.fluentWaitVisibilityofElement(driver, pl.getClickAutomationCampaign());
	    eu.javascriptClick(pl.getClickAutomationCampaign(), driver);
	}

	@And("Click on Reward Automation link")
	public void click_on_reward_automation_link() {
		eu.fluentWaitVisibilityofElement(driver, pl.getClickRewardAutomation());
		eu.javascriptScrollintoViewClick(driver, pl.getClickRewardAutomation());
//	    eu.javascriptClick(pl.getClickRewardAutomation(), driver);
		
//		eu.javascriptScrollintoViewClick(driver, pl.getAddPendingValue());
		eu.fluentWaitVisibilityofElement(driver, pl.getAddValue());
		pl.getAddValue().clear();
		pl.getAddValue().sendKeys("10000");
		pl.getAddPendingValue().clear();
		pl.getAddPendingValue().sendKeys("8000");
		eu.fluentWaitVisibilityofElement(driver, pl.getClickSave());
		eu.javascriptClick(pl.getClickSave(), driver);
		eu.fluentWaitVisibilityofElement(driver, pl.getClickParentSave());
		eu.javascriptClick(pl.getClickParentSave(), driver);
	}
}
