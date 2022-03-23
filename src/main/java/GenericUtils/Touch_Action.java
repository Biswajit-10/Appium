package GenericUtils;

import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

import static io.appium.java_client.touch.TapOptions.*;

public class Touch_Action {

	public static void main(String[] args) throws Throwable {
		DesiredCapabilities cap=new DesiredCapabilities();
		URL url =new URL(""); 
		IOSDriver<WebElement> driver=new IOSDriver(url,cap);
		
		IOSTouchAction action=new IOSTouchAction(driver);
		MobileElement tap=(MobileElement)driver.findElementByXPath("");
		action.tap(tapOptions().withElement(ElementOption.element(tap))).perform();
		
	
	}

}
