package io.appium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class POMClass {

	@FindBy(id="")	//how, using, css ,id, xpath, tagName, className, partialLinkText, linkText
	private WebElement home;
	
	@AndroidFindBy(uiAutomator ="")	  //androidDataMatcher, priority ,accessibility, tagName, id, xpath, tagName
	private AndroidElement element;
	
	@iOSBy()	// priority, accessibility=accessibility id, 
	private IOSElement elem;

	@iOSXCUITFindBy(iOSClassChain = "")
	private IOSElement ele;
	
	@iOSXCUITFindBy(iOSNsPredicate  = "")
	private ExtendedWebElement el;

	public POMClass(WebDriver driver) {
//		Both for Android And Ios use AppiumFieldDecorator
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
}
