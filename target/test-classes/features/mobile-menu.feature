@mobile @mobile-regression @menu
Feature: Menu feature

  @menu-1
  Scenario: Verify sidebar validation
    When I tap on skip button
    And I click on hamburger menu
    Then I verify sidebar menu is displayed

  @menu-2
  Scenario: Verify user should be able to view default main menu bar items
    Given I am on home page of the app
    When I click on hamburger menu
    Then I verify default main menu bar fields