package PomFw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Xpath {
	@FindBy(name="username")
	WebElement uidobj;
	@FindBy(name="password")
	WebElement uidpsw;
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginObj;
	public void setuid (String uid){
		uidobj.sendKeys(uid);
		
		
	}
	public void setpassword(String pass) {
		uidpsw.sendKeys(pass);
	}
	public void loginbutton() {
		loginObj.click();
	}

}
