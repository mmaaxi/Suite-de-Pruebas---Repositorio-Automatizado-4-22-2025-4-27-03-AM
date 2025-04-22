package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc6Page {

    WebDriver driver;

    public tc6Page(WebDriver driver) {
        this.driver = driver;
    }

    private By action6Button = By.id("action6Button");
    private By expectedResult6 = By.id("expectedResult6");

    public void executeAction6() {
        WebElement button = driver.findElement(action6Button);
        button.click();
    }

    public boolean isExpectedResult6Displayed() {
        WebElement resultElement = driver.findElement(expectedResult6);
        return resultElement.isDisplayed();
    }
}