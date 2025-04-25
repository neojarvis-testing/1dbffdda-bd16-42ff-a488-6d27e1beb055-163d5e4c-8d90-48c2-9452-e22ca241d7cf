@Two
Feature: funcitionality on Footer
	Scenario:  funcitionality on Footer
    Given I scroll To Footer
    When I click On Terms Of Use
    And I verify Terms Of Use Title
    And I verify Terms Of Use Url
    And I click On Terms And Conditions
    And I verify Terms And Conditions Title
    And I  verify Terms And Conditions Url
    And I click On Privacy Policy
    And I verify Privacy Policy Title
    And I verify Privacy Policy Url
    And I click On Imprint
    And I verify imprint Title
    And I verify imprint Url
    And I click On Accessibility
    And I verify Accessibility Title
    And I verify Accessibility Url
    And I click On California Supply Chain Act
    And I verify California Supply Chain Act Title
    And I verify California Supply Chain Act Url
    And I click On California PrivacyRights
    And I verify California PrivacyRights Title
    And I verify California PrivacyRights Url
    Then I verify Legal