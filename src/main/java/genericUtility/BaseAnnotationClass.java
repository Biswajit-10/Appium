package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseAnnotationClass {
	
	
//	public WebDriverUtility  wlib=new WebDriverUtility();
	public WebDriver driver;
	
	@BeforeClass
	public void configBc() throws IOException {
	}
	@BeforeMethod
	public void configBm() throws IOException {
		
	}
	@AfterMethod
	public void configAm() throws IOException {
		
	}
	@AfterClass
	public void configAc() {
		
	}
}
