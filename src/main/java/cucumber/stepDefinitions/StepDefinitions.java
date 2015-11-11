package cucumber.stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

/**
 * Created by Rocky on 11/10/15.
 */
public class StepDefinitions {

//    WebDriver driver = new FirefoxDriver();

    @Given("^that user navigates to YouVisit$")
    public void navigateToYouVisit() {
        open("http://www.youvisit.com/");
    }

    @When("^the user clicks on the 'Create' button$")
    public void clickCreateButton() {
        $(By.className("livevideo-btn-primary-medium")).click();
    }

    @When("^the user clicks on the 'Get Started' button$")
    public void clickGetStartedButton() {
        $(By.className("banner-btn-primary-medium")).click();
    }

    @When("^the user clicks on the 'Free - Get Started' button$")
    public void clickFreeGetStartedButton() {
        $(By.className("testimonial-btn-primary-medium")).click();
    }

    @When("^the user clicks log in$")
    public void clicksLogIn() throws Throwable {
        $(By.className("loginlink")).click();
    }

    @When("^the user logs in$")
    public void logInViaGoogle() throws Throwable {
        $(By.name("identifier")).setValue("imtihoss@gmail.com");
        $(By.cssSelector("#loginForm > input:nth-child(3)")).setValue("abcd1234");
        $(By.id("loginButton")).click();
    }

    @Then("^the Virtual Tours screen should show$")
    public void assertVirtualToursScreenShows() throws Throwable {
        $(By.cssSelector("#profile-content > div.clearfix.top50 > h1")).shouldHave(text("imtiz.hossain's Virtual Tours"));
    }
}
