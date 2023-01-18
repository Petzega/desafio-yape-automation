package utils;

import io.appium.java_client.TouchAction;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.*;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofMillis;

public class AndroidUtils {

    public static void doSleep(long waitingTime) {
        try {
            Thread.sleep(waitingTime);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static WebElement doWaitVisibiliTyOfElementLocated(long waitingTime, By path) {
        return new WebDriverWait(DriverFactory.driver, Duration.ofSeconds(waitingTime)).until(ExpectedConditions.visibilityOfElementLocated(path));
    }

    public static void doClickElement(long waitingTime, By path) {
        doWaitVisibiliTyOfElementLocated(waitingTime, path).click();
    }

    public static void setTextElement(long waitingTime, By path, String text) {
        WebElement element = doWaitVisibiliTyOfElementLocated(waitingTime, path);
        element.clear();
        element.sendKeys(text);
    }

    public static String getTextElement(long waitingTime, By path) {
        return doWaitVisibiliTyOfElementLocated(waitingTime, path).getText();
    }

    public static boolean validateElement(long waitingTime,By path) {
        boolean validator = true;
        try {
            doWaitVisibiliTyOfElementLocated(waitingTime, path);
        } catch (Exception e) {
            return false;
        }
        return validator;
    }

    public static LocalDate datesPart(String fecha) {
        return LocalDate.parse(fecha);
    }

    public static String getMonth(String date) {
        /*String value = datesPart(date).getMonth().toString().toLowerCase();
        return value.substring(0, 1).toUpperCase() + value.substring(1);*/
        String value = null;
        switch (datesPart(date).getMonth()) {
            case JANUARY:  value = "enero"; break;
            case FEBRUARY:  value = "febrero"; break;
            case MARCH:  value = "marzo"; break;
            case APRIL:  value = "abril"; break;
            case MAY:  value = "mayo"; break;
            case JUNE:  value = "junio"; break;
            case JULY:  value = "julio"; break;
            case AUGUST:  value = "agosto"; break;
            case SEPTEMBER:  value = "setiembre"; break;
            case OCTOBER:  value = "octubre"; break;
            case NOVEMBER:  value = "noviembre"; break;
            case DECEMBER:  value = "diciembre"; break;
        }
        return value;
    }

    public static String getMonthShort(String date) {
        String value = null;
        switch (datesPart(date).getMonth()) {
            case JANUARY:  value = "ene."; break;
            case FEBRUARY:  value = "feb."; break;
            case MARCH:  value = "mar."; break;
            case APRIL:  value = "abr."; break;
            case MAY:  value = "may."; break;
            case JUNE:  value = "jun."; break;
            case JULY:  value = "jul."; break;
            case AUGUST:  value = "ago."; break;
            case SEPTEMBER:  value = "set."; break;
            case OCTOBER:  value = "oct."; break;
            case NOVEMBER:  value = "nov."; break;
            case DECEMBER:  value = "dic."; break;
        }
        return value;
    }

    public static String getDay(String date) {
        String value = String.valueOf(datesPart(date).getDayOfMonth());
        return value.length() == 1 ? "0" + value : value;
    }

    public static void doVerticalSwipeToElement(WebElement startElement, WebElement endElement) {
        int startX = startElement.getLocation().getX() + (startElement.getSize().getWidth() / 2);
        int startY = startElement.getLocation().getY() + (startElement.getSize().getHeight() / 2);
        int endX = endElement.getLocation().getX() + (endElement.getSize().getWidth() / 2);
        int endY = endElement.getLocation().getY() + (endElement.getSize().getHeight() / 2);
        new TouchAction(DriverFactory.driver)
                .press(point(startX,startY))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(endX, endY))
                .release().perform();
    }

    public static void doVerticalSwipe(double startPercentage, double endPercentage, double anchorPercentage) {
        Dimension size = DriverFactory.driver.manage().window().getSize();
        doSleep(250);
        int anchor = (int) (size.width * anchorPercentage);
        int startPoint = (int) (size.height * startPercentage);
        int endPoint = (int) (size.height * endPercentage);
        new TouchAction(DriverFactory.driver)
                .press(point(anchor, startPoint))
                .waitAction(waitOptions(ofMillis(1000)))
                .moveTo(point(anchor, endPoint))
                .release().perform();
    }

    public static void tapView(int x,  int y) {
        new TouchAction(DriverFactory.driver)
                .tap(point(x,y))
                .waitAction(waitOptions(ofMillis(250))).perform();
    }

    public static void assertText(long waitingTime, By path, String value) {
        Assert.assertEquals(getTextElement(waitingTime, path), value);
    }

    public static void assertContainsText(long waitingTime, By path, String value) {
        Assert.assertTrue(getTextElement(waitingTime, path).contains(value));
    }

    public static boolean validateText(long waitingTime, By path, String value) {
        return getTextElement(waitingTime, path).equals(value);
    }

    public static boolean validatePartialText(long waitingTime, By path, String value) {
        return getTextElement(waitingTime, path).contains(value);
    }

    public static String getDataTable(DataTable dataTable, String value) {
        return dataTable.asMaps(String.class, String.class).get(0).get(value);
    }
}
