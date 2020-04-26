package Test_defination;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testcase1 {
		public static WebDriver driver;
		@Given("^User is on home page$")
		public void user_is_on_home_page() throws Throwable {
			System.setProperty("webdriver.chrome.driver", "C:\\\\driverrrrrr\\\\driver9999\\\\chromedriver.exe");

	        driver = new ChromeDriver();

	     driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

	     driver.manage().window().maximize();
		}

		@Given("^User Navigate to SignUP Page$")
		public void user_Navigate_to_SignUP_Page() throws Throwable {
			driver.findElement(By.linkText("SignUp")).click(); 
		}
		@When("^User enter Username as \"([^\"]*)\", Firstname as \"([^\"]*)\", LastName as \"([^\"]*)\" and Password as \"([^\"]*)\", RePassword as \"([^\"]*)\", Gender as \"([^\"]*)\" , Email as \"([^\"]*)\", MobileNumber as \"([^\"]*)\", DOB as \"([^\"]*)\", Address as \"([^\"]*)\", securityQuestion as \"([^\"]*)\", Answer as \"([^\"]*)\"$")
		public void user_enter_Username_as_Firstname_as_LastName_as_and_Password_as_RePassword_as_Gender_as_Email_as_MobileNumber_as_DOB_as_Address_as_securityQuestion_as_Answer_as(String username, String firstname, String lastname, String password, String repass, int gender, String email, String mobilenumber, String dob, String address, String question, String answer) throws Throwable {
			 driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys(username);
			   driver.findElement(By.id("firstName")).sendKeys(firstname);
			   driver.findElement(By.id("lastName")).sendKeys(lastname);
			   driver.findElement(By.id("password")).sendKeys(password);
			   driver.findElement(By.id("pass_confirmation")).sendKeys(repass);
			   java.util.List<WebElement> allRadioButtons = driver.findElements(By.name("gender"));
			   allRadioButtons.get(gender).click();
			   driver.findElement(By.id("emailAddress")).sendKeys(email);
			   driver.findElement(By.id("mobileNumber")).sendKeys(mobilenumber);
			   driver.findElement(By.id("dob")).sendKeys(dob);
			   driver.findElement(By.id("address")).sendKeys(address);
			   WebElement dropdown=driver.findElement(By.name("securityQuestion"));
			   Select s=new Select(dropdown);
			   s.selectByVisibleText(question);
			   driver.findElement(By.id("answer")).sendKeys(answer);
			   driver.findElement(By.xpath("/html/body/main/div/div/form/fieldset/div/div[13]/div/input[1]")).click();
		}
		@Then("^Message displayed Registration Successfully$")
		public void message_displayed_Registration_Successfully() throws Throwable {
			System.out.println("User is Successfully Register");
		}
}


