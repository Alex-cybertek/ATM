Feature: This is a feature for ATM_Project
@1
Scenario:  As an Admin user for ATM, I should be able to Select Language from the list
	Given I navigate to ATM page
	And I should be able to see 'Select your language' text on the page
	Then I should be able to click on 'English' button and see 'Please enter PIN' text
	And I should be able to click 'Cancel' button and see 'Select your language' text
	Then I should be able to click 'Spanish" button and see 'In Spanish'
	And I should be able to click 'Cancel' button and see 'Select your language' text
	
@2
Scenario:  As an Admin user for ATM, I should be able to Select Language from the list
	Given I navigate to ATM page
	And I should be able to see 'Select your language' text on the page
	Then I should be able to click on 'English' button and see 'Please enter PIN' text
	And I should be able to enter invalid PIN, click 'Enter' and see 'PIN incorrect, enter valid PIN' text
	
@3
Scenario Outline:  As an Admin user for ATM, I should be able to Select Language from the list
	Given I navigate to ATM page
	And I should be able to see 'Select your language' text on the page
	Then I should be able to click on 'English' button and see 'Please enter PIN' text
	And I should be able to enter <invalid PIN> three times and see 'Account is blocked' text
	
Examples:

	|invalid PIN |
	|"3343437"|
	|"5656565"|
	|"5454468"|
	
@4
Scenario:  As an Admin user for ATM, I should be able to Select Language from the list
	Given I navigate to ATM page
	And I should be able to see 'Select your language' text on the page
	Then I should be able to click on 'English' button and see 'Please enter PIN' text
	And I should be able to enter valid PIN, click 'Enter' and see 'Select Transaction' text
	
@5
Scenario:  As an Admin user for ATM, I should be able to Select Language from the list
	Given I navigate to ATM page
	And I should be able to see 'Select your language' text on the page
	Then I should be able to click on 'English' button and see 'Please enter PIN' text
	And I should be able to enter valid PIN, click "Enter" and see 'Select Transaction' text
	Then I should be able to click 'Withdrawal' button and see 'Select account to withdraw'
	And I should be able to click 'Checking' button and see 'Please Enter amount' text
	Then I should be able to input amount and click 'Enter'
	And I should see 'Please take your money' text
	
	
	
	
	
	