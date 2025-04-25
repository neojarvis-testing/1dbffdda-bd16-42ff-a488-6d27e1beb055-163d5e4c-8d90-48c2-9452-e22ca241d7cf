@Footer
Feature: HomePage Footer Functionality
Scenario: Home Page footer elements title and url verification.
    Given clickOnCustomerServiceOverview.
    When verify URL Of CustomerServiceOverview.
    And verify TitleOfCustomerServiceOverview.
    And backward.
    And click On OrderStatus.
    And verify URL OfOrderStatus.
    And verify Title Of OrderStatus.
    And backward.
    And click On GiftCardBalance.
    And verify URL Of GiftCardBalance.
    And verify Title Of GiftCardBalance.
    And backward.
    And click On Shipping.
    And verify URL Of Shipping.
    And verify Title Of Shipping.
    And backward.
    And click On ReturnsAndExchange.
    And verify URL Of ReturnsAndExchange.
    And verify Title Of ReturnsAndExchange.
    And backward.
    And click On ContactUs.
    And verify URL Of ContactUs.
    And verify Title Of ContactUs.
    And backward.
    And click On SizeGuide.
    And verify URL Of SizeGuide.;
    And verifyTitle Of SizeGuide.
    And backward.
    And click On StoreFinder.
    And verify URL Of StoreFinder.
    And verify Title Of StoreFinder.
    And backward.
    Then verifyMembership.