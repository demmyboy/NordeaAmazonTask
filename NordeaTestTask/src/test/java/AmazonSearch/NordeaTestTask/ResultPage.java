package AmazonSearch.NordeaTestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ResultPage {
	public static WebElement element = null;

	// The Relevance Sort DropDown
	public static WebElement selectDropDown(WebDriver driver) {
		element = driver.findElement(By.id("sort"));
		Select sel = new Select(element);
		sel.selectByVisibleText("Price: High to Low");
		return element;
	}

	// Selecting the second header Details
	public static WebElement selectSecondheader(WebDriver driver) {
		element = driver.findElement(By.xpath("//li[@id='result_1']//parent::h2"));
		return element;
	}

	// Finding the String in the Header Details
	public static WebElement headerDetails(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id='productTitle']"));
		return element;
	}

	// Creating APIS to do the actions
	public static void sortResult(WebDriver driver) {
		element = selectDropDown(driver);
		element.click();
	}

	// CLicking on the details of the second result
	public static void secondResult(WebDriver driver) {
		element = selectSecondheader(driver);
		element.click();
	}

}
