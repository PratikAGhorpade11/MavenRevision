package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.ProductDetailPage;
import pageObjects.ProductListPage;
import pageObjects.RegisterPage;
import pageObjects.ShoppingCartPage;
import utility.UtilClass;

public class StepInOneFile {

	WebDriver driver;
	HomePage homepage_obj ;
	LoginPage loginpage_obj;
	UtilClass util_obj;
	RegisterPage register_obj;
	ProductListPage product_list_obj;
	ProductDetailPage product_detail_obj;
	ShoppingCartPage cart_obj;
	CheckoutPage checkout_obj;
	
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		driver = new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		homepage_obj = new HomePage(driver);
		loginpage_obj = new LoginPage(driver);
		util_obj = new UtilClass(driver);
		register_obj = new RegisterPage(driver);
		product_list_obj = new ProductListPage(driver);
		product_detail_obj = new ProductDetailPage(driver);
		cart_obj = new ShoppingCartPage(driver);
		checkout_obj = new CheckoutPage(driver);
		
	}
	@When("user clicks on Signin")
	public void user_clicks_on_signin() {
		homepage_obj.clickOnSignInLink();
	}
	@When("user enters email as {string} and enters password as {string} and click on login button")
	public void user_enters_email_as_and_enters_password_as_and_click_on_login_button(String email, String password) throws InterruptedException {
		loginpage_obj.enterEmailAddress(email);
		loginpage_obj.enterPassword(password);
		loginpage_obj.clickOnSignInButton();
		
		Thread.sleep(2000);
	}
	@Then("user is logged in successfully")
	public void user_is_logged_in_successfully() {
	    Assert.assertEquals(util_obj.getPageTitle(), "Home Page");
	}
	@Then("user is not logged in")
	public void user_is_not_logged_in() {
		 Assert.assertEquals(util_obj.getPageTitle(), "Customer Login");
	}
	
	//--------------------------------------------------
	@When("user clicks on create an account")
	public void user_clicks_on_create_an_account() {
		homepage_obj.clickOnCreateAccountLink();
	}
	@When("user enters firstname as {string} and enters lastname as {string} and enters email as {string} and enters password as {string} and enter confirm password {string} and click on create an account")
	public void user_enters_firstname_as_and_enters_lastname_as_and_enters_email_as_and_enters_password_as_and_enter_confirm_password_and_click_on_create_an_account(String string, String string2, String string3, String string4, String string5) {
		register_obj.enterNewAccountDetails(string, string2, string3, string4, string5);
	}
	@Then("user get created successfully")
	public void user_get_created_successfully() {
	    
	}
	
	//------------------------------------------------------------------
	

	@When("user clicks on dropdown button")
	public void user_clicks_on_dropdown_button() {
		homepage_obj.clickOnDropdownLink();
	}
	@When("user clicks on Signout link")
	public void user_clicks_on_signout_link() throws InterruptedException {
	  Thread.sleep(2000);
	  homepage_obj.clickOnSignoutLink();
	}
	@Then("User successfully Signout from application")
	public void user_successfully_signout_from_application() {
		 Assert.assertEquals(util_obj.getPageTitle(), "Home Page");
	}
	
	//-----------------------------------------------------------
	@When("user select bags option link from Gear category")
	public void user_select_bags_option_link_from_gear_category() {
		homepage_obj.selectbagsoptionlinkfromGearcategory();
	}
	@When("select any of the product from listing page")
	public void select_any_of_the_product_from_listing_page() {
		product_list_obj.clickOnAnyofTheProduct();
		 
	}
	@When("add to cart and click on shopping cart link and click on proceed to checkout")
	public void add_to_cart_and_click_on_shopping_cart_link_and_click_on_proceed_to_checkout() throws InterruptedException {
		product_detail_obj.clickOnAddToCartButton();
		Thread.sleep(5000);
		cart_obj.clickOnShoppingCartLink();
		cart_obj.clickOnProccedToCheckoutButton();
		Thread.sleep(5000);
		
	}
	@When("fill all necessary details for address and select shipping method and place order")
	public void fill_all_necessary_details_for_address_and_select_shipping_method_and_place_order() throws InterruptedException {
		checkout_obj.clickOnNextButton();
		Thread.sleep(5000);
		checkout_obj.clickOnPlaceOrderButton();
	}
	@Then("user placed order and showing as {string}")
	public void user_placed_order_and_showing_as(String msg) {
	    Assert.assertEquals(checkout_obj.getStatusmsg(), msg);
	}
	
}
