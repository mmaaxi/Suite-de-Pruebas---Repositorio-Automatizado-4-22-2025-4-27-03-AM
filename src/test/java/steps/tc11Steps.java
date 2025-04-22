package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.tc11Page;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc11Steps {
    private WebDriver driver;
    private tc11Page page;
    
    @Given("the application is open")
    public void theApplicationIsOpen() {
        driver = new ChromeDriver();
        driver.get("http://example.com");
        page = new tc11Page(driver);
    }
    
    @When("I perform action 11")
    public void iPerformAction11() {
        page.performAction11();
    }
    
    @Then("I should see expected result 11")
    public void iShouldSeeExpectedResult11() {
        assertTrue(page.verifyExpectedResult11());
        driver.quit();
    }
}