Feature: Region

  Scenario: I can get regions
    When I get regions
    Then All region IDs consist of numbers
    And All region product IDs matches pattern "^prod.+"
