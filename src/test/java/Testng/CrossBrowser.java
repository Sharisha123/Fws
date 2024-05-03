package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
	RemoteWebDriver driver;
	@Parameters("browser")
	@BeforeMethod
	public void open_browser(String browser) throws Exception
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
			System.out.println("chrome browser opened");
			Reporter.log("chrome browser opened",true);
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
			System.out.println("firefox browser opened");
			Reporter.log("firefox browser opened",true);
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			Thread.sleep(4000);
			System.out.println("edge browser opened");
			Reporter.log("edge browser opened",true);
		}
		
	}
	@Parameters({"uid","pwd"})
	@Test
	public void test(String uid,String pwd)throws Exception
	{
		driver.findElement(By.id("email")).sendKeys(uid);
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(1000);
		driver.findElement(By.linkText("Log in")).click();
		Thread.sleep(1000);
		
		SoftAssert sa=new SoftAssert();
		String title=driver.getTitle();
		String expect="Facebook";
		sa.assertEquals(title.contains("Facebook"),expect.contains("Facebook"));
		sa.assertAll();
	}
	@AfterMethod
	public void closebrowser()throws Exception
	{
		Thread.sleep(3000);
		driver.close();
	}

}
