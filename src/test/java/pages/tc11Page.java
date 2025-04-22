package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class tc11Page {
    private WebDriver driver;
    
    public tc11Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void performAction11() {
        // Locate the element related to action 11 and perform the necessary action
        WebElement actionElement = driver.findElement(By.id("action11Id"));
        actionElement.click();
    }
    
    public boolean verifyExpectedResult11() {
        // Verify the expected result, return true if matches
        WebElement resultElement = driver.findElement(By.id("result11Id"));
        return resultElement.isDisplayed();
    }
}