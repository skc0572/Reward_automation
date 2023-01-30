package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.Base;

public class RewardLinksFR extends Base {

	@FindBy(xpath = "//input[@id='v-field-1']")
	private WebElement EnterOTP;
	
	@FindBy(xpath = "//button[@class='button button v-button is-rounded is-bold is-big is-primary']")
	private WebElement ClickContinue;
	

	public RewardLinksFR(WebDriver driver) {
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getEnterOTP() {
		return EnterOTP;
	}
	
	public WebElement getClickContinue() {
		return ClickContinue;
	}

}
