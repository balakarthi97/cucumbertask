#Author: your.email@your.domain.com

Feature: Title of your feature

    Background:
    Given user launches flipkart application
    And user login flipkart with login credentials
    

    Scenario: Flipkart Mobile Search
    When user search mobile and choose
    And user add mobile to addtocart and doing payment
    Then user validates confirmation message
    
    @Sanity
    Scenario: Flipkart Mobile Search List
    When user search mobile and choose add one dim lists
    |Realme Mobile|iPhone|
    And user add mobile to addtocart and doing payment
    Then user validates confirmation message
    
    @Sanity
    Scenario: Flipkart Mobile Search Map
    When user search mobile and choose add one dim maps
    |Phone1|iPhone|
    |Phone2 | Realme Mobile|
    |Phone3 | Redmi Mobile|
    And user add mobile to addtocart and doing payment
    Then user validates confirmation message
    
    Scenario Outline:
    When user search mobile and choose "<Phone>"
    And user add mobile to addtocart and doing payment
    Then user validates confirmation message
    
    Examples:
    | Phone |
    | iPhone |
    | Realme Mobile |
    | Redmi Mobile |

