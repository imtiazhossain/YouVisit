$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("CreateFreeTourPage.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to Virtual Tours screen",
  "description": "",
  "id": "navigate-to-virtual-tours-screen",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that user can go to Virtual Tours page from homepage",
  "description": "",
  "id": "navigate-to-virtual-tours-screen;verify-that-user-can-go-to-virtual-tours-page-from-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "that user navigates to YouVisit",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user clicks on the \u0027Create\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the user clicks on the \u0027Get Started\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on the \u0027Free - Get Started\u0027 button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "the user clicks log in",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "the user logs in",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the Virtual Tours screen should show",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.navigateToYouVisit()"
});
formatter.result({
  "duration": 20432660222,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickCreateButton()"
});
formatter.result({
  "duration": 642692062,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickGetStartedButton()"
});
formatter.result({
  "duration": 3283437062,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickFreeGetStartedButton()"
});
formatter.result({
  "duration": 698339189,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicksLogIn()"
});
formatter.result({
  "duration": 3044899366,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.logInViaGoogle()"
});
formatter.result({
  "duration": 1061571594,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.assertVirtualToursScreenShows()"
});
formatter.result({
  "duration": 3623656058,
  "status": "passed"
});
formatter.uri("GoToHomepage.feature");
formatter.feature({
  "line": 1,
  "name": "Navigate to YouVisit Homepage",
  "description": "",
  "id": "navigate-to-youvisit-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify that user can go to YouVisit homepage",
  "description": "",
  "id": "navigate-to-youvisit-homepage;verify-that-user-can-go-to-youvisit-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "that user enters youvisit.com in browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "the user presses enter",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the YouVisit homepage should show",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSteps.navigateToYouVisit()"
});
formatter.result({
  "duration": 2362672798,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.the_user_presses_enter()"
});
formatter.result({
  "duration": 22220,
  "status": "passed"
});
formatter.match({
  "location": "HomepageSteps.validateLogoOnPage()"
});
formatter.result({
  "duration": 32319587,
  "status": "passed"
});
});