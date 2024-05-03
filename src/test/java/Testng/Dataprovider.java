package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	
WebDriver driver=new ChromeDriver();
	
	
	
	
	@BeforeMethod
	public void maxmise() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
		
		@Test(dataProvider = "test")
		
		public void login(String b,String c) throws InterruptedException {
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys(b);
			driver.findElement(By.name("password")).sendKeys(c);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(3000);
			
			
		}
		@AfterTest
		public void logout() {
			driver.close();
		
		
		
		
		}
	@DataProvider 
	public Object[][] test(){
		Object[][] shari = new Object[2][2];
			shari[0][0]="shari";
			shari[0][1]="asdf";
			shari[1][0]="zxc";
			shari[1][1]="123";
			return shari;
			
		}
	
		
	}
	
	



		

