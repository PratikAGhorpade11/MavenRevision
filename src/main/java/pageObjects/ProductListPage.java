package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductListPage {

	private WebDriver driver;
	public ProductListPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//-----------------Obj repo --------------------
	private By product_link = By.xpath("(//li[@class='item product product-item'])[1]");
	
	
	//---------------- Action methods --------------

	public void clickOnAnyofTheProduct()
	{
		driver.findElement(product_link).click();
	}
	
}
