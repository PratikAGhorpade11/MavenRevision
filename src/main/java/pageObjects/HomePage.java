package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Obj repo --------------------
	private By sign_in_link = By.xpath("(//a[contains(text(),'Sign In')])[1]");
	private By create_account_link = By.xpath("//a[text()='Create an Account']");
	private By dropdown_link = By.xpath("//button[@class='action switch']");
	private By signout_link = By.xpath("//li[@class='authorization-link']");
	

	
	//---------------- Action methods --------------

	public void clickOnSignInLink()
	{
		driver.findElement(sign_in_link).click();
	}
	
	public void clickOnCreateAccountLink()
	{
		driver.findElement(create_account_link).click();
	}
	
	public void clickOnDropdownLink()
	{
		driver.findElement(dropdown_link).click();
	}
	
	public void clickOnSignoutLink()
	{
		driver.findElement(signout_link).click();
	}
	
	@FindBy(xpath="//span[contains(text(),'Gear')]")
	private WebElement gear_category;
	
	@FindBy(xpath="//a[@id='ui-id-25']")
	private WebElement bag_option;
	
	public void selectbagsoptionlinkfromGearcategory()
	{
		Actions act = new Actions(driver);
		act.moveToElement(gear_category).build().perform();
		bag_option.click();
	}
	
}
