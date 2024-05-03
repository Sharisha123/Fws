package PomFw;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashBoard {
	@FindBy(xpath="//h6[text()='Dashboard']")
	WebElement dashboardObj;
	
	//method:to return status based on "Dashboard" webelement availability
	public boolean dashboardDisplayed(){
		boolean myStatus=false;
		try {
			if(dashboardObj.isDisplayed()) {
				myStatus=true;
			}
		}
		catch(Exception e) {
			myStatus=false;
		}
		return(myStatus);
	}


}
