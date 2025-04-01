@tag
Feature: Bookcart Application tests

  @tag1
  Scenario: login should be success
    Given user navigate to the bookcart application
    And user clicks on the login button
    And user enter the username as deepu
    And user enter the password as deepu123
 
    When user click on the login button
    Then login should be success
    
   #Scenario: login should be success
    #Given user navigate to the bookcart application
    #And user clicks on the login button
    #And user enter the username as deepu
    #And user enter the password as deepu1
 
    #When user clicks on the login button
    #But login should fail
    