package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Rocky on 11/10/15.
 */
public class HomepageSteps {

    @Given("^that user enters youvisit\\.com in browser$")
    public void navigateToYouVisit() {
        open("http://www.youvisit.com/");
    }

    @When("^the user presses enter$")
    public void the_user_presses_enter() {
    }

    @Then("^the YouVisit homepage should show$")
    public void validateLogoOnPage() {
        $(By.cssSelector("#container > header > a > svg > g.youvisit_text > path")).isDisplayed();
    }
}
