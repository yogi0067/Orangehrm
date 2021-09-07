package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class OrganizationLocations {
	
	WebDriver driver;
	public OrganizationLocations(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#searchLocation_name")
	WebElement searchLocation_name;
	public WebElement location_name()
	{
		return searchLocation_name;
		
	}
	
	
	@FindBy(css = "#searchLocation_city")
	WebElement searchLocation_city;
	public WebElement location_city()
	{
		return searchLocation_city;
		
	}
	
	@FindBy(css = "#searchLocation_country")
	WebElement searchLocation_country;
	public Select searchLocation_country()
	{
		Select dropdown= new Select(searchLocation_country);
		return dropdown;
		
	}
	@FindBy(css = "#btnSearch")
	WebElement btnSearch;
	public WebElement searchButton()
	{
		return btnSearch;
		
	}
	@FindBy(css = "#btnReset")
	WebElement btnReset;
	public WebElement resetButton()
	{
		return btnReset;
		
	}
	

}
