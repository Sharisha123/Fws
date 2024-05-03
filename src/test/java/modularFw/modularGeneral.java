package modularFw;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class modularGeneral extends Xpath {
	WebDriver driver;
	public void setUp() {
		
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
					
		System.out.println("Application opened");
	}

	public void tearDown() {
		driver.quit();
		System.out.println("application and browser are closed");
		
	}
	public void adminLogin() throws InterruptedException {
		driver.findElement(By.name(txt_username)).sendKeys(uid);
		driver.findElement(By.name(txt_password)).sendKeys(pwd);
		driver.findElement(By.xpath(btnlogin_type)).click();
		
	    Thread.sleep(2000);
	    
	    System.out.println("Admin login operation successful");
	}
		public void adminLogout()  throws InterruptedException {
			driver.findElement(By.xpath(alt_profile)).click();
			Thread.sleep(5000);
			driver.findElement(By.linkText(link_logout)).click();
			System.out.println("Admin logout");
		}
		
		public void addEmp() {
			System.out.println("Added new Employee");
		}
		
		public void delEmp() {
			System.out.println("Deleted employee");
		}

	

	}


