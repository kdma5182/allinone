package testDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepssss {
public static WebDriver driver;

@Given("^I will be on Login page$")
public void i_will_be_on_Login_page() throws Throwable {
  System.setProperty("webdriver.chrome.driver", "C:\\driverrrrrr\\driver9999\\chromedriver.exe");
  driver = new ChromeDriver();
  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
  driver.manage().window().maximize();
  driver.findElement(By.linkText("SignIn")).click();
  System.out.println("User Is On Login Page");
}

@When("^I will enter \"([^\"]*)\" and \"([^\"]*)\"$")
public void i_will_enter_and(String un, String pass) throws Throwable {
   driver.findElement(By.id("userName")).sendKeys(un);
   driver.findElement(By.id("password")).sendKeys(pass);
}

@When("^I will click on Login pagee$")
public void i_will_click_on_Login_pagee() throws Throwable {
    driver.findElement(By.name("Login")).click();
}

@Then("^I should be Logged in Successfully$")
public void i_should_be_Logged_in_Successfully() throws Throwable {
	Assert.assertEquals("Home", driver.getTitle());
	System.out.println("User Is On Home Page");
	driver.close();
}

@Given("^user navigates to testmeapp$")
public void user_navigates_to_testmeapp() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\driverrrrrr\\driver9999\\chromedriver.exe");

    driver = new ChromeDriver();

 driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

 driver.manage().window().maximize();
 driver.findElement(By.linkText("SignIn")).click();
}

@When("^User enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
public void user_enter_Username_as_and_Password_as(String username, String password) throws Throwable {
	 driver.findElement(By.name("userName")).sendKeys(username);

	    driver.findElement(By.name("password")).sendKeys(password);

	       driver.findElement(By.name("Login")).click();
    throw new PendingException();
}

@Given("^User search for Headphone and Lappy$")
public void user_search_for_Headphone_and_Lappy() throws Throwable {
    System.out.print("User search for Headphone and Lappy");
}

@When("^User should type first four letter of desired product as \"([^\"]*)\"$")
public void user_should_type_first_four_letter_of_desired_product_as(String name) throws Throwable {
	 WebElement search = driver.findElement(By.id("myInput"));
	 Thread.sleep(5000);
	 Actions a = new Actions(driver);
	a.keyDown(search,Keys.SHIFT).sendKeys(name).keyUp(Keys.SHIFT).build().perform();
	Thread.sleep(5000);
	a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
	
}

@When("^select the first item that appears in the search result to find product detail$")
public void select_the_first_item_that_appears_in_the_search_result_to_find_product_detail() throws Throwable {
	System.out.print("Product Displayed");
	driver.close();
}




}
