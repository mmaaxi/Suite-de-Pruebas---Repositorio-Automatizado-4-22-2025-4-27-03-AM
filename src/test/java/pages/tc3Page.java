package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertEquals;

public class tc3Page {
    WebDriver driver;

    public tc3Page(WebDriver driver) {
        this.driver = driver;
    }

    public void performAction3() {
        // Locate the element and perform action 3
        WebElement element = driver.findElement(By.id("action3Element"));
        element.click(); // Example action
    }

    public void verifyExpectedResult3() {
        // Verify the expected result using assertion
        WebElement resultElement = driver.findElement(By.id("resultElement"));
        String actualResult = resultElement.getText();
        String expectedResult = "Expected Result 3"; // Replace with actual expected result
        assertEquals(expectedResult, actualResult);
    }
}