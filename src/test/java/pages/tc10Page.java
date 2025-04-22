package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc10Page {
    private WebDriver driver;
    private By action10Element = By.id("action10Element");
    private By expectedResult10Element = By.id("expectedResult10Element");

    public tc10Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction10() {
        driver.findElement(action10Element).click();
    }

    public boolean isExpectedResult10Visible() {
        return driver.findElement(expectedResult10Element).isDisplayed();
    }
}