@test1
Feature:
    Scenario:
        Given I hover on jwelleries.
        When I click on Pendants.
        And I verify URL for Pendants.
        And I click on Meterial.
        And I click on Crystal.
        And I click on ShowProduc.
        And I verify URL for Crystal.
        And I click on color.
        And I click on White.
        Then I click on ShowProduct for color.
        And I verify the url for color.
