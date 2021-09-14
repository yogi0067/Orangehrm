package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	WebDriver driver;
	public Admin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public Job getJob()
	{
		return new Job(driver);
	}
	
	public Organization getOrganization()
	{
		return new Organization(driver);
	}
	
	
	
	

}
