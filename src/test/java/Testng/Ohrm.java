package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Ohrm {

	
	WebDriver driver=new ChromeDriver();
	
	
	
	
	@BeforeMethod
	public void maxmise() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@Test
		public void login() throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			
		}
		@AfterMethod
		public void logout() {
			driver.close();
		
		
		
		
		}
	
	
	
	

}