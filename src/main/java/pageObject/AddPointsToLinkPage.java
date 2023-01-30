package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.Base;

public class AddPointsToLinkPage {
	
	@FindBy(xpath = "//span[text()='Automation Campaign']")
	private WebElement ClickAutomationCampaign;
	
	@FindBy(xpath = "//span[text()='Reward-Automation']")
	private WebElement ClickRewardAutomation;
	
	@FindBy(xpath = "//input[@field='value']")
	private WebElement AddValue;
	
	@FindBy(xpath = "//input[@field='pending_value']")
	private WebElement AddPendingValue;
	
	@FindBy(xpath = "//main[@class='main']//i[@data-icon='check']")
	private WebElement ClickSave;
	
	@FindBy(xpath = "//header[@class='header-bar collapsed']//i[@data-icon='check']")
	private WebElement ClickParentSave;


	public AddPointsToLinkPage(WebDriver driver){
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getClickParentSave() {
		return ClickParentSave;
	}
	
	public WebElement getClickSave() {
		return ClickSave;
	}
	
	public WebElement getClickAutomationCampaign() {
		return ClickAutomationCampaign;
	}
	
	public WebElement getAddValue() {
		return AddValue;
	}

	public WebElement getAddPendingValue() {
		return AddPendingValue;
	}

	public WebElement getClickRewardAutomation() {
		return ClickRewardAutomation;
	}
	

}
