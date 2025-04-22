package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc3Page;

public class tc3Steps {
    WebDriver driver;
    tc3Page page;

    @Given("I navigate to the necessary page")
    public void navigateToNecessaryPage() {
        driver = new ChromeDriver();
        page = new tc3Page(driver);
        driver.get("https://example.com");
    }

    @When("I perform action 3")
    public void performAction3() {
        page.performAction3();
    }

    @Then("I should see the expected result 3")
    public void verifyExpectedResult3() {
        page.verifyExpectedResult3();
        driver.quit();
    }
}