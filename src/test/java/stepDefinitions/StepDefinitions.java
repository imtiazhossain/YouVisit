package stepDefinitions;

import com.thoughtworks.selenium.webdriven.commands.DragAndDropToObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

/**
 * Created by Rocky on 11/10/15.
 */
public class StepDefinitions {

//    WebDriver driver = new FirefoxDriver();

    @Given("^that user navigates to YouVisit$")
    public void navigateToYouVisit() {
        open("http://qa.dev.youvisit.com/");
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
        $(By.cssSelector("#container > header > nav > ul > li:nth-child(6) > div")).click();
    }

    @When("^the user logs in$")
    public void logInViaGoogle() throws Throwable {
        $(By.name("identifier")).setValue("qa@youvisit.com");
        $(By.cssSelector("#loginForm > input:nth-child(3)")).setValue("12345");
        $(By.id("loginButton")).click();
    }

    @Then("^the Virtual Tours screen should show$")
    public void assertVirtualToursScreenShows() throws Throwable {
        $(By.cssSelector("#profile-content > div.clearfix.top50 > h1")).shouldHave(text("qatest's Virtual Tours"));
    }

    @Given("^I click edit$")
    public void i_click_edit() throws Throwable {
        $(By.cssSelector("#gridview > div > form > div.tour")).hover();
        $(By.cssSelector("#gridview > div > form > div.tour > div.actions > div.rounded > div.edit-button.action.icon-button.icon-svg.dashed")).click();
    }

    @Given("^I upload$")
    public void i_upload() throws Throwable {
//        File file = new File("/Users/imtiazhossain/yv_website/Assets/img/tour/embedimage/1_b.png");
        String file = "/Users/imtiazhossain/yv_website/Assets/img/tour/embedimage/1_b.png";
        executeJavaScript("$('#mediaBinContainer .addmedia .fileInput').css({'display':'block'})");
        $(By.xpath("//*[@id=\"mediaBinContainer\"]/div[1]/ul/li[1]/div/input")).sendKeys(file);
        sleep(5000);

    }
}
