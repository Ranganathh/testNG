package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchTest {

	
	public static void main(String[] args) {
		
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		
		GooglePageObjects page=new GooglePageObjects(driver);
		
		//Search for selenium in text box
		
	page.txtsearch.sendKeys("Selenium");
	 
	  // Click Search button
	
	page.btnSearch.click();

	}

}
