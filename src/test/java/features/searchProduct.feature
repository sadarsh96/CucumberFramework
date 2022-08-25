Feature: Search and place order for products


@SearchProduct
  Scenario Outline: Search experience for product search in both home page and offers page
    Given User is on GreenCart landing Page
    When User searched with short name <Name> and extracted the productname
    Then user searched the <Name> short name in offer page to verify if the product exist
    And validate that product name in offers page matched with landing page

    Examples:
    |Name|
    |Tom|
    |Straw|