package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {

	private WebDriver driver;
	public RegisterPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//-----------------Obj repo --------------------
	private By fisrtname_txtbox = By.xpath("//input[@id='firstname']");
	private By lastname_txtbox = By.xpath("//input[@id='lastname']");
	private By email_txtbox = By.xpath("//input[@id='email_address']");
	private By password_txtbox = By.xpath("//input[@id='password']");
	private By confirmpassword_txtbox = By.xpath("//input[@id='password-confirmation']");
	private By createaccount_btn = By.xpath("//span[text()='Create an Account']");
	
	//---------------- Action methods --------------

	public void enterNewAccountDetails(String firstname,String lastname,String email, String password , String confirmpassword)
	{
		driver.findElement(fisrtname_txtbox).sendKeys(firstname);
		driver.findElement(lastname_txtbox).sendKeys(lastname);
		driver.findElement(email_txtbox).sendKeys(email);
		driver.findElement(password_txtbox).sendKeys(password);
		driver.findElement(confirmpassword_txtbox).sendKeys(confirmpassword);
		driver.findElement(createaccount_btn).click();
	}
	
}
