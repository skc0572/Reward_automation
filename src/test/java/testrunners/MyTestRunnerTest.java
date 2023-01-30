package testrunners;

import org.junit.runner.RunWith; 

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = "src/test/resources/featureFiles",
		glue = "stepDefinitions",
		stepNotifications = true,
		monochrome = true, 
//		dryRun = true,
//		tags = "@",
		plugin = {
				"pretty", "html:target/cucumber.html", "junit:target/cukes.xml","json:target/json-report/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "timeline:test-output-thread/",
				"timeline:target/timeline-report" 
				 },
		publish = true)

public class MyTestRunnerTest {


}

