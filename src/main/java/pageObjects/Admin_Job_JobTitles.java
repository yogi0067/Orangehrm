package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Job_JobTitles {
	
	WebDriver driver;
	
	public Admin_Job_JobTitles(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//div[@class='head']")
	WebElement JobTitlesText;
	public WebElement JobTitlesText()
	{
		return JobTitlesText;
	}
	
	
	@FindBy(css = "#btnAdd")
	WebElement Add;
	public WebElement Add()
	{
		return Add;
	}
	
	@FindBy(css = "#btnDelete")
	WebElement Delete;
	public WebElement Delete()
	{
		return Delete;
	}
	
	@FindBy(css = "#ohrmList_chkSelectAll")
	WebElement CheckBoxSelectAll;
	public WebElement CheckBoxSelectAll()
	{
		return CheckBoxSelectAll;
	}
	
	@FindBy(css = "#ASC")
	WebElement JobTitlesAscendingOrder;
	public WebElement JobTitlesAscendingOrder()
	{
		return JobTitlesAscendingOrder;
	}
	
   
	@FindBy(css = "#DESC")
	WebElement JobTitlesDescendingOrder;
	public WebElement JobTitlesDescendingOrder()
	{
		return JobTitlesDescendingOrder;
	}

	
	
	
	
	

}
