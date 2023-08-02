package utility;

import org.openqa.selenium.WebDriver;

public class UtilClass {
	
	private WebDriver driver;
	public UtilClass(WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}

}
