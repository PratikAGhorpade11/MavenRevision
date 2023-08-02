package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailPage {

	private WebDriver driver;
	public ProductDetailPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Obj repo --------------------
	private By addtocart_btn = By.xpath("//button[@id='product-addtocart-button']");
	
	

	
	//---------------- Action methods --------------

	public void clickOnAddToCartButton()
	{
		driver.findElement(addtocart_btn).click();
	}
}
