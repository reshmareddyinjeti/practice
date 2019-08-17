@regression
Feature: Filter
  As a end user
  I Want to  search for a product
  So That i can see the respective results
  @categories
  Scenario:
 Given I am on Homepage
  When I click Men
    And I select a customer "categories"
    Then I should see all the product filtered categories