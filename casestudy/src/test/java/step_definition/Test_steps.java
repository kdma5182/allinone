package step_definition;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	static WebDriver driver;
	@Given("User is on Home Page")
	public void user_is_on_Home_Page() {
		System.setProperty("webdriver.chrome.driver", "C://driver9999//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost:8099/TestMeApp");
		String str5=  driver.getTitle();
		System.out.println(str5);
		//Assert.assertEquals(str5,"Home" );
 
	}

	@When("User Navigate to LogIn Page")
	public void user_Navigate_to_LogIn_Page() {
		driver.findElement(By.linkText("SignIn")).click();
		String str1=  driver.getTitle();
		System.out.println(str1);
		//Assert.assertEquals(str1,"Login" );  
	}

	@When("User enters UserName and Password")
	public void user_enters_UserName_and_Password() {
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		driver.findElement(By.name("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	}

	@Then("Message displayed Login Successfully")
	public void message_displayed_Login_Successfully() throws Exception {
		String str2=  driver.getTitle();
		System.out.println(str2);
	
		Thread.sleep(3000);
	}

	@When("User Logout from the Application")
	public void user_Logout_from_the_Application() {
		driver.findElement(By.linkText("SignOut")).click();
		//driver.findElement(By.xpath("//*[@id='header']/div[1]/div/div/div[2]/div/ul/a)")).click();
	}

	@Then("Message displayed Logout Successfully")
	public void message_displayed_Logout_Successfully() {
		System.out.println("LogOut Successfully");
	}

}
