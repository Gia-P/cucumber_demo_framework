package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DarkskyHomePage extends BasePage {

    private By timeline = By.id("timeline");
    private By darkSkyAPI = By.linkText("Dark Sky API");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By register = By.xpath("//h1[@class='stand-alone title']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By currentTemp = By.xpath("//span[@class='summary swap']");
    private By timelineTemp = By.xpath("//div[@class='temps']//span");
    private By todaysTimelineOpen = By.xpath("//div[@id='week']/a[1]//span[@class='open']");

    public boolean isTimelineDisplayed(){
        return isElementDisplayed(timeline);
    }

    public void clickOnDarkSkyAPI(){
        clickOn(darkSkyAPI);
    }

    public void clickOnSignUpButton(){
        clickOn(signUpButton);
    }

    public String getTextRegisterPage(){
        return getTextFromElement(register);
    }

    public void clickOnRegisterButton(){
        clickOn(registerButton);
    }

    public boolean currentTempIsGreaterOrLess(){
        boolean result = true;
        String getCurrentTemp = getTextFromElement(currentTemp);
        String temp = getCurrentTemp.substring(0,2);
        for (WebElement element : webElements(timelineTemp)){
            if (temp.equals(element.getText().substring(0,2))){
                result = false;
                break;
            }
        }
        return result;
    }

    public void scrollDown(){
        scroll(todaysTimelineOpen);
    }

    public void clickOnDayOpen(){
        clickOn(todaysTimelineOpen);
    }
}
