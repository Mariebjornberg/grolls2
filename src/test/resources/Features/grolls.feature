Feature: grolls
  In order to avoid silly mistakes As a math idiot I want to be told the sum of two numbers


  @mytag

  Scenario: Add two t-shirts size smal
    Given I selected size smal
    And I have also selected two shirts
    When I press add to cart
    Then the result should be 2 in the basket
