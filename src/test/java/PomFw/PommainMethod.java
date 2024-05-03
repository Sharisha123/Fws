package PomFw;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class PommainMethod {

	public static void main(String[] args) throws InterruptedException {
		
   WebDriver driver=null;
   driver=new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	Thread.sleep(3000);
	
	Xpath xs=PageFactory.initElements( driver,Xpath.class);
	DashBoard db=PageFactory.initElements(driver,DashBoard.class);
	
	xs.setuid("Admin");
	xs.setpassword("admin123");
	xs. loginbutton();
	Thread.sleep(3000);
	//To verify login successful or not
	if(db.dashboardDisplayed()) {
		
	System.out.println("successful login operation");
	
	
	}
	else {
		System.out.println("unsuccessful login operation");
		

	}

	}
}