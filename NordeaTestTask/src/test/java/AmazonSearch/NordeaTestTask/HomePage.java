package AmazonSearch.NordeaTestTask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	public static WebElement element = null;

	// Search TextBox
	public static WebElement searchTextbox(WebDriver driver) {
		element = driver.findElement(By.id("twotabsearchtextbox"));
		return element;
	}

	// Search Click Button
	public static WebElement searchButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//input[@type='submit']"));
		return element;
	}

	// Creating APIS to do the actions, its void cos its not returning anything
	public static void clickOnSearchButton(WebDriver driver) {
		element = searchButton(driver);
		element.click();
	}

	// filling the searchtextbox
	public static void fillInSearchTextBox(WebDriver driver, String search) {
		element = searchTextbox(driver);
		element.sendKeys(search);
	}

}
