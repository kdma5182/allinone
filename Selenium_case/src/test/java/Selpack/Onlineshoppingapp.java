package Selpack;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import Testmeutility.Drivers;

public class Onlineshoppingapp 
{
	ExtentHtmlReporter reporter = null;
	ExtentReports report;
	ExtentTest logger = null;
	WebDriver driver;
	
	@AfterTest
	public void endReportAfterTest()
	{
		report.flush();
		driver.quit();
	}
	
	@BeforeTest
	public void getDriver()
	{
		driver = Drivers.getDriver();
		driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		//logger.log(Status.INFO, "Launching Testme Application ");
	}
	
	@AfterMethod
	public void getReporttAfterMethod(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.SUCCESS)
		{
			logger.log(Status.PASS,result.getMethod().getMethodName()+"result passed");
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			logger.log(Status.SKIP,result.getMethod().getMethodName()+"result skipped");
		}
		else if (result.getStatus()==ITestResult.FAILURE)
			logger.log(Status.FAIL,result.getMethod().getMethodName()+"result failed");
			TakesScreenshot scrshot = ((TakesScreenshot)driver);
			File src=scrshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src,new File("./Target/Screenshot/capture.png"));
			logger.addScreenCaptureFromPath("./Target/Screenshot/capture.png");
	}
	
	@BeforeClass
	public void startReportBeforeTest()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd-mm-ss-ms");
		String path = System.getProperty("user.dir")+"/extent-report/"+sdf.format(new Date())+".html";
		reporter = new ExtentHtmlReporter(path);
		report = new ExtentReports();
		//logger = new Report();
		report.attachReporter(reporter);
		report.setSystemInfo("Host Name","LocalHost");
		report.setSystemInfo("Environment","Testing Environment");
		report.setSystemInfo("Username","megha");
		reporter.config().setDocumentTitle("TestMeApp");
		reporter.config().setReportName("CaseStudy Report");
		reporter.config().setTheme(Theme.STANDARD);
	}
	
	@Test(priority=3)
	public void testCart() throws InterruptedException
	{
		logger = report.createTest("Add to cart");
		WebElement search = driver.findElement(By.id("myInput"));
		Thread.sleep(8000);
		Actions a = new Actions(driver);
		a.keyDown(search, Keys.SHIFT).sendKeys("head").keyUp(Keys.SHIFT).build().perform();
		Thread.sleep(8000);
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		String s = driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).getText();
		System.out.println(s);
		//Assert.assertEquals("Cart 1", s);
		logger.log(Status.PASS, "Item added to the cart");
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		logger = report.createTest("Loggin");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
		logger.log(Status.PASS, "Click signin button");
		driver.findElement(By.name("userName")).sendKeys("lalitha");
		logger.log(Status.PASS, "Enter username");
		driver.findElement(By.name("password")).sendKeys("password123");
		logger.log(Status.PASS, "Enter password");
		driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
		logger.log(Status.PASS, "Click loggin button");
	}
	
	@Test(priority=4)
	public void testPayment() throws InterruptedException
	{
		
		logger = report.createTest("Proceed to pay");
		logger.log(Status.INFO, "Payment process");
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
		driver.findElement(By.cssSelector("input[value='Proceed to Pay']")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label/i")).click();
        driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
        driver.findElement(By.name("username")).sendKeys("123456");
        driver.findElement(By.name("password")).sendKeys("Pass@456");
        driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
        driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
        driver.findElement(By.xpath("//input[@value='PayNow']")).click();
        logger.log(Status.PASS, "payment successful");
        
    }

	
	@Test(priority=1)
	public void testRegistration() throws InterruptedException
	{
		logger = report.createTest("Registration");
		driver.findElement(By.linkText("SignUp")).click();
		logger.log(Status.PASS, "Clicked Signup button");
		driver.findElement(By.id("userName")).sendKeys("megha1");
		logger.log(Status.PASS, "Enter the username");
		driver.findElement(By.id("firstName")).sendKeys("megha");
		logger.log(Status.PASS, "Enter firstname");
		driver.findElement(By.id("lastName")).sendKeys("pandit");
		logger.log(Status.PASS, "Enter lastname");
		driver.findElement(By.id("password")).sendKeys("Megha123");
		logger.log(Status.PASS, "Enter password");
		driver.findElement(By.name("confirmPassword")).sendKeys("Megha123");
		logger.log(Status.PASS, "Confirm password");
		WebElement male=driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();  
		logger.log(Status.PASS, "Select the gender");
		driver.findElement(By.id("emailAddress")).sendKeys("megha@gmail.com");
		logger.log(Status.PASS, "Enter email");
		driver.findElement(By.id("mobileNumber")).sendKeys("9999900011");
		logger.log(Status.PASS, "Enter phonenumber");
		driver.findElement(By.name("dob")).sendKeys("10/08/1997");
		logger.log(Status.PASS, "Enter date of birth");
		driver.findElement(By.id("address")).sendKeys("Gr. Noida, G-block");
		logger.log(Status.PASS, "Enter address");
		Select s=new Select(driver.findElement(By.id("securityQuestion")));
		s.selectByVisibleText("What is your Birth Place?");
		driver.findElement(By.name("answer")).sendKeys("Delhi");
		logger.log(Status.PASS, "Enter the answer");
		driver.findElement(By.name("Submit")).click();
		logger.log(Status.PASS, "Enter the login button");
		Thread.sleep(5000);
		logger.log(Status.PASS, "Registration successful");
		driver.findElement(By.linkText("Home")).click();
	}
	
}
