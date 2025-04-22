package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1Page {

    WebDriver driver;

    public tc1Page() {
        // Setup the chromedriver path
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        driver = new ChromeDriver();
    }

    public void navigateToInitialPage() {
        driver.get("http://example.com");
    }

    public void performAction1() {
        WebElement actionElement = driver.findElement(By.id("action1"));
        actionElement.click();
    }

    public boolean verifyResultadoEsperado1() {
        WebElement resultElement = driver.findElement(By.id("resultadoEsperado1"));
        return resultElement.isDisplayed();
    }

    public void closeDriver() {
        driver.quit();
    }
}