package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Listeners({ Listeners_bodies.class }) // to get bodies of our implemented listeners class --->right click
//->source-->overridden/implemented methods
public class Listeners_Practice {
	RemoteWebDriver driver;

	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("sharisha");
		Thread.sleep(1000);
		driver.findElement(By.name("password")).sendKeys("srikakulam queen");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(15000);
//driver.close();

	}

}
