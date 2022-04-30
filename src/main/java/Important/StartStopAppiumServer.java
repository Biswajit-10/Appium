package Important;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartStopAppiumServer {

	public static void main(String[] args) {

		AppiumDriverLocalService service;

		service = AppiumDriverLocalService.buildDefaultService();
		service.start();
		CheckIfServerIsRunning.main(null);
		service.stop();
		CheckIfServerIsRunning.main(null);
		
	}
}
