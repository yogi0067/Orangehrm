package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organization {
	
	WebDriver driver;
	public Organization(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public GeneralInformation getGeneramlInformation()
	{
		return new GeneralInformation(driver);
	}
	
	
	@FindBy(css = "#menu_admin_Organization")
	WebElement organization;
	public WebElement organization()
	{
		return organization;
		
	}
	@FindBy(css = "#menu_admin_viewOrganizationGeneralInformation")
	WebElement organizationGeneralInformation;
	public WebElement organizationGeneralInformation()
	{
		return organizationGeneralInformation;
		
	}
	@FindBy(css = "#menu_admin_viewLocations")
	WebElement organizationLocations;
	public WebElement organizationLocations()
	{
		return organizationLocations;
		
	}
	@FindBy(css = "#menu_admin_viewCompanyStructure")
	WebElement organizationStructure;
	public WebElement organizationStructure()
	{
		return organizationStructure;
		
	}


}
