class WaitForPageToLoad{
public static void waitForPageToLoad() {
        try {
            long startTime = System.currentTimeMillis();//the difference, measured in milliseconds, between the current time and midnight
            String pageLoadStatus = "";
            do {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                pageLoadStatus = (String) js.executeScript("return document.readyState", new Object[0]);
                if ((System.currentTimeMillis() - startTime) / 1000L > 90L) {
                    break;
                }
            } while (!pageLoadStatus.equals("complete"));
        } catch (Exception localException) {
            Thread.currentThread().interrupt();	//stop the thread
        }
    }
}
