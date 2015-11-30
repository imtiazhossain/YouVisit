package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by imtiazhossain on 11/30/15.
 */
public class DeleteTourSteps {

    @Given("^that user created a tour$")
    public void that_user_created_a_tour() {
        $(By.cssSelector("body > div.appcontainer.ng-scope > div.app.ng-scope > div.header.ng-scope > div.leftHeader > a.ng-binding")).click();
    }

    @When("^the user clicks the delete button$")
    public void the_user_clicks_the_delete_button() {
        $(By.cssSelector("#gridview > div > form > div.tour")).hover();
        $(By.cssSelector("#gridview > div:nth-child(2) > form > div.tour > div.actions > div.delete-button.action.icon-button")).click();
        $(By.cssSelector("#delete-dialog > span.button.primary.deletetour_action")).click();
    }

    @Then("^deleted Tour should no longer be present$")
    public void deleted_Tour_should_no_longer_be_present() {
        // Write code here that turns the phrase above into concrete actions
    }
}
