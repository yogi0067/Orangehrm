package adminTestsOrganization;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.Admin;
import pageObjects.Admin_Organization_GeneralInformation;
import pageObjects.Admin_Organization_Tab;
import pageObjects.HomePage;
import pageObjects.MainLoginPage;
import utilites.BaseClass;
import utilites.DataClass;

public class GI extends BaseClass{
	WebDriver driver;
	Admin_Organization_Tab opo;
	MainLoginPage mlpo;
	HomePage home;
	WebDriverWait wait;
	Admin_Organization_GeneralInformation ogipo;
	Admin admin;
	@BeforeTest
	public void launchBrowser() throws IOException {
		driver = initilizeDriver();		
		driver.get(DataClass.url);
		wait= new WebDriverWait(driver, 20);
		admin= new Admin(driver);
		mlpo = new MainLoginPage(driver);
		home= new HomePage(driver);
		wait= new WebDriverWait(driver, 20);
		opo= new Admin_Organization_Tab(driver);
		ogipo= new Admin_Organization_GeneralInformation(driver);
	}
	@Test
	public void Test1()
	{
		mlpo.userName().sendKeys(DataClass.userName);
		mlpo.password().sendKeys(DataClass.password);
		mlpo.loginButton().click();
		home.admin_menu.click();
		wait.until(ExpectedConditions.visibilityOf(opo.organization()));
		home.getAdmin().getOrganization().organization().click();
		home.getAdmin().getOrganization().organizationGeneralInformation().click();
	}

}
