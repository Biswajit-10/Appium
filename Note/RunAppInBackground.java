driver.runAppInBackground(Duration.ofSeconds(-1));


driver.activateApp("com.apple.mobilesafari");

System.out.println(driver.isKeyboardShown());  //working

driver.hideKeyboard();  // Not Working
