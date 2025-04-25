@one
Feature: funcitionality on AboutUs
	Scenario: funcitionality on AboutUs
		Given I scroll To About swarovski
        When I click On About Swarovski
        And I verify AboutSwarovski Title
        And I verify AboutSwarovski Url
        And I click On Sustainability
        And I verify Sustainability Title
        And I verify Sustainability Url
        And I click On JobsAndCareer
        And I verify JobsAndCareer Title
        And I verify JobsAndCareer Url
        And I click On AlumniCommunity And Switch
        And I verify AlumniCommunity Title
        And I verify AlumniCommunity Url
        And I click On Corporategifts
        And I verify Corporategifts Title
        And I verify Corporategifts Url
        And I click ForProfessional
        And I verify ForProfessional Title
        And I verify ForProfessional Url
        And I click On Sitemap
        And I verify Sitemap Title
        And I verify SitemapUrl
        Then I verify AboutUs
    
    
