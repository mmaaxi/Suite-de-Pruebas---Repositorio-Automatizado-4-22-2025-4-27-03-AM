package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc7Page;
import static org.junit.Assert.assertTrue;

public class tc7Steps {
    WebDriver driver;
    tc7Page page;

    public tc7Steps() {
        driver = Hooks.driver;
        page = PageFactory.initElements(driver, tc7Page.class);
    }

    @When("I perform action 7")
    public void iPerformAction7() {
        page.performAction7();
    }

    @Then("I should see result 7")
    public void iShouldSeeResult7() {
        assertTrue(page.isResultDisplayed());
    }
}