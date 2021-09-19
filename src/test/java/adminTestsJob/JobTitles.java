package adminTestsJob;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.Admin_Job_JobTitles;
import pageObjects.Admin_Job_Tab;
import pageObjects.HomePage;
import utilites.BaseClass;

public class JobTitles extends BaseClass {
	
	WebDriver driver;
	HomePage hopo;
	Admin_Job_Tab ajto;
	Admin_Job_JobTitles ajjto;
	WebDriverWait wait;
	
	
	
	
	
	// Validate all 5 options under Job Tab should be displayed
	@Test
	public void jobTabsVisible() throws IOException {
		initializeBrowser();
		// Calling the login method of base class
		driver=SuccessfullLogin();
		hopo=new HomePage(driver);
		ajto = new Admin_Job_Tab(driver);
		ajjto= new Admin_Job_JobTitles(driver);
		hopo.admin_menu().click();
		//wait.until(ExpectedConditions.visibilityOf(ajto.job()));
		ajto.job().click();
		
		
		
		
		
		
		
		
	}

	
}
