@DiamondFeature
Feature: Testing Swarovski Diamonds Automation.
    Scenario: I want to select a diamond ring.
        Given I hover on Diamonds.
        When I click on eternity.
        And  I verify the text in URL.
        And I click on categories.
        And I click on Rings.
        And I click on show products button.
        And I click on Material.
        And I click on Sterling Silver.
        And I click on show all products.
        Then I captured a screenshot.