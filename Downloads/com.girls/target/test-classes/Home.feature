@Search
Feature: search
  As an end user
  I want to search for a product
  So that i can see the refined product

  Scenario:
    Given I am on Homepage
    When I search for a product "Tv"
    Then I selected the filtered product
