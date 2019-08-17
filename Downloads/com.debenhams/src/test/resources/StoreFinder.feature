@regression
Feature: search
  As a end user
  I want to search store location
  So that i can see the store location
  @storeFinder
  Scenario:storeFinder
    Given I am on Homepage
    When  I click the store finder
    And I enter the city "Hounslow"
    Then I able to see the store location
