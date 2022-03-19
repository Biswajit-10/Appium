package GenericUtilsNew;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qaprosoft.carina.core.foundation.utils.Messager;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;

public class Tapping {
    static final Logger UTILS_LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	static final int MINIMUM_TIMEOUT = 2;

	static final int DEFAULT_TOUCH_ACTION_DURATION = 1000;
	static final int DEFAULT_MAX_SWIPE_COUNT = 50;
	static final int DEFAULT_MIN_SWIPE_COUNT = 1;

	/**
	 * Tap with TouchAction by the center of element
	 *
	 * @param element ExtendedWebElement
	 */
	public void tap(WebElement element) {
		Point point = element.getLocation();
		Dimension size = element.getSize();
		tap(point.getX() + size.getWidth() / 2, point.getY() + size.getHeight() / 2);
	}

	/**
	 * Tap with TouchAction by coordinates with default 1000ms duration
	 *
	 * @param startx int
	 * @param starty int
	 */
	public void tap(int startx, int starty) {
		tap(startx, starty, DEFAULT_TOUCH_ACTION_DURATION);
	}

	/**
	 * Tap with TouchAction by coordinates with custom duration
	 *
	 * @param startx int
	 * @param starty int
	 * @param duration int
	 */
	public void tap(int startx, int starty, int duration) {
		// TODO: add Screenshot.capture()
		try {
			@SuppressWarnings("rawtypes")
			TouchAction touchAction = new TouchAction((MobileDriver<?>) castDriver());
			PointOption<?> startPoint = PointOption.point(startx, starty);
			WaitOptions waitOptions = WaitOptions.waitOptions(Duration.ofMillis(duration));

			if (duration == 0) {
				// do not perform waiter as using 6.0.0. appium java client we do longpress instead of simple tap even with 0 wait duration
				touchAction.press(startPoint).release().perform();
			} else {
				touchAction.press(startPoint).waitAction(waitOptions).release().perform();
			}
			Messager.TAP_EXECUTED.info(String.valueOf(startx), String.valueOf(starty));
		} catch (Exception e) {
			Messager.TAP_NOT_EXECUTED.error(String.valueOf(startx), String.valueOf(starty));
			throw e;
		}
	}
	 /**
     * Tap and Hold (LongPress) on element
     *
     * @param element ExtendedWebElement
     * @return boolean
     */
     public boolean longPress(WebElement element) {
        // TODO: SZ migrate to FluentWaits
        try {
            WebDriver driver;
            @SuppressWarnings("rawtypes")
            TouchAction<?> action = new TouchAction((MobileDriver<?>) driver);
            LongPressOptions options = LongPressOptions.longPressOptions().withElement(ElementOption.element(element.getElement()));
            action.longPress(options).release().perform();
            return true;
        } catch (Exception e) {
            UTILS_LOGGER.info("Error occurs during longPress: " + e, e);
        }
        return false;
    }
}
