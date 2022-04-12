public class Swiping {
	public static IOSDriver driver;
	
  public static void swipeRight() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "Right");
		js.executeScript("mobile: swipe", scrollObject);	
	}
  
  public static void swipeLeft() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		HashMap<String, String> scrollObject = new HashMap<String, String>();
		scrollObject.put("direction", "Left");
		js.executeScript("mobile: swipe", scrollObject);
		
	}
  
  public static void main(String[] args) {
		capabilities();
    
		driver.runAppInBackground(Duration.ofSeconds(-1));
		swipeLeft();
		swipeLeft();
		swipeRight();
		swipeRight();
		swipeRight();
	
	}
  }
