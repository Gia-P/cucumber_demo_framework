package framework.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.*;

public class DarkskyHomePage extends BasePage {

    private By timeline = By.id("timeline");
    private By darkSkyAPI = By.linkText("Dark Sky API");
    private By signUpButton = By.xpath("//a[@class='button filled']");
    private By register = By.xpath("//h1[@class='stand-alone title']");
    private By registerButton = By.xpath("//button[contains(text(),'Register')]");
    private By currentTemp = By.xpath("//span[@class='summary swap']");
    private By timelineTemp = By.xpath("//div[@class='temps']/span");
    private By todaysTimelineOpen = By.xpath("//div[@id='week']/a[1]//span[@class='open']");
    private By todaysMinTemp = By.xpath("//a[@class='day revealed']//span[@class='minTemp']");
    private By todaysMaxTemp = By.xpath("//a[@class='day revealed']//span[@class='maxTemp']");
    private By dayDetalsTemp1 = By.xpath("//div[@class='dayDetails revealed']//span[@class='highTemp swip']/span[@class='temp']");
    private By dayDetalsTemp2 = By.xpath("//div[@class='dayDetails revealed']//span[@class='lowTemp swap']/span[@class='temp']");
    private By timelineHours = By.xpath("//div[@id='timeline']//div[@class='hours']/span/span");

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
        int temp;
        String[] getCurrentTemp = getTextFromElement(currentTemp).split(" ");
        if (getCurrentTemp[0].length() > 2) {
            temp = Integer.parseInt(getCurrentTemp[0].substring(0, 2));
        }
        else {
            temp = (getCurrentTemp[0].charAt(0));
        }
        ArrayList<Integer> timelineTemps = new ArrayList<>();
        int intTemp;
        for (WebElement element : webElements(timelineTemp)){
            if (element.getText().length() > 2) {
                intTemp = Integer.parseInt(element.getText().substring(0, 2));
            }
            else {
                intTemp = (element.getText().charAt(0));
            }
            timelineTemps.add(intTemp);
        }
        Collections.sort(timelineTemps);
        if (temp >= timelineTemps.get(0) && temp <= timelineTemps.get(timelineTemps.size()-1)){
            result = false;
        }
        return result;
    }

    public void scrollDown(){
        scroll(todaysTimelineOpen);
    }

    public void clickOnDayOpen(){
        clickOn(todaysTimelineOpen);
    }

    public boolean isLowHighTempDispelCorrect(){
        String todaysMinTemp = getTextFromElement(this.todaysMinTemp);
        String todaysMaxTemp = getTextFromElement(this.todaysMaxTemp);
        String dayDetalsTemp1 = getTextFromElement(this.dayDetalsTemp1);
        String dayDetalsTemp2 = getTextFromElement(this.dayDetalsTemp2);
        if (todaysMinTemp.equals(dayDetalsTemp1) && todaysMaxTemp.equals(dayDetalsTemp2)){
            return true;
        }
        return false;
    }

    public boolean isTimelineDisplayedTwoHours(){
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("ha");
        for (int i = 1; i < webElements(timelineHours).size(); i++){
            calendar.add(calendar.HOUR,2);
            String hours = sdf.format(calendar.getTime()).toLowerCase();
            if (!webElements(timelineHours).get(i).getText().equals(hours)){
                return false;
            }
        }
        return true;
    }
}
