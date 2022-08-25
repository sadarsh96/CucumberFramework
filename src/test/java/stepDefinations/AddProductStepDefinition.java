package stepDefinations;

import io.cucumber.java.en.*;
import pageObject.AddProductPage;
import utils.TestContextSetup;

public class AddProductStepDefinition {
	TestContextSetup testContextSetup;
	AddProductPage addProductPage;
	public AddProductStepDefinition(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		addProductPage= testContextSetup.pageObjectManager.getAddProductPage();
	}
	 
	 @When("User adds {string} items")
	 public void user_adds_items(String item) {
		 int itemCount = Integer.parseInt(item);
	        addProductPage.addItem(itemCount);
	 }

	}

	

