package GenericUtils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;

public class WebdriverUtils {
	private IOSDriver<WebElement> driver;
	private IOSDriver<MobileElement> driver2;
	private IOSDriver driver3;
	
	 public void testSendKeysToInput () {
	        // Find TextField input element
	        String textInputId = "TextField1";
	        IOSElement textViewsEl = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(textInputId)));

	        // Check that it doesn"t have a value
	        String value = textViewsEl.getAttribute("value");
	        Assert.assertEquals(value, null);

	        // Send keys to that input
	        textViewsEl.sendKeys("Hello World!");

	        // Check that the input has new value
	        value = textViewsEl.getAttribute("value");
	        Assert.assertEquals(value, "Hello World!");
	    }
	 public void testOpenAlert () {
	        // Find Button element and click on it
	        String buttonElementId = "show alert";
	        IOSElement buttonElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(buttonElementId)));
	        buttonElement.click();

	        // Wait for the alert to show up
	        String alertTitleId = "Cool title";
	        IOSElement alertTitleElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId(alertTitleId)));

	        // Check the text
	        String alertTitle = alertTitleElement.getText();
	        Assert.assertEquals(alertTitle, "Cool title");

	        // Dismiss the alert
	        IOSElement okButtonElement = (IOSElement) new WebDriverWait(driver, 30)
	                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("OK")));
	        okButtonElement.click();
	    }
	 @Test
	    public void testFindElementsByAccessibilityID () {
	        // This finds elements by "accessibility id", which in the case of IOS is the "name" attribute of the element
	        List<WebElement> computeSumButtons = driver.findElementsByAccessibilityId("ComputeSumButton");
	        Assert.assertEquals(computeSumButtons.size(), 1);
	        computeSumButtons.get(0).click();
	    }

	    @Test
	    public void testFindElementsByClassName () {
	        // Find element by name
	        List<WebElement> windowElements = driver.findElementsByClassName("XCUIElementTypeWindow");
	        Assert.assertTrue(windowElements.size() > 1);
	    };

	    @Test
	    public void testFindElementsByNSPredicateString () {
	        // This is an IOS-specific selector strategy. See https://developer.apple.com/library/content/documentation/Cocoa/Conceptual/Predicates/Articles/pSyntax.html for reference
	        List<WebElement> allVisibleElements = driver.findElementsByIosNsPredicate("visible = true");
	        Assert.assertTrue(allVisibleElements.size() > 1);
	    }

	    @Test
	    public void testFindElementsByClassChain () {
	        // This is also an IOS-specific selector strategy. Similar to XPath. This is recommended over XPath.
	        List<WebElement> windowElements = driver.findElementsByIosClassChain("XCUIElementTypeWindow[1]/*[2]");
	        Assert.assertEquals(windowElements.size(), 1);
	    }

	    @Test
	    public void testFindElementsByXPath () {
	        // Can find source xml by calling "driver.source()"
	        // Note that XPath is not recommended due to major performance issues
	        List<WebElement> buttons = driver.findElementsByXPath("//XCUIElementTypeWindow//XCUIElementTypeButton");
	        Assert.assertTrue(buttons.size() > 1);
	    }
}
