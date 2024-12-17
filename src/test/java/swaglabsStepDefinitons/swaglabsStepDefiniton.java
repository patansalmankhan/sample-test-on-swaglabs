package swaglabsStepDefinitons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.cdimascio.dotenv.Dotenv;
import swaglabspages.Swaglabspages;

public class swaglabsStepDefiniton {
	
	public WebDriver driver;
	Dotenv dotenv = Dotenv.load();
	Swaglabspages swag;
	
	
	
	


	@Given("enter url of swaglabs login page")
	public void enter_url_of_swaglabs_login_page() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		swag = new Swaglabspages(driver);
		String url = dotenv.get("BASE_URL_OF_SWAGLABS");
		driver.get(url);
		
	    
	}

	@Then("verify login page")
	public void verify_login_page() throws InterruptedException {
		swag. validate_login_page ();
	  
	}

	@When("verify user name field")
	public void verify_user_name_field() throws InterruptedException {
		swag.validate_user_name_field  ();
	   
	}

	@Then("enter user name")
	public void enter_user_name() throws InterruptedException {
		swag. user_enter_user_name ();

	}

	@When("verify password field")
	public void verify_password_field() throws InterruptedException {
		swag.validate_password_field  ();
	   
	}

	@Then("enter password")
	public void enter_password() throws InterruptedException {
		swag.user_enter_password();
	    
	}

	@When("click on the login btn")
	public void click_on_the_login_btn() throws InterruptedException {
		swag. user_click_on_the_login_btn ();
	   
	}

	@Then("verify invalid crediantials errore massge")
	public void verify_invalid_crediantials_errore_massge() throws InterruptedException {
		swag. validate_invalid_crediantials_errore_massgethod ();
	    
	}

	@When("enter valid username")
	public void enter_valid_username() throws InterruptedException {
		swag. user_enter_valid_username ();
	    
	}

	@Then("enter valid password")
	public void enter_valid_password() throws InterruptedException {
		swag. user_enter_valid_passwordhod ();
	   
	}

	@Then("click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		swag. user_click_on_the_login_button ();
	 
	}

	@Then("verify products home page of swaglabs")
	public void verify_products_home_page_of_swaglabs() throws InterruptedException {
		swag. validate_products_home_page_of_swaglabs ();
	 
	}

	@When("click on the dropdown menu")
	public void click_on_the_dropdown_menu() throws InterruptedException {
		swag.user_click_on_the_dropdown_menu  ();
	  
	}

	@Then("verify all list of dropdwen menu")
	public void verify_all_list_of_dropdwen_menu() throws InterruptedException {
		swag. validate_all_list_of_dropdwen_menu ();
	  
	}

	@Then("select A to Z in dropdown")
	public void select_a_to_z_in_dropdown() throws InterruptedException {
		swag.  user_select_A_to_Z_in_dropdown();
	
	}

	@Then("select Z to A in dropdown")
	public void select_z_to_a_in_dropdown() throws InterruptedException {
		swag.  user_select_Z_to_A_in_dropdown();
	    
	}

	@Then("select price low to high")
	public void select_price_low_to_high() throws InterruptedException {
		swag. user_select_price_low_to_high ();
	  
	}

	@Then("select price high to low")
	public void select_price_high_to_low() throws InterruptedException {
		swag. user_select_price_high_to_low ();
	   
	}

	@Then("click on the product")
	public void click_on_the_product() throws InterruptedException {
		swag.  user_click_on_the_product();
	   
	}

	@Then("verify product details")
	public void verify_product_details() throws InterruptedException {
		swag. validate_product_details ();
	   
	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		swag. product_add_to_cart ();
	    
	}

	@When("click on the cart icon")
	public void click_on_the_cart_icon() throws InterruptedException {
		swag. user_click_on_the_cart_icon ();
	    
	}

	@Then("verify cart page")
	public void verify_cart_page() throws InterruptedException {
		swag. verify_cart_page ();
	   
	}

	@Then("verify product in cart")
	public void verify_product_in_cart() throws InterruptedException {
		swag. validate_product_in_cart ();
	    
	}

	@Then("lcick on the checkout btn")
	public void lcick_on_the_checkout_btn() throws InterruptedException {
		swag. user_click_on_the_checkout_btn ();
	  
	}

	@Then("verify checkout page")
	public void verify_checkout_page() throws InterruptedException {
		swag. validate_checkout_page ();
	   
	}

	@Then("fill the form")
	public void fill_the_form() throws InterruptedException {
		swag. fill_the_form_with_valide_details ();
	}

	@Then("click on the continue btn")
	public void click_on_the_continue_btn() throws InterruptedException {
		swag. user_click_on_the_continue_btn ();
	   
	}

	@Then("verify checkout overview page")
	public void verify_checkout_overview_page() throws InterruptedException {
		swag. validate_checkout_overview_page ();
	   
	}

	@Then("verify payment information")
	public void verify_payment_information() throws InterruptedException {
		swag.  validate_payment_information();
	   
	}

	@Then("verify shiping information")
	public void verify_shiping_information() throws InterruptedException {
		swag. validate_shiping_informationhod ();
	   
	}

	@Then("verify total amount")
	public void verify_total_amount() throws InterruptedException {
		swag. validate_total_amount ();
	   
	}

	@Then("click on the finish btn")
	public void click_on_the_finish_btn() throws InterruptedException {
		swag. user_click_on_the_finish_btn ();
	   
	}

	@Then("verify finish page")
	public void verify_finish_page() throws InterruptedException {
		swag. validate_finish_page ();
	    
	}

	@Then("close the browser")
	public void close_the_browser() {
		swag. browser_quite ();
	   
	}
	

}
