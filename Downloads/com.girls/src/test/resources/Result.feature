@Search
Feature: search
  As an end user
  I want to search for a product
  So that i can see the refined product
  @smoke
  Scenario:Sort By
    Given I am on Homepage
    When I search for a product "Tv"
    And  I move to "Sort By" Relevance
    Then I select the "Price: Low - High"
    Then I take the screens sort

