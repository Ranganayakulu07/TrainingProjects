Feature: Title of your feature
@tag1
Scenario: test the ksrtc application
    Given open chrome browser and URL of the application
    When user enter details
    Then created account successfully

@tag2
Scenario: test the ksrtc application
    Given open chrome browser and URL of the application
    When enter user name and password then click on login button
    Then login successful

@tag3
Scenario: test the search bus
    Given open search bus page
    When enter bus details
    Then display available bus

