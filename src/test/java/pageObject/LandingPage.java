package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By search = By.xpath(("//input[@type='search']"));
	By productName = By.cssSelector(".product-name");
	By topDeals = By.xpath("//a[text()='Top Deals']");
	
	public WebElement getSearch() {
		return driver.findElement(search);
	}
	public WebElement getProductName() {
		return driver.findElement(productName);
	}
	public void moveToTopDealsPage() {
		driver.findElement(topDeals).click();
	}
	

}
