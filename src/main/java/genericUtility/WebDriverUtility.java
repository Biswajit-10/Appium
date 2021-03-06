package genericUtility;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import groovy.util.ObservableList.ElementAddedEvent;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class WebDriverUtility {
	
		/**
		 * implicitly wait and maximize window condition is given in this method
		 * @param driver
		 * @param url
		 */
		public void enterURL(WebDriver driver,String url) {
			driver.get(url);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
		/**
		 * 
		 * @param driver
		 * @param time
		 */
		public void implicitWait(WebDriver driver,int time) {
			driver.manage().timeouts().implicitlyWait(time,TimeUnit.SECONDS);
		}
		/**
		 * 
		 * @param driver
		 * @param element
		 * @param time
		 */
		public void explicitWait(WebDriver driver,WebElement element,int waitTime) {
			WebDriverWait wait=new WebDriverWait(driver,waitTime);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
		
		public void waitForPageTitle(WebDriver driver , String pageTitle){
			WebDriverWait wait = new WebDriverWait(driver, 20);
			wait.until(ExpectedConditions.titleContains(pageTitle));
			
		}
		
		public void  waitForElemnetToBeVisible(WebDriver driver , WebElement elemnet){
			WebDriverWait wait = new WebDriverWait(driver,10);
			wait.until(ExpectedConditions.visibilityOf(elemnet));
		}
		
		   /**
		    * This method wait for the element to be clicked , its custom wait created to avoid elemenInterAceptable Exception
		    * @param element
		    * @throws throwable
		    * 
		    */
		   
		   public void waitAndClick(WebElement element) throws InterruptedException
		   {
			   int count = 0;
		       while(count<20) {
			    	   try {
			    	       element.click();
			    	       break;
			    	   }catch(Throwable e){
			    		   Thread.sleep(1000);
			    		   count++;
			    	   }
		       }
		       
		   }
		    /**
		     * 
		     * @param driver
		     * @param screenshotName
		     * @throws Throwable
		     */
		    public void takeScreenshot(WebDriver driver, String screenshotName) throws Throwable {
		    	TakesScreenshot ts=(TakesScreenshot)driver;
		    	File src=ts.getScreenshotAs(OutputType.FILE);
		    	File dest=new File("./screenshot/"+screenshotName+".PNG");
		    	FileUtils.copyFile(src, dest);
		    }
		    
		    /**
		     * pass enter Key appertain in to Browser
		     * @param driver
		     */
		   public void passEnterKey(WebDriver driver) {
			   Actions act = new Actions(driver);
			   act.sendKeys(Keys.ENTER).perform();
		   } 
		   /**
		    * 
		    */
		   static SoftAssert softAssert;
		   public static void assert1(WebElement element) {
			    softAssert=new SoftAssert();
			   softAssert.assertEquals(true, element.isDisplayed());
		   }
		   /**
		    * 
		    * @param driver
		    * @param x
		    * @param y
		    */
		   public void tapp(AppiumDriver driver,int x,int y) {
			   TouchAction action=new TouchAction(driver);
			   action.tap(PointOption.point(x, y)).release().perform();
		   }
		/**
		 * 
		 * @param driver
		 * @param element
		 */
		   public void tapInMiddle(AppiumDriver driver ,WebElement element) {
			   Point location = element.getLocation();
			   int x=location.getX();
			   int y=location.getY();
			   Dimension size = element.getSize();
			   int height = size.getHeight();
			   int width = size.getWidth();
			   TouchAction action=new TouchAction(driver);
			   action.tap(PointOption.point(x+width/2, y-height/2)).release().perform();
		   }
		   
		   
		   public void clicking(WebElement element) {
			   element.click();
			   System.out.println(element+"is clicked");
		   }
		   
		   
		   
	}
