Feature: Login   
  Scenario Outline: User invalid register
    When User go to register page shop demo qa
    And User enter <username>, <email>, and <password> invalid
    Then User invalid register
    
   Examples:
   |username|email|password|
   |juned|juned@hui|junai|
   |kunma|kumnala.com|kundi|
   |likun|lunikdi@huk|kulas|
   |jikun|juhir@juni|okas|