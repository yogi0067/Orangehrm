package adminTestsUserManagement;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import pageObjects.AddUser;
import pageObjects.HomePage;
import pageObjects.MainLoginPage;
import pageObjects.Users;
import utilites.BaseClass;
import utilites.DataClass;
@Listeners(utilites.ListenerClass.class)
public class AddUserTest extends BaseClass {
	WebDriver driver;
	MainLoginPage mlpo;
	HomePage hopo;
	WebDriverWait wait;
	Users upo;
	AddUser aupo;
	
	@Test
	public void LoginTest() throws IOException
	{
		driver=initilizeDriver();
		driver.get(DataClass.url);
		mlpo= new MainLoginPage(driver);
		hopo= new HomePage(driver);
		upo= new Users(driver);
		aupo= new AddUser(driver);
		wait= new WebDriverWait(driver, 30);
		mlpo.userName().sendKeys(getProperty("userName"));
		mlpo.password().sendKeys(getProperty("password"));
		mlpo.loginButton().click();
	}
	
	@Test(dependsOnMethods = "LoginTest")
	public void Test1() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(hopo.admin_menu()));
		hopo.admin_menu().click();
		upo.addButton().click();
		aupo.systemUser_userType().selectByVisibleText("ESS");
		aupo.systemUser_userName().sendKeys("TestUser1");
		aupo.systemUser_status().selectByVisibleText("Enabled");
		aupo.systemUser_employeeName_empName().sendKeys("Paul");
		Thread.sleep(3000);
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ac_results']/ul/li"));
		
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Paul Collings"))
			{
				
				ele.click();
				break;
			}
		}
		aupo.systemUser_password().sendKeys("Oati@1234");
		aupo.systemUser_confirmPassword().sendKeys("Oati@1234");
		aupo.saveButton().click();;
	}
	@Test(dependsOnMethods = "Test1")
	public void Test2() throws InterruptedException
	{
		Thread.sleep(3000);
		upo.searchUserName().sendKeys("TestUser123");
		upo.searchUserstatueDropDown().selectByVisibleText("Enabled");
		upo.searchuserTypeDropDown().selectByVisibleText("ESS");
		upo.searchemployeeName().sendKeys("Paul");
		/*
		 * Actions ac= new Actions(driver);
		 * ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		 * upo.searchButton().click();
		 */
		List<WebElement> elements = driver.findElements(By.xpath("//*[@class='ac_results']/ul/li"));
		Thread.sleep(3000);
		for(WebElement ele:elements)
		{
			System.out.println(ele.getText());
			if(ele.getText().equalsIgnoreCase("Paul Collings"))
			{
				
				ele.click();
				break;
			}
		}
		upo.searchButton().click();
		Thread.sleep(3000);
		String expectedUserName="TestUser123";
		
		int rows=upo.rows().size();
		System.out.println("Rows "+rows);
		String actualUserName="";
		int columns=upo.column().size();
		System.out.println("columns "+columns);
		boolean noeows=upo.noRecordsFound().getText().equalsIgnoreCase("No Records Found");
		if(noeows)
		{
			System.out.println("No Records Found");
		}
		else {
		for(int i=1; i<=rows; i++)
		{
			for(int j=2; j<=columns; j++)
			{
				System.out.print(upo.getColumnValue(i, j,driver).getText());
			}
			System.out.println();
		}
		actualUserName=upo.getColumnValue(1, 2,driver).getText();
		}
		System.out.println("expectedUserName"+expectedUserName);
		System.out.println("actualUserName"+actualUserName);
		Assert.assertEquals(actualUserName, expectedUserName);
	}
}
