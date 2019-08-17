@regression
Feature: Search for a product
  As a end user
  I Want to search for a product
  So That i can see the respective results
  @search
  Scenario:Search
    Given I am on Homepage
    When I Search for a product "mens t shirts"
    Then  I see the respective results
