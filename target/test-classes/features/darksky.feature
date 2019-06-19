@web @regression @darksky
Feature: Darksky feature

  Background:
    Given I am on Darksky home page

  @darksky-1
  Scenario: Verify invalid signup error message
    Given I am on the darksky Register page
    When I click on Register button
    Then I verify error message "please fill out this field"