package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProductPage {

	public WebDriver driver;
	public AddProductPage(WebDriver driver) {
		this.driver= driver;
	}

	By add = By.xpath("//a[text()='+']");
	By totalCountOfItems = By.xpath("//input[@type='number']");
	By addButton = By.xpath("//button[text()='ADD TO CART']");
	By cartLink = By.xpath("//img[@alt='Cart']");
	By proceedToCheckout = By.xpath("//button[text()='PROCEED TO CHECKOUT']");

	public int getNoOfItems() {
		int totalCount = Integer.parseInt(driver.findElement(totalCountOfItems).getText());
		return totalCount;
	}
	public WebElement getAddButton() {
		return driver.findElement(addButton);
	}
	public WebElement getCart() {
		return driver.findElement(cartLink);
	}
	public WebElement checkout() {
		return driver.findElement(proceedToCheckout);
	}
	public void addItem(int count) {
		while(count>1) {
			driver.findElement(add).click();
			count--;
		}
	}


}
