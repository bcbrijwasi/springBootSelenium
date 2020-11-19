Feature: Google search feature

  Scenario Outline: google search demo scenario
    When Load google page
    And Wait for google page to load
    And Search for "<keyword>"
    And Wait for search result page to load
    Then Verify search result count is <result>

    Examples:
      | keyword | result |
      | spring boot |     3   |
      | selenium    |     77   |

