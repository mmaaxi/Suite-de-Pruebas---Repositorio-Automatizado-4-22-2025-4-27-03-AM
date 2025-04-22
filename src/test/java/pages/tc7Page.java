package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc7Page {
    WebDriver driver;

    @FindBy(id = "actionElement")
    private WebElement actionElement;

    @FindBy(id = "resultElement")
    private WebElement resultElement;

    public tc7Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction7() {
        actionElement.click(); // Adjust the action as needed
    }

    public boolean isResultDisplayed() {
        return resultElement.isDisplayed();
    }
}