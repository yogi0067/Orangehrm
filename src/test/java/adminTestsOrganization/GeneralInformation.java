package adminTestsOrganization;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.MainLoginPage;
import pageObjects.Admin_Organization_Tab;
import utilites.BaseClass;
import utilites.DataClass;

public class GeneralInformation extends BaseClass {

	
	WebDriver driver;
	Admin_Organization_Tab opo;
	MainLoginPage mlpo;
	HomePage hopo;
	WebDriverWait wait;
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initilizeDriver();		
		driver.get(DataClass.url);
		mlpo = new MainLoginPage(driver);
		hopo= new HomePage(driver);
		wait= new WebDriverWait(driver, 20);
		opo= new Admin_Organization_Tab(driver);
	}
	
	@Test
	public void Test1()
	{
		mlpo.userName().sendKeys(DataClass.userName);
		mlpo.password().sendKeys(DataClass.password);
		mlpo.loginButton().click();
		hopo.admin_menu().click();
		wait.until(ExpectedConditions.visibilityOf(opo.organization()));
		opo.organization().click();
		opo.organizationGeneralInformation().click();
	}
	
	
	
}
