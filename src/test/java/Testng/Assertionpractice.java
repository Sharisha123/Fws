package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertionpractice {
	WebDriver driver;

	@Test
	public void m1() throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1500);
		String title = driver.getTitle();
		System.out.println("title is-->" + title);
		Assert.assertEquals(title, "Login • Instagram");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		Thread.sleep(2000);
		SoftAssert sa = new SoftAssert();
		
		WebElement z= driver.findElement(By.linkText("Meta"));
		Thread.sleep(500);
		String s = z.getText();
		sa.assertEquals(s, "M");
			

		WebElement us = driver.findElement(By.name("username"));
		Thread.sleep(1000);
		String a = us.getAriaRole();
		System.out.println("aria role is----->" + a);
		sa.assertEquals(a, "textbox","assert failed");
		us.sendKeys("shrisha");

		WebElement pd = driver.findElement(By.name("password"));
		Thread.sleep(1000);
		String b = pd.getAriaRole();
		System.out.println("aria role is ---->" + b);
		sa.assertEquals(b, "textbox");
		pd.sendKeys("srikakulam queen");

		WebElement bt = driver.findElement(By.xpath("//*[@type='submit']"));
		Thread.sleep(1000);
		String c = bt.getAriaRole();
		System.out.println("aria role is ---->" + b);
		sa.assertEquals(b, "textbox");
		bt.click();

		Thread.sleep(2000);
		driver.close();
		sa.assertAll();
	}

}
