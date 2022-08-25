package stepDefinations;

import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObject.CheckOutPage;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {

	TestContextSetup testContextSetup;
	CheckOutPage checkOutPage;
	public CheckoutPageStepDefinition(TestContextSetup TestContextSetup ) {
		this.testContextSetup = TestContextSetup;
		checkOutPage = testContextSetup.pageObjectManager.checkOutPage();
	}
    
    @When("validate that product name in offers page matched with landing")
    public void validate_that_product_name_in_offers_page_matched_with_landing() {
    	Assert.assertEquals(testContextSetup.pageObjectManager.getLandingPage().getProductName().getText(), checkOutPage.getProductName());
    }
	
	@When("User moves to checkoutPage")
	public void user_moves_to_checkout_page() throws InterruptedException {
		testContextSetup.pageObjectManager.getAddProductPage().getAddButton().click();
		testContextSetup.pageObjectManager.getAddProductPage().getCart().click();
		testContextSetup.pageObjectManager.getAddProductPage().checkout().click();
	}

	@And("Apply button is visible")
	public void apply_button_is_visible() {
	    Assert.assertTrue(checkOutPage.getApplyButton().isDisplayed());
	}
	@And("Place Order button is visible")
	public void place_order_button_is_visible() {
	    Assert.assertTrue(checkOutPage.getSubmitButton().isDisplayed());
	}
	
}
