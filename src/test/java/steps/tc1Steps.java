package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc1Page;

public class tc1Steps {

    tc1Page page = new tc1Page();

    @Given("I am on the initial page")
    public void i_am_on_the_initial_page() {
        page.navigateToInitialPage();
    }

    @When("I perform action 1")
    public void i_perform_action_1() {
        page.performAction1();
    }

    @Then("I observe resultado esperado 1")
    public void i_observe_resultado_esperado_1() {
        Assert.assertTrue(page.verifyResultadoEsperado1());
    }
}