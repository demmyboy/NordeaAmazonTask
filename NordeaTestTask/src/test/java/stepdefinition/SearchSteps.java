
package stepdefinition;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import AmazonSearch.NordeaTestTask.HomePage;
import AmazonSearch.NordeaTestTask.ResultPage;
import static org.junit.matchers.JUnitMatchers.*;

public class SearchSteps {
	static WebDriver driver;
	String baseUrl = "http://amazon.com";
	
	@Given("^User has to be on amazon home page$")
	public void user_has_to_be_on_amazon_home_page() {
		System.setProperty("webdriver.gecko.driver", "src/geckodriver.exe");
		driver = new FirefoxDriver();
		// Maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseUrl); // Call the URL
	}

	@When("^User enters the search for nikkon$")
	public void user_enters_the_search_for_nikkon() {
		HomePage.fillInSearchTextBox(driver, "Nikon");
	}

	@When("^Clicks on the search button$")
	public void clicks_on_the_search_button() {
		HomePage.clickOnSearchButton(driver);
	}

	@When("^User is on the search result page$")
	public void user_is_on_the_search_result_page() {
		System.out.println("I am on the Result Page");
	}

	@Then("^User can select highest to lowest on the sort dropdown menu$")
	public void user_can_select_highest_to_lowest_on_the_sort_dropdown_menu() throws Exception {
		ResultPage.sortResult(driver);
		System.out.println("Item have been Sorted");
		Thread.sleep(2000);
	}

	@Then("^User should click on the header details of the second item in the result displayed$")
	public void user_should_click_on_the_header_details_of_the_second_item_in_the_result_displayed() throws Exception {
		ResultPage.secondResult(driver);
		System.out.println("Second Header details Selected");
		Thread.sleep(2000);
	}

	@Then("^User can confirm if the details header contains a string$")
	public void user_can_confirm_if_the_details_header_contains_a_string() {
		String Details = ResultPage.headerDetails(driver).getText();
		System.out.println(Details);
		Assert.assertThat("The Expected Name is not in ", Details, containsString("DX3"));
	}
	
	@Then("^Browser should close$")
	public void browser_should_close(){
		driver.close();
		System.out.println("The browser has closed. Thank you");
	    
	}

}