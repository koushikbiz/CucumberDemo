package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
	
	public static WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable {
		System.setProperty("webdriver.gecko.driver","C:/Users/Me/Downloads/geckodriver-v0.20.1-win64/geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);	  
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	
	@When("^I enter valid user name and valid password$")
	public void I_enter_valid_user_name_and_valid_password() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("koushikbiz@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("koushikbiz@gmail.com");		
	}
	
	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
		driver.findElement(By.id("loginbutton")).click();		
	}
	
	@Then("^application should be closed$")
	public void application_should_be_closed() throws Throwable {
	    driver.quit();
	}

}
