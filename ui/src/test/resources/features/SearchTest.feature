Feature: Search

Scenario: I can search the tariff
  Given I am on main page
  And I open search panel
  And I search "Мой"
  When I select tariff "Мой разговор"
  Then url is "/tariff/my-conversation"
  And tariff price is 200
