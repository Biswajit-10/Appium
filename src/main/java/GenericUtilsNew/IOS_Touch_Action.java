package GenericUtilsNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;

public class IOS_Touch_Action {
	
	static AndroidDriver<AndroidElement> driver1;
	static IOSDriver<MobileElement> driver;
	static TouchAction action=new TouchAction(driver);
	static TouchAction action1=new TouchAction(driver1);
//	static Action act=new Action((WebDriver)driver);
	
	public static void main(String[] args) {
		
	}
	
	public void tapping(WebElement element) {
		IOSTouchAction touch=new IOSTouchAction(driver);
		touch.tap(TapOptions.tapOptions().withElement(ElementOption.element(element)));
	}
	
	public void double_Tap(WebElement element) {
		IOSTouchAction touch=new IOSTouchAction(driver);
//		touch.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(element))).withDuration(Duration.ofSeconds(2)).release().perform();
	}
	
	public void TAP(WebElement element) {
	}
}
