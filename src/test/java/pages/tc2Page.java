package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc2Page {
    WebDriver driver;

    @FindBy(id = "action2")
    WebElement action2Button;

    @FindBy(id = "result2")
    WebElement result2Element;

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSpecificPage() {
        driver.get("http://example.com/specific-page");
    }

    public void performAction2() {
        action2Button.click();
    }

    public boolean isResult2Visible() {
        return result2Element.isDisplayed();
    }
}