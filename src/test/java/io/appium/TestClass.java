package io.appium;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent; 
import io.appium.java_client.ios.IOSDriver;


public class TestClass {
	public static void main(String[] args) {
		IOSDriver<WebElement> driver=new IOSDriver(null);
		driver.hideKeyboard();
//		ExtendedWebElement element=
		WebElement element=driver.findElementById("");
		AndroidDriver<AndroidElement> driver2=new AndroidDriver<AndroidElement>(null);
		AppiumDriver<WebElement> driver3=new AppiumDriver<WebElement>(null);
		MobileDriver<WebElement> mobDriver = null;
//		 board = driver2.hideKeyboard();

	/*-----pressing back button in android phone-------*/	
		driver2.pressKey(new KeyEvent(AndroidKey.BACK));
		driver2.pressKey(new KeyEvent(AndroidKey.VOLUME_MUTE));
		
		driver2.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
		driver2.pressKey(new KeyEvent().withKey(AndroidKey.HOME));
		driver2.pressKey(new KeyEvent().withKey(AndroidKey.MENU));
		driver2.pressKey(new KeyEvent().withKey(AndroidKey.BRIGHTNESS_UP));
		driver2.pressKey(new KeyEvent().withKey(AndroidKey.VOLUME_MUTE));
		
		mobDriver.isAppInstalled("bundle id");  //bundle identifier for iOS (or appPackage for Android) of the app
		mobDriver.activateApp("bundle id");
		mobDriver.closeApp();	//move to recent app list from foreground if in background nothing will happen
//		mobDriver.
	}
}
