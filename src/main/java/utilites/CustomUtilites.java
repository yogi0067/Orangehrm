package utilites;

import java.io.IOException;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.Status;

public class CustomUtilites extends BaseClass{

	
	public void nevigateToUrl(String url)
	{
		addMessageIntoReport("We are Navigating to "+url);
		driver.get(url);
	}
	
	public void addMessageIntoReport(String message)
	{
		ListenerClass.test.log(Status.INFO, message);
	}
	public String getElementText(WebElement element)
	{
		addMessageIntoReport("Getting text");
		return element.getText();
	}
	public void clickOnElement(WebElement element)
	{
		addMessageIntoReport("Click on Element");
		element.click();
	}
	public void uploadFile(String filepath) throws IOException
	{
		addMessageIntoReport("Uploading File " +filepath);
		Runtime.getRuntime().exec(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\autoituloadfromcmd.exe"+" "+ filepath);
	}
	public void sendKeys(WebElement element,String value)
	{
		addMessageIntoReport("Enter Value" + value);
		element.sendKeys(value);
	}
	
	
	
	
	
}
