@AfterMethod
	public void afterMethod(Method method) {
		TestUtils.log().debug("******************* Test ended: " + method.getName() + "*******************");
		TestUtils.log().debug("---------------------------------------------------");
	}
