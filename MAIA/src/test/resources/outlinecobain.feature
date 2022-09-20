Feature: cobain outline

Scenario Outline: cobain outline pertama
    When try method <username> one <password> 
    And try method <username> two <password>
    Then try method three
 
 Scenario Outline: cobain outline kedua
    When try method <username> satu <password> 
    And try method <username> dua <password>
    Then try method tiga
    
    Examples:
     |username|password|
     | Admin    | Admin1234 |
     | Admin    | adminn123 |
     | Adminn   | Addmin123 |
     | Admmin   | admin123  |
     | Admins   | minad921  |
     | Adminss    | admin1233  |