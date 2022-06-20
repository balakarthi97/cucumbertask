#Author: your.email@your.domain.com
Feature: Tv Purchase

  Background:
   Given user launches flipkart application
   And user login flipkart with login credentials

  Scenario: Tv Purchase
    When user search tv and choose
    And user add tv to addtocart and doing payment
    Then user validates confirmation message
    
    Scenario: Flipkart tv Search List
    When user search tv and choose add one dim list
    |Sumsung tv|Sony tv|
    And user add tv to addtocart and doing payment
    Then user validates confirmation message
    
    Scenario: Flipkart tv Search Map
    When user search tv and choose add one dim map
    |Tv1|Sumsung tv|
    |Tv2 | Sony tv|
    |Tv3 | Redmi tv|
    And user add tv to addtocart and doing payment
    Then user validates confirmation message
    
    Scenario Outline:
    When user search tv and choose "<Tv>"
    And user add tv to addtocart and doing payment
    Then user validates confirmation message
    
    Examples:
    | Tv |
    | Sumsung tv |
    | Sony tv |
    | Redmi tv |
 
