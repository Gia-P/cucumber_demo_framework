package framework.mobilePages;

import framework.AppiumWrapper;
import framework.MobileBasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Collections;
import java.util.List;

import static framework.AppiumWrapper.getAppiumDriver;

public class MainMenu extends MobileBasePage {

    @AndroidFindBy(xpath = "//android.view.View[@content-desc='Menu']")
    private MobileElement sidebarHeader;

    @AndroidFindBy(className = "android.widget.Button")
    private List<MobileElement> sidebarElements;

    @AndroidFindBy(xpath = "//android.widget.Button[8]")
    private MobileElement tutorial;

    public boolean isMenuPresent() {
        return isElementDisplayed(sidebarHeader);
    }

    public void getSidebarElements() throws InterruptedException {

        String[] expectedElements = {"calendar Schedule","contacts Speakers","map Map","information circle About","log in Login","help Support","person add Signup","hammer Show Tutorial"};
        swipeScreenVertically(1,0.5,0.2);
        Thread.sleep(1000);
        sidebarElements.add(tutorial);
        System.out.println(tutorial.getAttribute("content-desc"));
        System.out.println("size = " + sidebarElements.size());
        for (int i = 0; i < sidebarElements.size(); i++){
            System.out.println(expectedElements[i] + " = " + sidebarElements.get(i).getAttribute("content-desc").trim());
        }
    }

}
