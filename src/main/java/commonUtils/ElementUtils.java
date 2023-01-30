package commonUtils;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ElementUtils {

	FluentWait wait;
	Actions act;
	JavascriptExecutor executor;

	public ElementUtils(WebDriver driver) {

		act = new Actions(driver);
//		wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(2))
//				.ignoring(Exception.class);
		executor = (JavascriptExecutor) driver;

	}
	
	public void waitForCompleteLoad(WebDriver driver) {
		FluentWait wait = fluentWait(driver);
		wait.until(ExpectedConditions.jsReturnsValue("return document.readyState === 'complete' ? true : false"));
	}
	
	private FluentWait fluentWait(WebDriver driver) {
		FluentWait wait = new FluentWait(driver).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofSeconds(2))
				.ignoring(Exception.class);
		return wait;
	}

	public void fluentWaitVisibilityofElement(WebDriver driver, WebElement element ) {
		wait = fluentWait(driver);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public void fluentWaitElementToBeClickable(WebDriver driver, WebElement element) {
		FluentWait wait = fluentWait(driver);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void javascriptClick(WebElement element, WebDriver driver) {
		executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
	
	public void javascriptScrollintoViewClick(WebDriver driver, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", element);
		element.click();
	}
	
	

}
