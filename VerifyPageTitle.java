package AdvanceReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;

public class VerifyPageTitle {
	@Test
	public void verifyTitle(){
		ExtentReports extent = new ExtentReports("C:\\Selenium Softwares\\extentreports-java-2.41.2", true);
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium Softwares\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tutorialspoint.com/sql/sql-create-table.htm");
		String Title=driver.getTitle();
		Assert.assertTrue(Title.contains("SQL"));
		
	}

}

