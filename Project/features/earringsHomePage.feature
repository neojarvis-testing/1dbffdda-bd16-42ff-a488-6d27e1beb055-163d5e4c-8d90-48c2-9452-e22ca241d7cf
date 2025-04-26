@Earrings
Feature: Earrings Home Page Functinallity 
    Scenario Outline: Earrings Home Page Verification
        Given I verify the Logo.
        When I click on serachIcon.
        And I click on SearchBar.
        And I send data to Search Bar as "<Data>".
        And I click on Enter.
        And I  click on Material.
        And I  click on Gemstone.
        And I click on Zircoina.
        And I click on ShowProduct.
        And I click on FirstProduct.
        And I click on BookAppointment.
        Then I verify Description.
    Examples:
    |Data    |
    |Earrings|

