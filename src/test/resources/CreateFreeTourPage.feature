Feature: Create then delete new Tour

  Scenario: Verify that user can go to Virtual Tours page from homepage

    Given that user navigates to YouVisit
#    When the user clicks on the 'Create' button
#    And the user clicks on the 'Get Started' button
#    And the user clicks on the 'Free - Get Started' button
    And the user clicks log in
    And the user logs in
    And I click edit
    And I upload

#  Scenario: Verify that user can create a new Tour
#
#    Given that user is on the Tour builder page
#    When the user click on the 'New Tour' tile
#    And enters info in 'Create a new tour' pop out
#    Then the 'New Tour' page should show
#
#  Scenario: Verify that user can delete a create Tour
#
#    Given that user created a tour
#    When the user clicks the delete buttont
#    Then deleted Tour should no longer be present