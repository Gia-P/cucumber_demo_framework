@web @regression @darksky
Feature: Darksky feature

  Background:
    Given I am on Darksky Home Page

  @darksky-1
  Scenario: Verify invalid signup error message
    Given I am on the darksky Register page
    When I click on Register button
    Then I verify error message "please fill out this field"

  @darksky-2
  Scenario: Verify Current Temperature should not be greater or less than
            the Temperature from Daily Timeline
    Given I am on Darksky Home Page
    Then I verify current temp is not greater or less then temps from daily timeline