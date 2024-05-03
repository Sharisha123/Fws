package KwdFw;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

//https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php
		WebDriver driver;
		public void launchBrowser() {
			String user;
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
					
		}
		
		public void navigateURL() {
			driver.get("https://www.facebook.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30) );
			driver.manage().window().maximize();
		}
		
		public void enterUsername() throws Exception {
			Thread.sleep(4000);
			driver.findElement(By.id("email")).sendKeys("Admin");
		}
		
		public void enterPassword() throws Exception {
			Thread.sleep(4000);
			driver.findElement(By.id("pass")).sendKeys("admin123");
		}
		
		public void clickLogin() throws Exception {
			Thread.sleep(4000);
			driver.findElement(By.xpath("button[@name='login']")).click();
		}
	
		
		

		


	}


