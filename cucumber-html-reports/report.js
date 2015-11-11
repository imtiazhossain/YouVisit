$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("test.feature");
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
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "the user clicks on the \u0027Free - Get Started\u0027 button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the user clicks log in",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user logs in",
  "keyword": "When "
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
  "duration": 11967354291,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickCreateButton()"
});
formatter.result({
  "duration": 560202874,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickGetStartedButton()"
});
formatter.result({
  "duration": 5168540610,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clickFreeGetStartedButton()"
});
formatter.result({
  "duration": 255072373,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.clicksLogIn()"
});
formatter.result({
  "duration": 3065641319,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.logInViaGoogle()"
});
formatter.result({
  "duration": 1598326132,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitions.assertVirtualToursScreenShows()"
});
formatter.result({
  "duration": 4387362001,
  "error_message": "Element should have text \u0027imtiz.hossain\u0027s Virtual Tours\u0027 {#profile-content \u003e div.clearfix.top50 \u003e h1}\nElement: \u0027\u003ch1 class\u003d\"left\"\u003eimtiaz.hossain\u0027s Virtual Tours\u003c/h1\u003e\u0027\nScreenshot: file:/Users/Rocky/IdeaProjects/YouVisit/build/reports/tests/1447210816515.0.png\nTimeout: 4 s.\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.checkCondition(AbstractSelenideElement.java:554)\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.should(AbstractSelenideElement.java:521)\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.invokeShould(AbstractSelenideElement.java:309)\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.dispatchSelenideMethod(AbstractSelenideElement.java:186)\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.dispatchAndRetry(AbstractSelenideElement.java:90)\n\tat com.codeborne.selenide.impl.AbstractSelenideElement.invoke(AbstractSelenideElement.java:65)\n\tat com.codeborne.selenide.impl.WaitingSelenideElement.invoke(WaitingSelenideElement.java:19)\n\tat com.sun.proxy.$Proxy12.shouldHave(Unknown Source)\n\tat stepDefinitions.StepDefinitions.assertVirtualToursScreenShows(StepDefinitions.java:53)\n\tat ✽.Then the Virtual Tours screen should show(test.feature:11)\n",
  "status": "failed"
});
});