Feature: Login   
  Scenario Outline: User invalid login
    When User go to web hrm
    And User enter <username> <password> valid 
    Then User invalid 
  
  Examples: 
  |username|password|
  | Admin    | Admin1234 |
  | Admin    | adminn123 |
  | Adminn   | Addmin123 |
  | Admmin   | admin123  |
  | Admins   | minad921  |
  | Adminss    | admin123  |