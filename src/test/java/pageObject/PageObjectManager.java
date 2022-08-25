package pageObject;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	WebDriver driver;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public LandingPage getLandingPage() {
		return new LandingPage(driver);
	}

	public OffersPage getOffersPage() {
		return new OffersPage(driver);
	}

	public AddProductPage getAddProductPage() {
		return new AddProductPage(driver);
	}
	
	public CheckOutPage checkOutPage() {
		return new CheckOutPage(driver);
	}

}
