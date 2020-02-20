Feature: Automation Practice HomePage features
  @hover-over
  Scenario: As a user I can hover over women's section and get to casual dresses page
    Given I'm on AP homepage
    Then I hover over womens tab
    And I click on casual dresses link
    Then I am navigated to causal dresses page