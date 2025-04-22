package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc4Page {
    WebDriver driver;

    By action4Element = By.id("action4ElementId");
    By expectedResult4Element = By.id("expectedResult4ElementId");

    public tc4Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction4() {
        driver.findElement(action4Element).click();
        // Additional actions for action 4 can be added here
    }

    public boolean isExpectedResult4Displayed() {
        return driver.findElement(expectedResult4Element).isDisplayed();
    }
}