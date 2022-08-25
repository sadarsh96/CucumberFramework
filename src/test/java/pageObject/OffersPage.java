package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OffersPage {
	
	public WebDriver  driver;
	
	By search = By.xpath("//input[@type='search']");
	By product = By.cssSelector("tr td:nth-child(1)");

	public OffersPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getSearchBox() {
		return driver.findElement(search);
	}
	public String getProductName() {
		return driver.findElement(product).getText();
	}


}
