package utilites;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.Admin_Organization_GeneralInformation;
import pageObjects.Admin_Organization_Tab;
import pageObjects.HomePage;
import pageObjects.MainLoginPage;

public class BaseClass {

	public  WebDriver driver;
	Properties prop = new Properties();
	public ExtentReports extent;
	public static Logger logs = LogManager.getLogger(BaseClass.class.getName());
	
	// variables adding for the corresponding change
	MainLoginPage mlpo;
	HomePage hopo;
	// Variables closed
	public WebDriver initilizeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	  // Changes Sagar has been making for improvement
	  
		public void initializeBrowser()  { 
		  driver= initilizeDriver(); 
		  driver.get(DataClass.url); 
		  mlpo = new MainLoginPage(driver);
		   
		  }
		public WebDriver SuccessfullLogin () {
	  mlpo.userName().sendKeys(DataClass.userName);
	  mlpo.password().sendKeys(DataClass.password); 
	  mlpo.loginButton().click();
	  return driver;
	  }
	 // Changes closed
	public String getProperty(String value) throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		return prop.getProperty(value);

	}

	public ExtentReports htmlReport() {
		String fileName = System.getProperty("user.dir") + "\\test-output\\htmlreport\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(fileName);
		reporter.config().setDocumentTitle("OrangeTestReport");
		reporter.config().setReportName("OrangeTestReportHTML");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		return extent;
	}

	public static String takeScreenShot(WebDriver driver,String fileName) {
		TakesScreenshot sc = (TakesScreenshot) driver;
		File screenhost=sc.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenhost, new File(System.getProperty("user.dir") + "\\test-output\\screenShots\\"+fileName+".png"));
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		return System.getProperty("user.dir") + "\\test-output\\screenShots\\"+fileName+".png";
		
		
		
		
	}

}
