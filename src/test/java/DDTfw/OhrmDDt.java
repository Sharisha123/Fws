package DDTfw;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class OhrmDDt {
	WebDriver driver=null;
	Properties pro;
	DataSet data1;
	
	@BeforeMethod
	public void setUp() throws IOException {
		 driver= new ChromeDriver();
		 FileInputStream fi =new FileInputStream("./dataset\\DataSet.properties");
		 pro=new Properties();
		 pro.load(fi);
		 
		 data1= new DataSet(driver);
		 
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	
	
	}
	@Test(enabled = false)
	public void login() throws InterruptedException {
//		driver.findElement(By.name("username")).sendKeys(pro.getProperty("userName"));
//		driver.findElement(By.name("password")).sendKeys(pro.getProperty("Password"));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
	
	@Test(dataProvider = "LoginData",enabled = false)
	public void login1(String user,String pass) throws InterruptedException {
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
	}
		@DataProvider(name="LoginData")
		public Object[][] dataset() {
			Object[][]ddt= {
					{"Admin","admin123"},{"Admin","admin12"},{"Admin","admin1"}
			};
			return ddt;
		}
		
		
		@Test(dataProvider = "logindataset")
		public void login2(String user,String pass) throws InterruptedException {
			driver.findElement(By.name("username")).sendKeys(user);
			driver.findElement(By.name("password")).sendKeys(pass);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			Thread.sleep(2000);
			
		}
		
		
		@DataProvider(name="logindataset")
		public Object[][] Dataset1() throws IOException {
			Object[][] data=data1.datset("Sheet1");
			
			return data;
		}
		@AfterMethod
		public void teardown() {
			driver.close();
		}
		
		
	}


