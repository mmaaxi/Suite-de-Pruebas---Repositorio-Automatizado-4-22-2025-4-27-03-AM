package pages;

import org.openqa.selenium.WebDriver;

public class tc8Page {
    private WebDriver driver;

    public tc8Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMainPage() {
        driver.get("http://example.com/main");
    }

    public void performAction8() {
        // Add code to perform action 8
    }

    public void verifyExpectedResult8() {
        // Add code to verify expected result 8
    }
}