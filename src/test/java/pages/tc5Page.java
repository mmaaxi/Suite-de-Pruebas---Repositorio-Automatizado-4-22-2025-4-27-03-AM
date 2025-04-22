package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc5Page {
    WebDriver driver;
    
    // Locator for the element related to action 5
    By action5Element = By.id("action5ElementID");
    
    // Locator for the element that confirms expected result 5
    By expectedResult5Element = By.id("expectedResult5ElementID");

    public tc5Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction5() {
        driver.findElement(action5Element).click();
    }

    public boolean isExpectedResult5Displayed() {
        return driver.findElement(expectedResult5Element).isDisplayed();
    }
}