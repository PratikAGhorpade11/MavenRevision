package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	private WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//-----------------Obj repo --------------------
	private By email_txtbox = By.xpath("//input[@id='email']");
	private By password_txtbox = By.xpath("(//input[@id='pass'])[1]");
	private By sign_in_btn = By.xpath("(//button[@id='send2'])[1]");
	
	//---------------- Action methods --------------

	public void enterEmailAddress(String email)
	{
		driver.findElement(email_txtbox).sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(password_txtbox).sendKeys(password);
	}
	
	public void clickOnSignInButton()
	{
		driver.findElement(sign_in_btn).click();
	}
	
	
	
}
