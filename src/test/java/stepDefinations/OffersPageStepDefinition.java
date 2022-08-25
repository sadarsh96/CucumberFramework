package stepDefinations;
import org.testng.Assert;
import io.cucumber.java.en.Then;
import pageObject.OffersPage;
import utils.TestContextSetup;

public class OffersPageStepDefinition {
	
	TestContextSetup testContextSetup;
	OffersPage offersPage;
	String offersPageName;
	public OffersPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		offersPage = testContextSetup.pageObjectManager.getOffersPage();
	}
	@Then("^user searched the (.+) short name in offer page to verify if the product exist$")
	public void user_searched_the_short_name_in_offer_page_to_verify_if_the_product_exist(String name) throws InterruptedException {
		testContextSetup.pageObjectManager.getLandingPage().moveToTopDealsPage();
		testContextSetup.genericUtils.SwitchToWindow();
		offersPage.getSearchBox().sendKeys(name);
		Thread.sleep(3000);
	    offersPageName = offersPage.getProductName();
	}
	
	
	@Then("validate that product name in offers page matched with landing page")
	public void validate_that_product_name_in_offers_page_matched_with_landing_page() {
		Assert.assertEquals(testContextSetup.landingPageProductName,"dshjd");//offersPageName);
	}
}
