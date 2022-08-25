Feature: Addition of products to cart and Checkout

@PlaceOrder
Scenario Outline: Search experience for product search in both home page and offers page
    Given User is on GreenCart landing Page
    When User searched with short name <Name> and extracted the productname
    And  User adds "12" items
    And  User moves to checkoutPage
    And validate that product name in offers page matched with landing 
    And Apply button is visible
    And Place Order button is visible

    Examples:
    |Name|
    |Tom|
    

