package io.TestPackage;

import java.time.Duration;

import org.openqa.selenium.Dimension;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Test {

	 public static void swipeVerticallyOnce(AppiumDriver driver)
	  {
	    Dimension d = driver.manage().window().getSize();
	    
	    int x1 = (int)(d.getWidth() * 0.5D);
	    int y1 = (int)(d.getHeight() * 0.7D);
	    
	    int x2 = (int)(d.getWidth() * 0.5D);
	    int y2 = (int)(d.getHeight() * 0.2D);
	    
	    new TouchAction(driver).tap(PointOption.point(x1, y1)).
	    waitAction(WaitOptions.waitOptions(Duration.ofMillis(4000L))).
	    moveTo(PointOption.point(x2, y2)).
	    release().perform();
	  }
	}

