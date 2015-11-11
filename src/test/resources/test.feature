Feature: Navigate to Virtual Tours screen

  Scenario: Verify that user can go to Virtual Tours page from homepage

    Given that user navigates to YouVisit
    When the user clicks on the 'Create' button
    When the user clicks on the 'Get Started' button
    When the user clicks on the 'Free - Get Started' button
    When the user clicks log in
    When the user logs in
    Then the Virtual Tours screen should show