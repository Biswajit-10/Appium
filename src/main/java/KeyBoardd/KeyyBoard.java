package KeyBoardd;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;

public class KeyyBoard {
	
	MobileDriver<?> driver;
	
    /**
     * Hide keyboard if needed
     */

	public void hideKeyboard() {
            driver.hideKeyboard(); 
    }
	 /**
     * Check if keyboard is showing
     * return false if driver is not ios or android driver
     *
     * @return boolean
     */
	public boolean Keyboard() {
		  if (driver instanceof IOSDriver) {
	             return ((IOSDriver<?>) driver).isKeyboardShown();
	        }
	        else if (driver instanceof AndroidDriver) {
//	             return ((AndroidDriver<?>)driver).isKeyboardShown();
	             return ((AndroidDriver<WebElement>)driver).isKeyboardShown();
	        }
		  return false;
	}
	
	public void hid() {
        ((IOSDriver<WebElement>)driver).getKeyboard().pressKey(Keys.valueOf("good morning")); 
}
}
