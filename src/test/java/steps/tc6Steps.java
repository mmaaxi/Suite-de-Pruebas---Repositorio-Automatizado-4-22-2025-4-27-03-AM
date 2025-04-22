package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc6Page;
import static org.junit.Assert.assertTrue;

public class tc6Steps {

    WebDriver driver;
    tc6Page page;

    public tc6Steps(WebDriver driver) {
        this.driver = driver;
        page = PageFactory.initElements(driver, tc6Page.class);
    }

    @When("I perform action 6")
    public void performAction6() {
        page.executeAction6();
    }

    @Then("I should see the expected result 6")
    public void validateExpectedResult6() {
        assertTrue(page.isExpectedResult6Displayed());
    }
}