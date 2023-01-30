package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import configurations.Base;

public class ClickMyVouchers {

	@FindBy(xpath="//strong[text()='My Vouchers']")
	private WebElement ClickMyVouchers;
	
	public ClickMyVouchers(WebDriver driver){
		Base.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClickMyVouchers() {
		return ClickMyVouchers;
	}
	
	
	
}
