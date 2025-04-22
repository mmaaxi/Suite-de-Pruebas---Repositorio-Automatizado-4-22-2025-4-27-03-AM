package steps;

import org.openqa.selenium.WebDriver;
import pages.tc8Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class tc8Steps {
    private WebDriver driver;
    private tc8Page page;

    public tc8Steps() {
        this.driver = Hooks.getDriver();
        this.page = new tc8Page(driver);
    }

    @Given("^I am on the main page$")
    public void i_am_on_the_main_page() {
        page.navigateToMainPage();
    }

    @When("^I perform action 8$")
    public void i_perform_action_8() {
        page.performAction8();
    }

    @Then("^I should see the expected result 8$")
    public void i_should_see_the_expected_result_8() {
        page.verifyExpectedResult8();
    }
}