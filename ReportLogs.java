package logsInTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReportLogs {
	 @Test
	    public void testReport(){
		    System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
	        
	        WebDriver driver=new FirefoxDriver();
	        
	        Reporter.log("Browser Opened");
	        
	        driver.manage().window().maximize();
	        
	        Reporter.log("Browser Maximized");
	        
	        driver.get("http://www.google.com");
	        
	        Reporter.log("Application started");
	        
	        driver.quit();
	        
	        Reporter.log("Application closed");
	        
	    }
}
