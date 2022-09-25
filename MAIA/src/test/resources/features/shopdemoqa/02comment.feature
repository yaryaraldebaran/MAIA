Feature: Comment   
  Scenario Outline: User invalid comment
    When User go to marc jacobs gotham saddle bag
    And User enter <username>, <email>, <comment>, <captcha> invalid 
    Then Comment invalid 
  
  Examples: 
  |username|email|comment|captcha|
  |jukidir|jukidir@getm|comment_satu|12|
  |rikadu|kudari@geto|comment_dua|13|
  |kurtasi|kuratsi@gmail|comment_tiga|15|
  |jukian|jukats.gmail.com|comment_empat|13|
  