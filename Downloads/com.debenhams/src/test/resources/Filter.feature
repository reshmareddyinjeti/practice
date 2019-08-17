@regression
Feature: Filter
  As a end user
  I Want to  search for a product
  So That i can see the respective results
  @Filter
  Scenario:Filter
    Given I am on Homepage
    When I move to Men
    And I click on All shoes & boots
    Then I able to see the product
    Then I take a Screen shot
