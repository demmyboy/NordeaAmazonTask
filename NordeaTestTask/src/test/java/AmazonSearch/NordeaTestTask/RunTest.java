package AmazonSearch.NordeaTestTask;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)  //should run with the cucumber package
@CucumberOptions(
		
		
		monochrome = true, // makes output readable
		format = {"pretty", "html:target/html/"},  // To Create html report in the target folder after every run
		features= "src/test/resource", // helps to local where the feature files are (.feature)
		glue= {"stepdefinition"}    // location of the steps
		
		)


public class RunTest {
	

}
