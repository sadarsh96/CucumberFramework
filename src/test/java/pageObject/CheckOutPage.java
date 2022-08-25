package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
	
	public WebDriver driver ;
	public CheckOutPage(WebDriver driver) {
		this.driver= driver;
	}
	
	By productName = By.xpath("//p[@class='product-name']") ;
	By apply = By.cssSelector(".promoBtn");
	By submit = By.xpath("//button[text()='Place Order']");
	
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	public WebElement getApplyButton() {
		return driver.findElement(apply);
	}
	
	public WebElement getSubmitButton() {
		return driver.findElement(submit);
	}
	

}
