package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.Base;

public class CampaignsLoginPage extends Base {
	
	@FindBy(xpath = "//input[@type='email']" )
	private WebElement Email;
	
	@FindBy(xpath = "//input[@placeholder='Password']")
	private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement Clicksignin;
	
	@FindBy(xpath = "//div[@sd-module='Settings']")
	private WebElement ClickContent;	
	
	@FindBy(xpath = "//div[text()='Rewards']")
	private WebElement ClickRewards;
	
	@FindBy(xpath = "//div[@class='modules']//div[@sd-module='Dashboard']/a")
	private WebElement RewardsActive;
	
	@FindBy(xpath = "//div[text()[contains(.,'Reward Campaign')]]")
	private WebElement ClickRewardCampaigns;

	@FindBy(xpath = "//div[text()='ShakePe Rewards']")
	private WebElement IdentifyShakeperewards;

	

	public CampaignsLoginPage(WebDriver driver){
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getIdentifyShakeperewards() {
		return IdentifyShakeperewards;
	}


	public WebElement getClickRewardCampaigns() {
		return ClickRewardCampaigns;
	}	
	
	public WebElement getRewardsActive() {
		return RewardsActive;
	}
	
	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return Password;
	}
	
	public WebElement getClicksignin() {
		return Clicksignin;
	}
	
	public WebElement getClickContent() {
		return ClickContent;
	}


	public WebElement getClickRewards() {
		return ClickRewards;
	}


}
