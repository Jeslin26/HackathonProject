package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\2308481\\eclipse-workspace\\IdentifyNewBikes\\FeatureFiles\\login.feature", glue = "stepDefinition", plugin = { "pretty",
		"html:reports/myCucumberReport.html" })
public class testRunner {

}