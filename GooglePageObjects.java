package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePageObjects {
	
	public GooglePageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	}
 @FindBy(id="lst-ib")
	public WebElement txtsearch;
 @FindBy(name="btnK")
  public WebElement btnSearch;
}
