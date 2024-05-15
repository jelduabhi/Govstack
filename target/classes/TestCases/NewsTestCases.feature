Feature: News Scenarios


  @createNews @Sanity
  Scenario Outline: Create a news and publish
    Given I launch and login to the Govstack application
    When I selects the news "<TestcaseID>"
    And I enter all the details
    Then I should be able to publsh
    Examples:
      | TestcaseID |  |
      | TC001      |  |

  @createNews @Sanity
  Scenario Outline: Create a news and publish
    Given I launch and login to the Govstack application
    When I selects the news "<TestcaseID>"
    And I enter all the details
    Then I should be able to publsh
    Examples:
      | TestcaseID |  |
      | TC015      |  |
