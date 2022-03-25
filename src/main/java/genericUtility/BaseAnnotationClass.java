package genericUtility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseAnnotationClass {
	
	
	public WebDriverUtility  wlib=new WebDriverUtility();
	public WebDriver driver;
	
	@BeforeClass
	public void configBc() throws IOException {
//		start server
//		capabilities
	}
	@BeforeMethod
	public void configBm() throws IOException {
//		login
	}
	@AfterMethod
	public void configAm() throws IOException {
//		logout
//		use assertAll in the last statement 
	}
	@AfterClass
	public void configAc() {
//		stop server
	}
}
