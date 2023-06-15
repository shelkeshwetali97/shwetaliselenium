
package Genreric;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

public class WebGeneric {
	public void verifyURL(WebDriver driver, String expectedURL) {
		String actualURL= driver.getCurrentUrl();
		if(expectedURL.equals(actualURL))
			Reporter.log("page displayed",true);
		else
			Reporter.log("page not displayed",true);
	}	
	public void verifyTitle(WebDriver driver, String expectedTitle) { 
		String actualTitle= driver.getTitle();
		if(expectedTitle.equals(actualTitle))
			Reporter.log("page displayed",true);
		else
			Reporter.log("page not displayed",true);
	}
	
	
	
	
}
