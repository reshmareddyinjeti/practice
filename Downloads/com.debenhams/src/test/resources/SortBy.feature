@smoke
Feature: Search for a product
  As a end user
  I Want to sort the products
  So That i can see the respective results
  @sortBy
  Scenario:SortBy
    Given I am on Homepage
    When I Search for a product "mens t shirts"
    And  I move to "Sort By" Relevance
    Then I select the "Best selling"
    Then I take the screens shot

