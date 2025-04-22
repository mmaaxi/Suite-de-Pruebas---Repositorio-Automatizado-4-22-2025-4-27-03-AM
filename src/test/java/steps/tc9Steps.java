package steps;

import pages.tc9Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class tc9Steps {

    tc9Page page;

    @Given("^I am on the initial page$")
    public void i_am_on_the_initial_page() {
        page = new tc9Page();
        page.navigateToInitialPage();
    }
    
    @When("^I perform action 9$")
    public void i_perform_action_9() {
        page.performAction9();
    }

    @Then("^I should see \"([^\"]*)\"$")
    public void i_should_see_result(String expectedResult) {
        String actualResult = page.getActionResult();
        Assert.assertEquals(expectedResult, actualResult);
    }
}