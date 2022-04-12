if(!driver.isAppInstalled("bundleId")) {
			System.out.println("executing if condition");
			driver.installApp("app Path");;
		}
