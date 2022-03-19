package GenericUtilsNew;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class AndroidUIAutomator {
	
	AndroidDriver<AndroidElement> driver;
	MobileDriver<MobileElement> driver2;
/**
 * WAS to identify an element
 */
	public void find() {
		driver.findElementByAndroidUIAutomator("Attribute Name(\"Attribute Value\")");
		driver.findElementsByAndroidUIAutomator("Attribute Name(\"Attribute Value\")").get(2).click();
	}
	
	/**
	 * We can pass android scripts to Android UI Automator
	 * usage of Android Mobile API scripts
	 */
	public void checkClickable() {
		driver.findElementByAndroidUIAutomator("new UISelector().clickable(true)").getSize();
		driver.findElementByAndroidUIAutomator("new UISelector().property(value)").getSize();
	}
	
	/**
	 * 
	 */
	public void scrollUptoElement() {
		driver.findElementByAndroidUIAutomator("new UIScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))");
	}
	
}
