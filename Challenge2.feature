
Feature: Online Shop
    Scenario: Acquire Product
    Given I enter on Shop Web
    When Search and select my product
    And Set the quantity on 3
    And Add the product to the cart
    And Click on Buy button
    And Set the payment Method
    And Process the purchase
    Then The purchase is processed
    And  I can check it on orders page