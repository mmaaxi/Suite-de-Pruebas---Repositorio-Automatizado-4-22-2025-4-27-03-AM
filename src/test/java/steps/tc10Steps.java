package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc10Page;

import static org.junit.Assert.assertTrue;

public class tc10Steps {
    WebDriver driver = new ChromeDriver();
    tc10Page page = new tc10Page(driver);

    @Given("I am on the relevant page")
    public void i_am_on_the_relevant_page() {
        driver.get("URL_of_relevant_page");
    }

    @When("I perform action 10")
    public void i_perform_action_10() {
        page.performAction10();
    }

    @Then("I should see the expected result 10")
    public void i_should_see_the_expected_result_10() {
        assertTrue(page.isExpectedResult10Visible());
        driver.quit();
    }
}