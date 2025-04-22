package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc9Page {

    WebDriver driver;

    public tc9Page() {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToInitialPage() {
        driver.get("http://example.com/initial");
    }

    public void performAction9() {
        WebElement actionElement = driver.findElement(By.id("action9"));
        actionElement.click();
    }

    public String getActionResult() {
        WebElement resultElement = driver.findElement(By.id("result9"));
        return resultElement.getText();
    }
}