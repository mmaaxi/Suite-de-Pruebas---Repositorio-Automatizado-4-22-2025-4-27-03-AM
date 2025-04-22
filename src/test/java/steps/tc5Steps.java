package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc5Page;

public class tc5Steps {
    WebDriver driver;
    tc5Page page;

    @Given("the user is on the main page")
    public void userOnMainPage() {
        driver = new ChromeDriver();
        driver.get("http://yourappurl.com");
        page = new tc5Page(driver);
    }

    @When("the user performs action 5")
    public void userPerformsAction5() {
        page.performAction5();
    }

    @Then("the expected result 5 is achieved")
    public void expectedResult5IsAchieved() {
        Assert.assertTrue(page.isExpectedResult5Displayed());
        driver.quit();
    }
}