package stepDefinations;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LandingPage;
import utils.TestContextSetup;
public class LandingPageStepDefinition {

	TestContextSetup testContextSetup;
	LandingPage landingPage;
	public LandingPageStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		landingPage = testContextSetup.pageObjectManager.getLandingPage();
		
	}
	
	@Given("User is on GreenCart landing Page")
	public void user_is_on_green_cart_landing_page() {
	    
	}
	@When("^User searched with short name (.+) and extracted the productname$")
	public void user_searched_with_short_name_and_extracted_the_productname(String name) throws InterruptedException {	
		landingPage.getSearch().sendKeys(name);
		Thread.sleep(3000);
	    testContextSetup.landingPageProductName = landingPage.getProductName().getText().split("-")[0].trim();	    
	}
}
