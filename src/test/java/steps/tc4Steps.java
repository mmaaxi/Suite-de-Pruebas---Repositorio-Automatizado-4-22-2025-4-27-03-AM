package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc4Page;

public class tc4Steps {
    WebDriver driver;
    tc4Page page;

    public tc4Steps() {
        this.driver = Hooks.driver;
        page = new tc4Page(driver);
    }

    @When("the user performs action 4")
    public void the_user_performs_action_4() {
        page.performAction4();
    }

    @Then("the expected result 4 should be displayed")
    public void the_expected_result_4_should_be_displayed() {
        Assert.assertTrue("Expected result 4 is not displayed", page.isExpectedResult4Displayed());
    }
}