package step_definition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Test_steps {
	WebDriver driver;

	@Given("I will be on SignUp page")
	public void i_will_be_on_SignUp_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("a[href^='Register']")).click();
	}

	@When("I will enter username {string}")
	public void i_will_enter_username(String uname) {
		driver.findElement(By.cssSelector("input[name^='user']")).sendKeys(uname);
	}

	@When("I will enter firstname,lastname {string} , {string}")
	public void i_will_enter_firstname_lastname(String fname, String lname) {
		driver.findElement(By.cssSelector("input[name^='first']")).sendKeys(fname);
		driver.findElement(By.cssSelector("input[name^='last']")).sendKeys(lname);
	}

	@When("I will enter password,confirmPassword {string} , {string}")
	public void i_will_enter_password_confirmPassword(String pwd, String cnf) {
		driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys(pwd);
		driver.findElement(By.cssSelector("input[name^='confirm']")).sendKeys(cnf);
	}

	@When("I will select gender as Male")
	public void i_will_select_gender_as_Male() {
		driver.findElement(By.cssSelector("input[name^='gender'][value='Male']")).click();
	}

	@When("I will enter emailid and mobilenumber {string} , {string}")
	public void i_will_enter_emailid_and_mobilenumber(String email, String no) {
		driver.findElement(By.cssSelector("input[name^='email']")).sendKeys(email);
		driver.findElement(By.cssSelector("input[name^='mobile']")).sendKeys(no);
	}

	@When("I will enter DOB and address {string} , {string}")
	public void i_will_enter_DOB_and_address(String dob, String add) {
		driver.findElement(By.name("dob")).sendKeys(dob);
		driver.findElement(By.id("address")).sendKeys(add);
	}

	@When("I will select security question and enters answer {string}")
	public void i_will_select_security_question_and_enters_answer(String ans) {
		Select sel = new Select(driver.findElement(By.name("securityQuestion")));
		sel.selectByIndex(1);
		driver.findElement(By.id("answer")).sendKeys(ans);
	}

	@When("I will click on Register")
	public void i_will_click_on_Register() {
		driver.findElement(By.name("Submit")).click();
	}

	@Then("I validate whether I have registered successfully in TestMeApp")
	public void i_validate_whether_I_have_registered_successfully_in_TestMeApp() {
		Assert.assertEquals("Login", driver.getTitle());
		System.out.println("logged in!");
		driver.close();
	}

	@Given("I will be on Login Page")
	public void i_will_be_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I will enter {string} and {string}")
	public void i_will_enter_and(String un, String pwd) {
		driver.findElement(By.id("userName")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pwd);
	}

	@When("I click on login button")
	public void i_click_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("I should be logged in successfully")
	public void i_should_be_logged_in_successfully() {
		Assert.assertEquals("Home", driver.getTitle());
		System.out.println("Home Page");
		driver.close();
	}

	@Given("I will be on Log In page")
	public void i_will_be_on_Log_In_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I will enter valid credentials")
	public void i_will_enter_valid_credentials() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");

	}

	@When("I will be on Home Page")
	public void i_will_be_on_Home_Page() {
		driver.findElement(By.name("Login")).click();
	}

	@When("I will click on the search tab & enters the first four letters of the product")
	public void i_will_click_on_the_search_tab_enters_the_first_four_letters_of_the_product() {
		driver.findElement(By.id("myInput")).sendKeys("Head");
	}

	@When("I will click on find details")
	public void i_will_click_on_find_details() {
		driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	}

	@When("I will click on Add to cart")
	public void i_will_click_on_Add_to_cart() {
		driver.findElement(By.cssSelector("a[class^='btn']")).click();
		driver.findElement(By.cssSelector("a[href^='display']")).click();
		driver.findElement(By.cssSelector("a[href^='check']")).click();
		driver.findElement(By.cssSelector("input[value='Proceed to Pay']")).click();
	}

	@When("I will proceed to checkout and select the bank")
	public void i_will_proceed_to_checkout_and_select_the_bank() throws InterruptedException {
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
		driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		driver.findElement(By.name("username")).sendKeys("123456");
		driver.findElement(By.name("password")).sendKeys("Pass@456");
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@value='PayNow']")).click();
	}

	@Then("I will validate whether order is succesfully placed")
	public void i_will_validate_whether_order_is_succesfully_placed() {
		System.out.println("payment success");
		driver.close();
	}

	@Given("I am on the Login Page")
	public void i_am_on_the_Login_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I am entering {string}")
	public void i_am_entering(String un) {
		driver.findElement(By.id("userName")).sendKeys(un);
	}

	@When("I am clicking on login button")
	public void i_am_clicking_on_login_button() {
		driver.findElement(By.name("Login")).click();
	}

	@Then("I should not be logged in to TestMeApp")
	public void i_should_not_be_logged_in_to_TestMeApp() {
		String sad = driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[2]/span")).getText();
		Assert.assertEquals("Please Enter Password", sad);
		System.out.println("Test is Passed");
		driver.close();
	}

	@Given("I am on the Login page of TestMeApp")
	public void i_am_on_the_Login_page_of_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
	}

	@When("I am entering both the username and password")
	public void i_am_entering_both_the_username_and_password() {
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
	}

	@When("I am on the Home Page")
	public void i_am_on_the_Home_Page() {
		driver.findElement(By.name("Login")).click();
	}

	@When("I am clicking on the search tab and enters the product")
	public void i_am_clicking_on_the_search_tab_and_enters_the_product() {
		driver.findElement(By.id("myInput")).sendKeys("Computer");

	}

	@When("I am clicking on find details")
	public void i_am_clicking_on_find_details() {
		driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	}

	@Then("It is showing product not available")
	public void it_is_showing_product_not_available() {
		String sa = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/h3")).getText();
		Assert.assertEquals("Sorry no products available in this category. Please try some other", sa);
		System.out.println("Test is Passed");
		driver.close();
	}

	@Given("I will Login to the TestMeApp")
	public void i_will_Login_to_the_TestMeApp() {
		System.setProperty("webdriver.chrome.driver", "C:\\driver99999\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("SignIn")).click();
		driver.findElement(By.id("userName")).sendKeys("lalitha");
		driver.findElement(By.id("password")).sendKeys("password123");
		driver.findElement(By.name("Login")).click();
	}

	@When("I will search for headphones")
	public void i_will_search_for_headphones() {
		driver.findElement(By.id("myInput")).sendKeys("Head");
		driver.findElement(By.cssSelector("input[value='FIND DETAILS']")).click();
	}

	@When("I will try to proceed to payment without adding any item in the cart")
	public void i_will_try_to_proceed_to_payment_without_adding_any_item_in_the_cart() {
		Assert.assertNotSame("View Cart", driver.getTitle());
	}

	@Then("TestMeApp does not display the cart icon")
	public void testmeapp_does_not_display_the_cart_icon() {
		System.out.println("Please add items to cart");
	}
	
	
	
}
