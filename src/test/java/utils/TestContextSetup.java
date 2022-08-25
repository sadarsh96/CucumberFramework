package utils;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import pageObject.PageObjectManager;

public class TestContextSetup {
	public WebDriver driver;
	public TestBase testBase;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public GenericUtils genericUtils;
	
	public TestContextSetup() throws IOException {
		testBase = new TestBase();
		//this.driver= testBase.webDriverManager();
		genericUtils = new GenericUtils(testBase.webDriverManager());
		pageObjectManager = new PageObjectManager(testBase.webDriverManager());
		
	}

}
