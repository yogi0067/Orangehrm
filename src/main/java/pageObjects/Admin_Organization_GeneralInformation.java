package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Admin_Organization_GeneralInformation {
	
	
	WebDriver driver;
	public Admin_Organization_GeneralInformation()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#organization_name")
	WebElement organization_name;
	public WebElement organization_name()
	{
		return organization_name;
		
	}
	
	@FindBy(css = "#organization_taxId")
	WebElement organization_taxId;
	public WebElement organization_taxId()
	{
		return organization_taxId;
		
	}
	
	@FindBy(css = "#numOfEmployees")
	WebElement numOfEmployees;
	public WebElement numOfEmployees()
	{
		return numOfEmployees;
		
	}
	@FindBy(css = "#organization_phone")
	WebElement organization_registraionNumber;
	public WebElement organization_registraionNumber()
	{
		return organization_registraionNumber;
		
	}
	@FindBy(css = "#organization_phone")
	WebElement organization_phone;
	public WebElement organization_phone()
	{
		return organization_phone;
		
	}
	@FindBy(css = "#organization_fax")
	WebElement organization_fax;
	public WebElement organization_fax()
	{
		return organization_fax;
		
	}
	
	@FindBy(css = "#organization_email")
	WebElement organization_email;
	public WebElement organization_email()
	{
		return organization_email;
		
	}
	@FindBy(css = "#organization_street1")
	WebElement organization_street1;
	public WebElement organization_AddressStreet1()
	{
		return organization_street1;
		
	}
	
	@FindBy(css = "#organization_street2")
	WebElement organization_street2;
	public WebElement organization_AddressStreet2()
	{
		return organization_street2;
		
	}
	@FindBy(css = "#organization_city")
	WebElement organization_city;
	public WebElement organization_city()
	{
		return organization_city;
		
	}
	@FindBy(css = "#organization_province")
	WebElement organization_province;
	public WebElement organization_province()
	{
		return organization_province;
		
	}
	@FindBy(css = "#organization_zipCode")
	WebElement organization_zipCode;
	public WebElement organization_zipCode()
	{
		return organization_zipCode;
		
	}
	
	@FindBy(css = "#organization_country")
	WebElement organization_country;
	public Select organization_country()
	{
		Select s = new Select(organization_country);
		return s;
		
	}
	
	@FindBy(css = "#organization_note")
	WebElement organization_note;
	public WebElement organization_note()
	{
		return organization_note;
		
	}
	@FindBy(css = "#btnSaveGenInfo")
	WebElement btnSaveGenInfo;
	public WebElement organization_SaveButton()
	{
		return btnSaveGenInfo;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
