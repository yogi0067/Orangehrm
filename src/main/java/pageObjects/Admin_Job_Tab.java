package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Job_Tab {
	
	WebDriver driver;
	
	// Created the Parameterized constructor
	public Admin_Job_Tab(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(css = "#menu_admin_Job")
	WebElement job;
	public WebElement job()
	{
		return job;
	}
	
	
	@FindBy(css = "#menu_admin_viewJobTitleList")
	WebElement jobJobTitles;
	public WebElement jobJobTitles()
	{
		return jobJobTitles;
	}
	
	
	@FindBy(css = "#menu_admin_viewPayGrades")
	WebElement jobPayGrades;
	public WebElement jobPayGrades()
	{
		return jobPayGrades;
	}
	
	
	@FindBy(css = "#menu_admin_employmentStatus")
	WebElement jobEmploymentStatus;
	public WebElement jobEmploymentStatus()
	{
		return jobEmploymentStatus;
	}
	
	
	@FindBy(css = "#menu_admin_jobCategory")
	WebElement jobJobCategories;
	public WebElement jobJobCategories()
	{
		return jobJobCategories;
	}
	
	
	@FindBy(css = "#menu_admin_workShift")
	WebElement jobWorkShifts;
	public WebElement jobWorkShifts()
	{
		return jobWorkShifts;
	}
	
	@FindBy(xpath = "//*[@id='menu_admin_Job'] /following-sibling::ul/li/a")
	List<WebElement>  availableJobTabOptions;
	public List<WebElement> availableJobTabOptions()
	{
		return availableJobTabOptions;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
