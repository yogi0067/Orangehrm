package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Job {
	WebDriver driver;
	public Job(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

}
