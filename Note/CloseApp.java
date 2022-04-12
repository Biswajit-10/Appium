
public class CloseApp{
public static IOSDriver driver;
	public static void capabilities() {
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.UDID,"00008020-000508AC2269002E");
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "15.3");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "UAT_RTA's iPhone");
		cap.setCapability("bundleId", "com.apple.Preferences");
		URL url=null;
		try {
			url = new URL("http://0.0.0.0:4724/wd/hub");
		} catch (MalformedURLException e) {	}
		driver = new IOSDriver<WebElement>(url,cap);
	}
  
  public static void main(String[] args) {
		capabilities();

//	driver.close();		// It will Not Work

    /* Any of the two methods will work  */

		driver.closeApp();
		driver.quit();
    
	}
  }
