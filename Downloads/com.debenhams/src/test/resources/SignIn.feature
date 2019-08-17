@regression
Feature:
  As a user
  I want to sign in
  So that i can see the refined product
  @signIn
  Scenario:signIn
    Given I am on Homepage
    When I click the sign in
    And I enter the email and pass word and click the sing up button
    Then I able to sing in.
