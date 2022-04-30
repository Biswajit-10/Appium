package Important;

import io.appium.java_client.service.local.AppiumDriverLocalService;

public class StartAppiumServer {

	public static void main(String[] args) {

		AppiumDriverLocalService service;

		service = AppiumDriverLocalService.buildDefaultService();
		service.start();

	}
}
