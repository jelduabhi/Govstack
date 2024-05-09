Feature: News Scenarios

  Background: Login the page
    Given I launch and login to the Govstack application

  Scenario: Create a news and publish
    When I selects the news
    And I enter all the details
    Then I should be able to publsh