package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc2Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc2Steps {
    WebDriver driver;
    tc2Page page;

    public tc2Steps() {
        this.driver = Hooks.getDriver();
        this.page = PageFactory.initElements(driver, tc2Page.class);
    }

    @Given("the user is on the specific page")
    public void the_user_is_on_the_specific_page() {
        page.navigateToSpecificPage();
    }

    @When("the user performs Action 2")
    public void the_user_performs_action_2() {
        page.performAction2();
    }

    @Then("the user should see Result 2")
    public void the_user_should_see_result_2() {
        assertTrue(page.isResult2Visible());
    }
}