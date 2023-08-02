package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	private WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Obj repo --------------------
	private By next_btn = By.xpath("//span[contains(text(),'Next')]");
	private By place_order_btn = By.xpath("//span[contains(text(),'Place Order')]");
	private By status_msg = By.xpath("//span[contains(text(),'Thank you for your purchase!')]");
	

	
	//---------------- Action methods --------------

	public void clickOnNextButton()
	{
		driver.findElement(next_btn).click();
	}
	public void clickOnPlaceOrderButton()
	{
		driver.findElement(next_btn).click();
	}
	
	public String getStatusmsg()
	{
		return driver.findElement(status_msg).getText();
	}
}
