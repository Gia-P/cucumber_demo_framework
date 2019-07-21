package framework;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.List;

import static framework.AppiumWrapper.getAppiumDriver;
import static stepdefinition.SharedSD.getDriver;

public class MobileBasePage {


    /**
     * This is a constructor which initializes initPageElements()
     */
    public MobileBasePage() {
        initPageElements();
    }

    /**
     * This method handles wait functionality for mobile actions, which means if the element is not found
     * during test then the app will re-try and wait up to 15 seconds before failing the test step
     */
    protected void initPageElements() {
        PageFactory.initElements(new AppiumFieldDecorator(getAppiumDriver(), Duration.ofSeconds(15)), this);
    }

    /**
     * This method is used to tap on element
     *
     * @param mobileElement element to tap on
     */
    protected void tapOn(MobileElement mobileElement) {
        try {
            mobileElement.click();
        } catch (NoSuchElementException e) {
            //Take Screenshot here
            //Send email notification
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to set value in text field
     *
     * @param mobileElement
     * @param setValue
     */
    protected void setValue(MobileElement mobileElement, String setValue) {

        try {
            mobileElement.sendKeys(setValue);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    /**
     * This method is used to verify if element is displayed
     *
     * @param mobileElement
     * @return
     */
    protected boolean isElementDisplayed(MobileElement mobileElement) {
        try {
            return mobileElement.isDisplayed();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Unable to locate the Element using: " + mobileElement.toString());
        }
    }

    protected String getTextFromElement(MobileElement mobileElement) {
        String text;
        try {
            text = mobileElement.getText();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            throw new NoSuchElementException("Element is not found with this locator: " + mobileElement.toString());
        }
        return text;
    }

    protected void swipeScreenHorizontally(int times, double startPoint, double endPoint) {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int yPoint = size.height / 2;
        //int yStartPoint = (int) (size.width * 0.8);
        int xStartPoint = (int) (size.width * startPoint);
        //int yEndPoint = (int) (size.width * 0.2);
        int xEndPoint = (int) (size.width * endPoint);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + xStartPoint);
        System.out.println("End Point: " + xEndPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < times; i++) {
            touchAction.press(PointOption.point(xStartPoint,yPoint));
            touchAction.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)));
            touchAction.moveTo(PointOption.point(xEndPoint,yPoint));
            touchAction.release().perform();
        }
    }

    protected void swipeScreenVertically(int times, double startPoint, double endPoint) {

        Dimension size = AppiumWrapper.getAppiumDriver().manage().window().getSize();
        int xPoint = size.width / 2;
        //int yStartPoint = (int) (size.width * 0.5);
        int yStartPoint = (int) (size.height * startPoint);
        //int yEndPoint = (int) (size.width * 0.2);
        int yEndPoint = (int) (size.height * endPoint);
        System.out.println("Size: " + size);
        System.out.println("Start Point: " + yStartPoint);
        System.out.println("End Point: " + yEndPoint);
        TouchAction touchAction = new TouchAction(AppiumWrapper.getAppiumDriver());
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < times; i++) {
            touchAction.press(PointOption.point(xPoint,yStartPoint))
                    .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(xPoint,yEndPoint))
                    .release().perform();
        }
    }

    public void scrollDownByPixel(MobileElement element){
        TouchActions action = new TouchActions(getAppiumDriver());
        action.scroll(element,10, 100);
        action.perform();
    }

    public void scroll(String scrollingID, String text){
        //String text = "Show Tutorial";
        getAppiumDriver(). findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).resourceId(\""+scrollingID+"\")).scrollIntoView("
                        + "new UiSelector().textContains(\""+text+"\"))"));
    }

    public void scrollElement(String description){
        //String text = "Show Tutorial";
        getAppiumDriver().findElement(MobileBy
                .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().description(\""+description+"\"))"));
    }

    public List<WebElement> mobileElements(By locator){
        List<WebElement> elements = getDriver().findElements(locator);
        return elements;
    }

    public List<WebElement> webElements(By locator){
        List<WebElement> elements = getAppiumDriver().findElements(locator);
        return elements;
    }
}




