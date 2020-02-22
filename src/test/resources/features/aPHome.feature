Feature: Automation Practice HomePage features
  @hover-over
  Scenario: As a user I can hover over women's section and get to casual dresses page
    Given I'm on AP homepage
    Then I hover over womens tab
    And I click on casual dresses link
    Then I am navigated to causal dresses page


  @right-click
  Scenario: As a user I can right click on the element and select copy
    Given I' on swisnl page
    Then I right click on element and verify functionality

  @drag-drop
  Scenario: As a user I can drag and drop cities
    Given I'm on the dhtmlgoodies page
    Then I can drag and drop city
    Then I verify color of answer

  @tooltip
  Scenario: As a user I should see tooltop
    Given I'm on jQuery page
    Then I see tooltip on the age inputbox

    @upload
    Scenario: As a user I should upload a file in AT
      Given I'm on automation practice page
      Then I should be able to upload a file

  @download
  Scenario: As a user I should download a file
    Given I'm on automation demo page
    Then I download a file
