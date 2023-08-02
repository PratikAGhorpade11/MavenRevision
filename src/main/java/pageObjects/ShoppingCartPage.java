package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {

	private WebDriver driver;
	public ShoppingCartPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Obj repo --------------------
	private By shopping_cart_link = By.xpath("//a[@class='action showcart']");
	private By procced_to_checkout_btn = By.xpath("//button[@id='top-cart-btn-checkout']");
	

	
	//---------------- Action methods --------------

	public void clickOnShoppingCartLink()
	{
		driver.findElement(shopping_cart_link).click();
	}
	
	public void clickOnProccedToCheckoutButton()
	{
		driver.findElement(procced_to_checkout_btn).click();
	}
}
