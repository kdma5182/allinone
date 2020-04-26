package test_definationB;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Test_StepsB {
	public static WebDriver driver;

    @Given("^user navigates to testmeapp$")

    public void user_navigates_to_testmeapp() throws Throwable {

       System.setProperty("webdriver.chrome.driver", "C:\\driverrrrrr\\driver9999\\chromedriver.exe");

          driver = new ChromeDriver();

       driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");

       driver.manage().window().maximize();

        driver.findElement(By.linkText("SignIn")).click();

    }

 

    @When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")

    public void i_enter_Username_as_and_Password_as(String username, String password) throws Throwable {

    driver.findElement(By.name("userName")).sendKeys(username);

    driver.findElement(By.name("password")).sendKeys(password);

       driver.findElement(By.name("Login")).click();

    }

 

    @Then("^login should be successful$")

    public void validateRelogin() {

      

       System.out.println(" login was unsuccessful ");

       driver.close(); 

               }

}

