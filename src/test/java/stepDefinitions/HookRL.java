package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.mongodb.diagnostics.logging.Logger;

import commonUtils.ElementUtils;
import configurations.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class HookRL extends Base {
	
	@Before
	public void launchBrowser() throws Exception {
		logger = LogManager.getLogger("Reward Links");
		logger.info("********Launching Browser********");

		Base.getDriver();
		logger.info("Browser is Launched");
	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(source, "image/png", screenshotName);
		}
	}

//	@After(order = 2)
//	public void quitBrowser() {
//		if (driver != null) {
//			driver.close();
//			driver.quit();
//		}
//	}	

}
