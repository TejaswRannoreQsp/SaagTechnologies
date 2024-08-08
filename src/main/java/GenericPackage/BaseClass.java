package GenericPackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	PropertyFileUtility p=new PropertyFileUtility();
	ExcelFileUtility e=new ExcelFileUtility();
	public WebDriver driver=null;
	
	@BeforeSuite
	public void beforesuiteconfig() {
		Reporter.log("---DataBase connection established---",true);
	}
	@BeforeClass
	public void LaunchBrowser() throws IOException {
		String BROWSER = p.ToreadDataFromPropertyFile("browser");
		if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
		}
		driver.manage().window().maximize();
		Reporter.log("Browser is maximised",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	@BeforeMethod
	public void NavigateToApplication() throws IOException {
		String URL = p.ToreadDataFromPropertyFile("url");
		driver.get(URL);
	}
	@AfterMethod
	public void LogoutFromApplication() {
		
	}
	@AfterClass
	public void CloseTheBrowser() {
		driver.quit();
		
	}
	@AfterSuite
	public void AfterSuiteConfig() {
		Reporter.log("---Database connection removed--",true);
	}
	
	

}
