package swaglabsTestRunner;

import io.cucumber.testng.CucumberOptions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(
		tags="@SmokTest",
		features= {"src/test/resources/swaglabs"},
		glue= {"swaglabsStepDefinitons"},
		plugin = {"pretty","html:target/SwagLabsReport.html"},
		monochrome = true
		
		)

public class swaglabsTestRunner extends AbstractTestNGCucumberTests{

}
  