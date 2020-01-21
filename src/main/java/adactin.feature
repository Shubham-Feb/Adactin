@tag
Feature: Login and bookind hotel in adactin page

  @tag1
  Scenario: login to adactin webpage
    Given Launch the browser and give adactin url
    When User enter valid credentials
      | shubhasi | Singh@12 |
    And click to login button
    When then user need to search hotel
    And select the hotel and then continue
    When Book a hotel with client details
    And click to Book now tab
    Then then click to logout tab
