package configurations;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import commonUtils.ConfigFileReader;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {

	public static WebDriver driver;
	public static Logger logger;

	public static ConfigFileReader config = new ConfigFileReader();

	public static WebDriver getDriver() throws Exception {

		String browsername = config.getConfigFileElement("browser");

		if (browsername.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
//			ChromeOptions options = new ChromeOptions(); // To Run In Headless
//			options.addArguments("headless"); // To Run In Headless
			
			
			driver = new ChromeDriver(); 

		}

		else if (browsername.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else if (browsername.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			

		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		return driver;
	}

}
