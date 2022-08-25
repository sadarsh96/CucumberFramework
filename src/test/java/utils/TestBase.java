package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public WebDriver driver;
	public WebDriver webDriverManager() throws IOException {
		
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String url = prop.getProperty("url");
		String browser_properties = prop.getProperty("browser");
		String browser_maven= System.getProperty("browser");
		String browser = browser_maven!=null ? browser_maven : browser_properties;
		
		if(driver == null){
			if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().avoidBrowserDetection().setup(); 
			    driver = new FirefoxDriver();
					}
			else if(browser.equalsIgnoreCase("IE")) {
				WebDriverManager.iedriver().setup();
			    driver = new InternetExplorerDriver();
					}
			else if (browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
			    driver = new EdgeDriver();
					}
	    driver.get(url);
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		return driver;
	}

}
