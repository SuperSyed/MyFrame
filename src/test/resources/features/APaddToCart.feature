Feature: Add to Cart
  @AP-add-to-cart
  Scenario: As a customer I can add item to the cart
    Given I'm on AP homepage
    And I search for "Dress" on AP
    Then I click on search button on AP
    Then I clcik on list view Button on AP
    And I click on add to cart on AP
    Then I see proceed to checkout button is enabled on AP
    And product title includes "Dress" keyword on AP
    And I see message "Product successfully added to your shopping cart"