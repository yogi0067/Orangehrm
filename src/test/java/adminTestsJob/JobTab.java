package adminTestsJob;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pageObjects.Admin_Job_JobTitles;
import pageObjects.Admin_Job_Tab;
import pageObjects.HomePage;
import utilites.BaseClass;

public class JobTab extends BaseClass {
	
	WebDriver driver;
	HomePage hopo;
	Admin_Job_Tab ajto;
	Admin_Job_JobTitles ajjto;
	WebDriverWait wait;
	boolean flag= false;
	
	
	
	// Validate URL of Job Tab Menu
	@Test
	public void urlValidation() {
		        // Calling the initialize method of base class
				initializeBrowser();
				// Calling the login method of base class
				driver=SuccessfullLogin();
				// Instantiating an instance of HomePage Object
				hopo=new HomePage(driver);
				// Instantiating an instance of AdminJobTab Object
				ajto = new Admin_Job_Tab(driver);
				hopo.admin_menu().click();
				//wait.until(ExpectedConditions.visibilityOf(ajto.job()));
				ajto.job().click();
				String expectedURL ="https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers#";
				String actualURL = driver.getCurrentUrl();
				
				if(actualURL.equalsIgnoreCase(expectedURL)) {
					System.out.println("We have landed on the right page");
				}
				else {
					System.out.println("We have not landed on the right page");
				}
				closeBrowser();
		
		
	}
	
	// Validate Total Number of options should be 5 and all 5 options under Job Tab should be displayed
	
	@Test
	public void jobTabsVisible() throws IOException {
		// Calling the initialize method of base class
		initializeBrowser();
		// Calling the login method of base class
		driver=SuccessfullLogin();
		// Instantiating an instance of HomePage Object
		hopo=new HomePage(driver);
		// Instantiating an instance of AdminJobTab Object
		ajto = new Admin_Job_Tab(driver);
		hopo.admin_menu().click();
		//wait.until(ExpectedConditions.visibilityOf(ajto.job()));
		ajto.job().click();
		
		List<WebElement> availableDropdownOptions = ajto.availableJobTabOptions();
		System.out.println("Total Number of Options Available Under Job Tab are " + availableDropdownOptions.size());
		List<String> expectedJobTabOptions = new ArrayList<String>();
		expectedJobTabOptions.add("Job Titles");
		expectedJobTabOptions.add("Pay Grades");
		expectedJobTabOptions.add("Employment Status");
		expectedJobTabOptions.add("Job Categories");
		expectedJobTabOptions.add("Work Shifts");
		// In future I am expecting 6 elements but only 5 are available so to validate 6th one I need make my loop dependent on Expected
		
		int i=0;
		
		for(WebElement actualJobTabOptions :availableDropdownOptions ) {
			if(actualJobTabOptions.getText().equalsIgnoreCase(expectedJobTabOptions.get(i)) ) {
				
				flag = true;
				System.out.println("Option Available at " + i + "  Position is "  + actualJobTabOptions.getText());
				i++;
				}
			else {
				flag =false;
				break;
			}
			
		}
		
		if(flag) {
			System.out.println("------------------------------------------");
			System.out.println("All available options Under job Tab are correct");
		}
		else {
			System.out.println("There is some discrepency in options Under job Tab");
		}
		
		
		closeBrowser();
		
		
		
		
		
		
		
		
		
		
	}


	
}
