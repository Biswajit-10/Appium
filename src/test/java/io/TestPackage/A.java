package io.TestPackage;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

public class A {
	
	@Test
	public void a() {
		Class/* <? extends A> */ c = this.getClass();
		
		System.out.println(c.getSimpleName());	//Print Class name
		
		System.out.println(c.getDeclaredMethods());
		
		Method[] a = c.getDeclaredMethods();
		
		System.out.println(a.length);
	}
	/**
	*Run app in background and relaunch where you left
	*
	**/
	public void b(){
	IOSDriver driver = new IOSDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("JD-SBYONO").click();
		driver.runAppInBackground(Duration.ofSeconds(-1));
		driver.runAppInBackground(Duration.ofSeconds(10));
		
//		Thread.sleep(10);
		driver.launchApp();
	}
	/**
	*Activates the given app if it installed, but not running or if it is running in the background.
	*relaunch where you left
	**/
	public void c(){
	IOSDriver driver = new IOSDriver(url,cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementById("JD-SBYONO").click();
		driver.runAppInBackground(Duration.ofSeconds(-1));
		
//		driver.activateApp("bundleId", "com.sbi.lotusintouch.internal");
		driver.activateApp("com.sbi.lotusintouch.internal");
		Thread.sleep(5000);
		driver.activateApp("com.apple.MobileSMS");
	}
}

