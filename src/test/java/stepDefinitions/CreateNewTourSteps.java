package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

/**
 * Created by imtiazhossain on 11/30/15.
 */
public class CreateNewTourSteps {

    @Given("^that user is on the Tour builder page$")
    public void that_user_is_on_the_Tour_builder_page() throws Throwable {
    }

    @When("^the user click on the 'New Tour' tile$")
    public void the_user_click_on_the_New_Tour_tile() throws Throwable {
        $(By.cssSelector("#gridview > a")).click();

    }

    @When("^enters info in 'Create a new tour' pop out$")
    public void enters_info_in_Create_a_new_tour_pop_out() throws Throwable {
        $(By.name("location[name]")).setValue("Test");
        $(By.id("tour-type-select")).click();
        $(By.className("other-btn")).click();
        $(By.name("user")).click();
        $(By.cssSelector("#location-details > form > input")).click();
        sleep(3000);

    }

    @Then("^the 'New Tour' page should show$")
    public void the_New_Tour_page_should_show() throws Throwable {
        $(By.cssSelector("body > div.appcontainer.ng-scope > div.app.ng-scope > div.workspace.animated.ngfade.ng-scope > div > div.no-media.animated.ngfade"))
                .shouldHave(text("Well this is a boring stop, let's add some media to it!"));
    }

}
