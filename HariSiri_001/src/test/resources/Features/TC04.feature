Feature: Create Skills Records Automatiom in orange hrm
	
Background: Common Steps 
    Given User Launch Chrome Browser
    When User opens URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"


Scenario: TC03- Data Table With Headers
    And User Enters Login Credentials Using Data Table With Headers
    |UserNAME|PassWORD|
    |Admin|admin123|
    
    Then Click On LoginButton
    Then Navigate to Skills Page  
    When Add Skill Record Using Data Table With Headers
    
    |SkillNAME|SKILLdescr|
    |JAva999|JavaDescr999|
    |JAva666|JavaDescr666|
    |JAva888|JavaDescr888|
    |JAva555|JavaDescr555|
    
    When Click on Logout Button
    Then Close the Browser
    
    