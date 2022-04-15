class TapInMiddle{
  /* From carina Framework*/
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
	/*
	Scroll To Buttom
	window.scrollTo(0, document.body.scrollHeight)
	From Buttom to Top
	window.scrollTo(0, -document.body.scrollHeight)

	driver.manage().log()
	
  	*/
}
