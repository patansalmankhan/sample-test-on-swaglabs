package swaglabspages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.cdimascio.dotenv.Dotenv;

public class Swaglabspages {

	public WebDriver driver;
	public WebDriverWait wait;
	Dotenv dotenv = Dotenv.load();
	
	public Swaglabspages(WebDriver driver) {
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(15));
	}
	
  	
	By verify_login_page = By.xpath("//div[@class=\"login_logo\"]");
	By verify_user_name_field = By.id("user-name");
	By enter_user_name = By.id("user-name");
	By verify_password_field = By.id("password");
	By enter_password = By.id("password");
	By click_on_the_login_btn = By.id("login-button");
	By verify_invalid_crediantials_errore_massge = By.xpath("//h3[@data-test='error']");
	By enter_valid_username = By.id("user-name");
	By enter_valid_password = By.id("password");
	By click_on_the_login_button = By.id("login-button");
	By verify_products_home_page_of_swaglabs = By.xpath("//div[@class=\"app_logo\"]");
	By click_on_the_dropdown_menu = By.xpath("//select[@class='product_sort_container']");
	By verify_all_list_of_dropdwen_menu = By.xpath("//select[@class='product_sort_container']");
	By select_A_to_Z_in_dropdown = By.xpath("//select[@class='product_sort_container']");
	By select_Z_to_A_in_dropdown = By.xpath("//select[@class='product_sort_container']");
	By select_price_low_to_highiable = By.xpath("//select[@class='product_sort_container']");
	By select_price_high_to_low = By.xpath("//select[@class='product_sort_container']");
	By click_on_the_product = By.xpath("//div[normalize-space()='Sauce Labs Fleece Jacket']");
	By verify_product_details = By.xpath("//div[@class='inventory_details_desc_container']");
	By add_to_cart = By.xpath("//button[normalize-space()='ADD TO CART']");
	By click_on_the_cart_icon = By.id("shopping_cart_container");
	By verify_cart_page = By.xpath("//div[@class='subheader']");
	By verify_product_in_cart = By.xpath("//div[@class='cart_list']");
	By varialcick_on_the_checkout_btnble = By.xpath("//a[normalize-space()='CHECKOUT']");
	By verify_checkout_page = By.xpath("//div[@class='subheader']");
	By fill_the_form_first_name = By.id("first-name");
	By fill_the_form_last_name = By.id("last-name");
	By fill_the_form_zip_code = By.id("postal-code");
	By click_on_the_continue_btn = By.xpath("//input[@type=\"submit\"]");
	By verify_checkout_overview_page = By.xpath("(//div[@class='cart_list'])[1]");
	By verify_payment_informationble = By.xpath("//div[normalize-space()='SauceCard #31337']");
	By verify_shiping_informationable = By.xpath("//div[normalize-space()='FREE PONY EXPRESS DELIVERY!']");
	By verify_total_amountiable = By.xpath("//div[@class='summary_total_label']");
	By click_on_the_finish_btn = By.xpath("//a[normalize-space()='FINISH']");
	By verify_finish_page = By.xpath("//div[@class='complete-text']");
	
	
	
public void validate_login_page () throws InterruptedException {
	
	 WebElement logovalidation = driver.findElement(verify_login_page);
	 System.out.println(logovalidation.getText());
	 Thread.sleep(2000);
		
}
	
public void validate_user_name_field () throws InterruptedException {
	
	WebElement usernamefilevalidatElement = driver.findElement(verify_user_name_field);
	if(usernamefilevalidatElement.isDisplayed()) {
		if(usernamefilevalidatElement.isEnabled()) {
			
		}else {
			System.out.println("user name field is not diplayed");
		}
	}else {
		System.out.println("user name is not enabled");
	}

	Thread.sleep(2000);
}
// invalid user name
public void user_enter_user_name () throws InterruptedException {
	
	WebElement enterinvalidusernamElement = driver.findElement(enter_user_name);
	enterinvalidusernamElement.sendKeys(dotenv.get("USER_NAME"));
	String validatevaluse = enterinvalidusernamElement.getAttribute("value");
	System.out.println(validatevaluse);
	
	Thread.sleep(2000);
}

public void validate_password_field () throws InterruptedException {
	
	WebElement validatepasswdfieldElement = driver.findElement(verify_password_field);
	if(validatepasswdfieldElement.isDisplayed()) {
		if(validatepasswdfieldElement.isEnabled()) {
			
		}else {
			System.out.println("passwd field is not displayed");
		}
	}else {
		System.out.println("passwd field is not Enabled");
	}
	Thread.sleep(2000);
}
// invalid passd
public void user_enter_password () throws InterruptedException {
	
	WebElement enterpasswd = driver.findElement(verify_password_field);
	enterpasswd.sendKeys(dotenv.get("PASSWORD"));
	String validatevalue = enterpasswd.getAttribute("value");
	System.out.println(validatevalue);

	Thread.sleep(2000);
}

public void user_click_on_the_login_btn () throws InterruptedException {
	WebElement clicklogbtn = driver.findElement(click_on_the_login_btn);
	clicklogbtn.submit();
	Thread.sleep(2000);
}

public void validate_invalid_crediantials_errore_massgethod () throws InterruptedException {
	String errermgs = driver.findElement(verify_invalid_crediantials_errore_massge).getText();
	
	System.out.println(errermgs);
	Thread.sleep(2000);
}

public void user_enter_valid_username () throws InterruptedException {
	WebElement sendvalidusername = driver.findElement(enter_valid_username);
	sendvalidusername.clear();
	Thread.sleep(1000);
	sendvalidusername.sendKeys(dotenv.get("VALID_USER_NAME"));
	String validateusername = sendvalidusername.getAttribute("value");
	System.out.println(validateusername);
	Thread.sleep(2000);

}

public void user_enter_valid_passwordhod () throws InterruptedException {
	WebElement sendvalidpasswd = driver.findElement(enter_valid_password);
	sendvalidpasswd.clear();
	Thread.sleep(1000);
	sendvalidpasswd.sendKeys(dotenv.get("VALID_PASSWORD"));
	String verifyvalue = sendvalidpasswd.getAttribute("value");
	System.out.println(verifyvalue);
	Thread.sleep(2000);
}


public void user_click_on_the_login_button () throws InterruptedException {
	WebElement loginclick = driver.findElement(click_on_the_login_button);
	loginclick.click();
	

	  // Condition to check if the element is displayed
  
			if (loginclick.isDisplayed()) {
			    // If the element is displayed, handle the alert if it appears
			    try {
			        // Switch to the alert
			        Alert simpleAlert = driver.switchTo().alert();
			        // Print the alert text
			        System.out.println(simpleAlert.getText());
			        // Wait for 2 seconds
			        Thread.sleep(2000);
			        // Accept the alert
			        simpleAlert.accept();
			    } catch (NoAlertPresentException e) {
			        // Handle the case where no alert is present
			        System.out.println("No alert present.");
			        e.printStackTrace();
    			    }


		
		}
			
			
	
	Thread.sleep(2000);
	
}


public void validate_products_home_page_of_swaglabs () throws InterruptedException {
	WebElement productspagevalidate = driver.findElement(verify_products_home_page_of_swaglabs);
	System.out.println(productspagevalidate.getText());
	Thread.sleep(2000);
}

public void user_click_on_the_dropdown_menu () throws InterruptedException {
	
	WebElement dropdounlist = driver.findElement(click_on_the_dropdown_menu);
	dropdounlist.click();
	
	Thread.sleep(1000);
	
}

public void validate_all_list_of_dropdwen_menu () throws InterruptedException {
	WebElement listofdropdoun = driver.findElement(verify_all_list_of_dropdwen_menu);
	Select all_list = new Select(listofdropdoun);
	List<WebElement> allaptionsElements = all_list.getOptions();
	for (WebElement verifylist : allaptionsElements) {
		System.out.println(verifylist.getText());
	}
	Thread.sleep(2000);
}

public void user_select_A_to_Z_in_dropdown () throws InterruptedException {
	
	WebElement a_z = driver.findElement(select_A_to_Z_in_dropdown);
	Select select_a_zSelect = new Select(a_z);
	select_a_zSelect.selectByValue("az");
	String selectedoption1 = select_a_zSelect.getFirstSelectedOption().getText();
	System.out.println(selectedoption1);
	
	Thread.sleep(2000);
	
}

public void user_select_Z_to_A_in_dropdown () throws InterruptedException {
	WebElement z_a = driver.findElement(select_Z_to_A_in_dropdown);
	Select select_z_a = new Select(z_a);
	select_z_a.selectByValue("za");
	String selectoption2 = select_z_a.getFirstSelectedOption().getText();
	System.out.println(selectoption2);
	
	Thread.sleep(2000);
	
}

public void user_select_price_low_to_high () throws InterruptedException {
	WebElement low_to_high = driver.findElement(select_price_low_to_highiable);
	Select select_low_to_high = new Select(low_to_high);
	select_low_to_high.selectByValue("lohi");
	String selectoption3 = select_low_to_high.getFirstSelectedOption().getText();
	System.out.println(selectoption3);
	Thread.sleep(2000);
	
}

public void user_select_price_high_to_low () throws InterruptedException {
	WebElement high_to_loW = driver.findElement(select_price_high_to_low);
	Select select_high_to_low = new Select(high_to_loW);
	select_high_to_low.selectByValue("hilo");
	String selectoption4 = select_high_to_low.getFirstSelectedOption().getText();
	System.out.println(selectoption4);
	
	Thread.sleep(2000);
	
	}

public void user_click_on_the_product () throws InterruptedException {
	
	WebElement clickonproduct = driver.findElement(click_on_the_product);
	clickonproduct.click();
	
	Thread.sleep(2000);
	
}

public void validate_product_details () throws InterruptedException {
	
	WebElement validateproductdetails = driver.findElement(verify_product_details);
	System.out.println(validateproductdetails.getText());
	
	Thread.sleep(2000);
	
}
public void product_add_to_cart () throws InterruptedException {
	
	WebElement clicktocart = driver.findElement(add_to_cart);
	clicktocart.click();
	
	Thread.sleep(1000);
	
	driver.navigate().back();
	
	Thread.sleep(2000);
	
}

public void user_click_on_the_cart_icon () throws InterruptedException {
	WebElement clickcarticon = driver.findElement(click_on_the_cart_icon);
	clickcarticon.click();
	
	Thread.sleep(2000);
	
}

public void verify_cart_page () throws InterruptedException {
	WebElement cartpageverify = driver.findElement(verify_cart_page);
	System.out.println(cartpageverify.getText());
	
	Thread.sleep(2000);
	
}
public void validate_product_in_cart () throws InterruptedException {
	WebElement verifycartproducts = driver.findElement(verify_product_in_cart);
	System.out.println(verifycartproducts.getText());
	Thread.sleep(1000);
	
}

public void user_click_on_the_checkout_btn () throws InterruptedException {
	WebElement checkout = driver.findElement(varialcick_on_the_checkout_btnble);
	checkout.click();
	Thread.sleep(1000);
	
}

public void validate_checkout_page () throws InterruptedException {
	WebElement verifycheckout = driver.findElement(verify_checkout_page);
	System.out.println(verifycheckout.getText());
	Thread.sleep(1000);
	
}

public void fill_the_form_with_valide_details () throws InterruptedException {
	
	// verify fistname field
	WebElement verifyfirstnamefield = driver.findElement(fill_the_form_first_name);
	if(verifyfirstnamefield.isDisplayed()) {
		if(verifyfirstnamefield.isDisplayed()) {
			
		}else {
			System.out.println("fist name fied is not displayed");
		}
	}else {
		System.out.println("first name field is not enabled");
	}
	
	Thread.sleep(2000);
	
	// enter first name in field
	verifyfirstnamefield.sendKeys(dotenv.get("FIRST_NAME"));
	String verifyvaluestore =verifyfirstnamefield.getAttribute("value");
	System.out.println(verifyvaluestore);
	
	Thread.sleep(2000);
	
	// verify last name field
	
	WebElement verifylastnamefield = driver.findElement(fill_the_form_last_name);
	if (verifylastnamefield.isDisplayed()) {
		if(verifylastnamefield.isEnabled()) {
			
		}else {
			System.out.println("last name field is not displayed");
		}
	}else {
		System.out.println("last name field is not enabled");
	}
	
	Thread.sleep(2000);
	
	// enter last name in field
	
	verifylastnamefield.sendKeys(dotenv.get("LAST_NAME"));
	String verifylastnamevaluestore = verifylastnamefield.getAttribute("value");
	System.out.println(verifylastnamevaluestore);
	
	Thread.sleep(2000);
	
	// verify zip or postal code 
	
	WebElement verifyzipcod = driver.findElement(fill_the_form_zip_code);
	if (verifyzipcod.isDisplayed()) {
		if(verifyzipcod.isEnabled()) {
			
		}else {
			System.out.println("zip code is not displayed");
		}
	}else {
		System.out.println("zip code is not enabled");
	}
	Thread.sleep(2000);
	
	// enter zip or postal code
	
	verifyzipcod.sendKeys(dotenv.get("ZIP_CODE"));
	String verifyzipcodestore = verifyzipcod.getAttribute("value");
	System.out.println(verifyzipcodestore);
	Thread.sleep(1000);
	
}

public void user_click_on_the_continue_btn () throws InterruptedException {
	
	WebElement clickcontinu = driver.findElement(click_on_the_continue_btn);
	clickcontinu.click();
	Thread.sleep(1000);
	
}

public void validate_checkout_overview_page () throws InterruptedException {
	WebElement verifyoverview = driver.findElement(verify_checkout_overview_page);
	System.out.println(verifyoverview.getText());
	Thread.sleep(1000);
	
}

public void validate_payment_information () throws InterruptedException {
	WebElement verifypayments = driver.findElement(verify_payment_informationble);
	System.out.println(verifypayments.getText());
	Thread.sleep(1000);
	
}

public void validate_shiping_informationhod () throws InterruptedException {
	WebElement verifyshiping = driver.findElement(verify_shiping_informationable);
	System.out.println(verifyshiping.getText());
	Thread.sleep(1000);
	
}

public void validate_total_amount () throws InterruptedException {
	WebElement verifyamount = driver.findElement(verify_total_amountiable);
	System.out.println(verifyamount.getText());
	Thread.sleep(1000);
	
}

public void user_click_on_the_finish_btn () throws InterruptedException {
	WebElement clicktofinish = driver.findElement(click_on_the_finish_btn);
	clicktofinish.click();
	Thread.sleep(1000);
	
}

public void validate_finish_page () throws InterruptedException {
	WebElement verifyfinishpag = driver.findElement(verify_finish_page);
	System.out.println(verifyfinishpag.getText());
	Thread.sleep(1000);
	
}

public void browser_quite() {
		driver.close();
}


	
	
}
