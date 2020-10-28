Feature: Test all the functionalities of Sapphire Heart Slot Game
   

  	Scenario: To check the transferred amount is added to Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, balance, text field to transfer balance and Ok button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on Play button, enter the valid amount to transfer and click on Ok butotn
    Then Player should be blocked from loading the Sapphire Heart game when the amount entered in the transfer page is more than the available balance
	And The exact amount entered in the transfer page should transfer to Sapphire Heart game and same amount should get displayed on the balance section
	And An error should be displayed if the balance field is empty and player should be blocked from loading the Sapphire Heart game
	And An error should be displayed if balance entered was zero and player should be blocked from loading the Sapphire Heart game
	



	Scenario: Select the bet type as 0.01 from the drop down and check the bet value should be 1,2,3,4,5 in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01 and bet value as 1,2,3,4,5
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01 and check the bet value should be 1,2,3,4,5
    Then Bet value should get changed to 1,2,3,4,5 if the bet type selected as 0.01 from the drop down in Sapphire Heart slot game
	
	
	Scenario: Select the bet type as 0.04 from the drop down and check the bet value should be 4,8,12,16 & 20 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as 0.04 and bet value as 4,8,12,16 & 20
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04 and check the bet value should be 4,8,12,16 & 20
    Then Bet value should get changed to 4,8,12,16 & 20 if the bet type selected as 0.04 from the drop down 1 in Sapphire Heart slot game
	
	Scenario: Select the bet type as 0.06 from the drop down and check the bet value should be 6,12,18,24 & 30 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from down 2 and bet value as 6,12,18,24 & 30
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.06 from down  and check the bet value should be 6,12,18,24 & 30
    Then Bet value should get changed to 6,12,18,24 & 30 if the bet type selected as 0.06 from the drop down two in Sapphire Heart slot game
	
	Scenario: Select the bet type as 0.4 from the drop down and check the bet value should be 40,80,120,160 & 200 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4 from drop down and bet value as 40,80,120,160 & 200
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 from drop down and check the bet value should be 40,80,120,160 & 200
    Then Bet value should get changed to 40,80,120,160 & 200 if the bet type selected as 0.4 from the drop down three in Sapphire Heart slot game
	
	

	
	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as ONE, balance and spin button, balance after spin
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE, click on spin button and check the balance after spin
    Then Balance should get deducted by ONE after spin as bet type is selected as 0.01 and bet value as 1 in Sapphire Heart game
	
	
	Scenario: Change the bet value as TWO, do the spin and check whether balance is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as 0.01, bet value as TWO, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO, click on spin button and check the balance
    Then Balance should get deducted by TWO as bet type is selected as 0.01 in Sapphire Heart game
	
	
	Scenario: Change the bet value to THREE, click on spin button and check whether current balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as THREE, balance, spin button and win amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE, click on spin button, check the win amount and check the balance
    Then Current Balance should get deducted by THREE as bet type is selected as 0.01 and bet value as 3 in Sapphire Heart game
	
	
	Scenario: Change the bet value as FOUR, do the spin and check whether balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as FOUR, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR, click on spin button and check the balance
    Then Current Balance should get deducted by FOUR as bet type is selected as 0.01 and bet value as 4 in Sapphire Heart game
	
	
	Scenario: Change the bet value as FIVE, click on spin and check whether existing balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as 0.01, bet value as FIVE, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value to FIVE, click on spin button and check the slot game balance
    Then Existing Balance should get deducted by FIVE as bet type is selected as 0.01 and bet value as FIVE in Sapphire Heart slot game
	

	
	
	

	Scenario: Change the bet value as FOUR, do the spin and check whether balance is deducting according to the changed bet type in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, 0.04 as bet type , FOUR as bet value, balance, spin button and balance after spin
    When Open the Sapphire Heart game by entering the valid URL in browser, enter the valid login details, select the bet value to FOUR, click on spin button and check the balance
    Then Balance should get deducted by FOUR as bet type is selected as 0.04 and bet value as 4 in Sapphire Heart game
	
	
	Scenario: Change the bet type as 0.04 from drop down & bet value to eight do the spin and check whether balance is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type & bet value drop down, bet type as 0.04, bet value as eight, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04 from drop down, bet value to eight click on spin button and check the balance after spin
    Then Balance should get deducted by eight if the bet type is selected as 0.04 and bet value as 8 in Sapphire Heart hot game
	
	
	Scenario: Change the bet value as twelve, do the spin and check whether balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as 0.04, bet value as twelve, balance and spin button
    When Open the Sapphire Heartslot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the bet value as twelve, click on spin button and check the balance
    Then Current Balance should get deducted by twelve as bet type is selected as 0.04 & bet value as 12 in Sapphire Heart game
	
	
	Scenario: Change the bet value to sixteen, click on spin button and check whether current balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.04, bet value as sixteen, bet type & bet values drop down, balance, spin button and balance amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the bet value to sixteen, click on spin button and check the balance
    Then Current Balance should get deducted by sixteen as bet type is selected as 0.04 & bet type as 16 in Sapphire Heart game
	
	Scenario: Change the bet value as twenty, click on spin and check whether existing balance is deducting according to changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, bet type as 0.04, bet value as twenty, bet value drop down, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.04, select the bet value to twenty, click on spin button and check the Sapphire Heart slot game balance
    Then Existing Balance should get deducted by twenty as bet type is selected as 0.04 & bet value as twenty in Sapphire Heart slot game
	
	

	
	
	
	Scenario: Change the bet value as one point SIX, do the spin and check whether balance is deducting according to the changed bet type 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from drop down, bet value as SIX, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as SIX from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by SIX if bet type is selected as 0.06 in Sapphire Heart game
	
	
	Scenario: Change the bet value as twelve, do the spin and check whether balance is deducting according to the changed bet type 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from drop down, bet value as twelve, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as twelve from drop down, click on spin button and check the balance
    Then Balance should get deducted by twelve if bet type is selected as 0.06 & bet value as twelve in Sapphire Heart game
	
	
	Scenario: Change the bet value as eighteen, do the spin and check whether balance is deducting according to the changed bet type 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from drop down, bet value as eighteen from drop down, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.06 from drop down, select the bet vale as eighteen from down, click on spin button and check the balance
    Then Balance should get deducted by eighteen if bet type is selected as 0.06 & bet value as eighteen in Sapphire Heart game
	
	
	Scenario: Change the bet value as twenty four, do the spin and check whether balance is deducting according to the changed bet type 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from drop down, bet value as twenty four, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as twenty four from bet type drop down, click on spin button and check the balance
    Then Balance should get deducted by twenty four if bet type is selected as 0.06 & bet value as twenty four in Sapphire Heart game
	
	
	Scenario: Change the bet value as thirty, do the spin and check whether balance is deducting according to the changed bet type 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.06 from drop down, bet value as thirty, balance, spin button and balance after spin
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as thirty from bet type drop down, click on spin button and check the balance after spin
    Then Balance should get deducted by thirty if bet type is selected as 0.06 & bet value as thirty in Sapphire Heart slot game
	
	
	
	
	
	Scenario: Change the bet value as fourty, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4, bet value as fourty, balance and spin buttone
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as fourty, click on spin button and check the balance
    Then Balance should get deducted by fourty as bet type is selected as 0.4 in Sapphire Heart game
	
	
	Scenario: Change the bet value as eighty, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4, bet value as eighty, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as eighty, click on spin button and check the balance
    Then Balance should get deducted by eighty as bet type is selected as 0.4 in Sapphire Heart game
	
	
	Scenario: Change the bet value as one twenty, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4, bet value as one twenty, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as one twenty, click on spin button and check the balance
    Then Balance should get deducted by one twenty as bet type is selected as 0.4 in Sapphire Heart game
	
	
	Scenario: Change the bet value as one sixty, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4, bet value as one sixty, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as one sixty, click on spin button and check the balance
    Then Balance should get deducted by one sixty as bet type is selected as 0.4 in Sapphire Heart game
	
	
	Scenario: Change the bet value as two hundred, do the spin and check whether balance is deducting according to the changed bet type 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.4, bet value as two hundred, balance and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.4 & bet value as two hundred, click on spin button and check the balance
    Then Balance should get deducted by two hundred as bet type is selected as 0.4 in Sapphire Heart game

	



	#Balance Deduction in credits
	
	Scenario: Change the bet value as ONE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as ONE HUNDRED, balance in credits and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as ONE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by ONE HUNDRED as bet type is selected as 0.01 and bet value as 100 in Sapphire Heart game
	
	
	 Scenario: Change the bet value as TWO HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as TWO HUNDRED, balance in credits and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as TWO HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by TWO HUNDRED, as bet type is selected as 0.01 and bet value as 200 in Sapphire Heart game
	
	
	 Scenario: Change the bet value as THREE HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, 100 Splendid slot game, bet type as 0.01, bet value as THREE HUNDRED, balance in credits and spin button
    When Open the Sapphire Heart game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as THREE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by THREE HUNDRED, as bet type is selected as 0.01 and bet value as 300 in Sapphire Heart game
	
	
	 Scenario: Change the bet value as FOUR HUNDRED, do the spin and check whether balance in credits is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as FOUR HUNDRED, balance in credits and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FOUR HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by FOUR HUNDRED, as bet type is selected as 0.01 and bet value as 400 in Sapphire Heart game
	
	
	 Scenario: Change the bet value as FIVE HUNDRED do the spin and check whether balance in credits is deducting according to the changed bet type in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, bet value as FIVE HUNDRED, balance in credits and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.01, select the bet value as FIVE HUNDRED, click on spin button and check the balance in credits
    Then Balance should get deducted by FIVE HUNDRED as bet type is selected as 0.01 and bet value as 500 in Sapphire Heart game
	
	
	
	
	
	
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.01 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, credits and denomination as 0.01 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.01 and check the balance
    Then Balance amound should be same as denomination 0.01 multiplies by credit in Sapphire Heart slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.04 in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, credits, denomination drop down and denomination as 0.04 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.04 and check the balance
    Then Balance amound should be same as denomination 0.04 multiplies by credit in Sapphire Heart game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.06 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game window, balance, credits, denomination drop down and denomination as 0.06 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.06 and compare the balance
    Then Balance amound should be same as denomination 0.06 multiplies by credit balance in Sapphire Heart slot game
	
	Scenario: Check whether balance is equals to credit multiplies by denomination 0.4 in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, credits and denomination drop down & value as 0.4
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination 0.4 manually with and check the balance
    Then Balance amount should be same after multiplying denomination 0.4 by credit in Sapphire Heart slot game
	

	
		
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount in currency, credits and win amount in credits
    When Open the Ultra Glowing hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Sapphire Heart slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    Then Win amount in credit multiplied by denomination is equal to win amount in currency in Sapphire Heart slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Sapphire Heart slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Sapphire Heart slot game
	
	
	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the dinomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Sapphire Heart slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the balance
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, transfer button, spin button and win amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Sapphire Heart slot game
    Then Win amount should get added to the balance after win and balance should get increased with win amount in Sapphire Heart slot game
	
	

	
	Scenario: Check whether winning amount is getting added to the main balance in credits
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, transfer button, credit balance form, spin button and win amount in credits
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on  balance window to change to credit form, click on spin button till user win and check the balance after win in credits
    Then Win amount should get added to the credit field after win and credit should get increased with win amount in Sapphire Heart game
	
	
	
	
	 Scenario: Check whether user able to play the game when there is insufficiant balance in balance counter the bet and credit values are decreased to equal or less than available balance which enables player to resume the game in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance counter, Auto spin button, validation message, credit types and bet types
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Auto spin button till balance counter turns less than betvalues and check the insufficient validation message and reduce the bet and credit values to resume the play.
    Then Player should be blocked from playing the game when there is less amount in balance counter and reducing the credit and bet types player is enable to continue slot game in Sapphire Heart game
	
	
	
	

	Scenario: Check user instruction messages before and after spin in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button and user instruction message
    When Open the Sapphire Heart hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Sapphire Heart slot game

	
	Scenario: Navigate to home screen from Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game and home button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    Then System should take the player to Home page after clicking on home button from Sapphire Heart game
	
	
	Scenario: Check the functionality of maximize and minimize button in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, maximize button and minimize button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Sapphire Heart slot game
	
	
	
	
	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    When Open the Sapphire Heart  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in Sapphire Heart slot game
	
	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Sapphire Heart slot game
	
	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    Then System should keep performing the spins in Sapphire Heart slot game
	
	
	
	

	Scenario: Check bet value, credit value, home button, info button, play button behavior during autoplay in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality
    When Open the Sapphire Heart game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable in Sapphire Heart slot game
	And Home and Info buttons should not be clickable in Sapphire Heart slot game
	And Spin button should not visible & Stop button should be visible and clickable in Sapphire Heart slot game
	And Spin button should be visble after clicking on stop button in Sapphire Heart slot game
    
    
    Scenario: Check bet & credit value buttons behavior after navigating from gamble page during autoplay and check win amount getting added to balance in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, auto spin button, auto spins option and check for buttons behavior & functionality after navigating from gamble page to game page
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check behavior of different buttons after navigating from gamble page to game page in Sapphire Heart slot game
    Then Bet value & Credit value buttons should not be clickable after navigating from gamble page in Sapphire Heart slot game
	And Win amount should get added to the balance during autoplay in Sapphire Heart slot game
 
    
    Scenario: Check whether auto spin is continued even after switching between the tabs inside a browser session of Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, spin button, auto spin button, browser tabs.
    When Open the Sapphire Heart slot game by entering the valid URL in browser, click on auto wait for the reel spin, open new browser tabs and redirect to game tab and check the spin functionality
    Then Auto spin should be continued even after switching between the tabs in Sapphire Heart slot game
	
	
	
	
	
	
	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.01 and denomination 1 in Sapphire Heart slot game on mobile
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like A, J, back button, bet type 0.01 and deominations 1 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, J, click on back button, select bet type as 0.01 & deominations as 1 and check payout amount
    Then System should display the Payout max amount on each symbol like A, J and payout max amount should get changed whenever player changes the bet type to 0.01 and deomination to 1 in Sapphire Heart slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like Q, K as per the bet type 0.01 and denomination 2 in Sapphire Heart slot game on mobile
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like Q, K, back button, bet type 0.01 and denomination value as 2
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like Q, K, click on back button, select bet type as 0.01 & denomination  values as 2 and check payout amount
    Then System should display the Payout max amount on each symbol like Q, K and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value as 2 in Sapphire Heart slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like diamond as per the bet type 0.01 and denomination as 3 in Sapphire Heart slot game on mobile
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like diamond n etc, back button, bet type 0.01 and denomination as 3 on mobile
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like diamond n etc, click on back button, select bet type as 0.01 & denomination as 3 and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like diamond n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination to 3 in Sapphire Heart slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like circle, A as per the bet type 0.01 and denomination 4 in Sapphire Heart slot game on mobile
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like circle, A n etc, back button, bet type 0.01 and denomination as 4 on mobile
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like circle, A n etc, click on back button, select bet type as 0.01 & denomination value as 4 and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like circle, A n etc and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to 4 in Sapphire Heart slot game on mobile
	
	
	Scenario: Check whether the max payout amount for each symbol like diamond, Q as per the bet type 0.01 and denomination FIVE in Sapphire Heart slot game on mobile
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, icon to open payout table, all symbols, max amount on each symbol like diamond, Q, back button, bet type 0.01 and denomination as FIVE on mobile
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like diamond, Q, click on back button, select bet type as 0.01 & denomination value as FIVE and check payout amount on mobile
    Then System should display the Payout max amount on each symbol like diamond, Q and payout max amount should get changed whenever player changes the bet type to 0.01 and denomination value to FIVE in Sapphire Heart slot game on mobile
	
	
	



		
	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount, gamble button and gamble amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    Then Win amount should be displayed as Gamble amount in the gamble page of the Sapphire Heart slot game
	
	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Sapphire Heart slot game
	
	Scenario: Check whether gamble win amount is getting added to the balance after win in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Sapphire Heart slot game 
	

	
	
	
	Scenario: Check whether on resume feature is enabled in Gamble screen, user can play further left over attempts and check the attempts before and after resuming to gamble screen in Sapphire Heart slot game
	Given chrome browser, valid URL, valid login details, Sapphire Heart slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble attempts, gamble play
	When Open the Sapphire Heart slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on black button and close the browser and again login to the game with new browser
	Then  Resume feature should be enabled and land on the game screen and verify with the left out gamble attempts of Sapphire Heart slot game
	Then Left over attempts should be  between 4 to 1 and the user is enabled to play the remaining attempts


	Scenario: Check whether gamble credit win amount is getting added to the balance after win in Sapphire Heart game 
	Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, credit balance, spin button, credit win amount, gamble button, gamble amount in credits, red button, black button and gamble status
	When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance in credits after win
	Then verify the credit form of currency in gamble page on all fields 
	Then Gamble credit Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Sapphire Heart slot game 


	Scenario: Check whether gamble color win options and game play in landscape mode and verify the win amount in win meter in Sapphire Heart slot game 
	Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, win amount, gamble button, color win option, game play in landscape mode in gamble page, gamble status 
	When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, check the play options and play in landscape mode in gamble page and when user wins check the win meter at main page is same as gamble win amount
	Then Verify the home button is enabled on the game screen after returning from gamble page
	Then Gamble page should provide multiple options for the user to play and enabled to play in landscape mode and check the win meter in main page in Sapphire Heart slot game 


	Scenario: Check whether resume feature is enabled in Gamble screen, when user collect amount in gamble screen without playing Gamble attempts in Sapphire Heart slot game
	Given chrome browser, valid URL, valid login details, Sapphire Heart slot slot game, bet type, denomination, balance, spin button, Gamble screen, Gamble collect
	When Open the Sapphire Heart slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on collect and close the browser and again load to the game 
	Then  Resume feature should not be enabled and land on the game screen of Sapphire Heart slot game


	Scenario: Check whether resume feature is enabled in Gamble screen of Sapphire Heart slot game
	Given Chrome browser, valid URL, valid login details, Sapphire Heart slot slot game, bet type, denomination, balance, spin button, Gamble screen, new browser session.
	When Open the Sapphire Heart slot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type & denomination, click on spin button till win appears and gamble screen in switched and click on red button and close the browser and again login to the game with new browser
	Then  Resume feature should enabled and land on the gamble screen of Sapphire Heart slot game
	Then  On resuming to gamble screen, collect the amount and verify with main  balance addition and win meter amount same as gamble amount in gamble page in Sapphire Heart slot game
	
	
	
	
	
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination ONE in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, denomination as ONE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.01 & denomination as ONE, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination ONE in Sapphire Heart game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 and denomination TWO in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination TWO Sapphire Heart game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination THREE in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, denomination as THREE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as THREE, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination THREE in Sapphire Heart game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination one point FOUR in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, transfer button, bet type as 0.01, denomination as one point FOUR, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.01 & denomination as one point FOUR, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.01 and denomination one point FOUR in Sapphire Heart game
	
	
	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.01 & denomination FIVE in Sapphire Heart game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as 0.01, denomination as FIVE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.01 & denomination as FIVE, click on spin button till player wins, click on gamble button and check the gamble count
    Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.01 & denomination FIVE in Sapphire Heart game

	
	
	
	#1. SapphireHeart_AutoSpin_Check_WinAmount_AddedToBalance

	Scenario: Check whether in AutoSpin win amount is added to balance automatically when new spin starts in Sapphire Heart slot game 
	Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, Autospin button, win amount added to balance
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select autospin, play till win triggers and observe win amount added to main balance in next spin itteration
    Then Automatically Win amount should get added to the main balance after win and balance should get increased with win amount and next spin should continue in Sapphire Heart slot game
 
#2. SapphireHeart_AutoSpin_Reload_Option 

 	Scenario: Check whether reload the game while playing Autospin is allowed in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message.
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Sapphire Heart slot game 
 

#3. SapphireHeart_AutoSpin_Validations_NetworkInteruptions

 	Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, wifi turnOFF and ON, network messages 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin autospin and turn OFF wifi and check for valid message. and turn on wifi for autospin to continued
    Then User is addressed with valid error message 'No Internet' for network interuptions in Sapphire Heart slot game 
    Then User is addressed with valid error message 'Disconnected from Server' for longer duration network interuptions in Sapphire Heart slot game 


#4. SapphireHeart_Balance_Check_MaxBet_WinAmount_AddedTo_Balance 
     
    Scenario: Check whether error messages is displayed on network interuptions and upon good network connection resume to game session in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, gamble collect, max credit and bet value, win amount added to balance
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble collect, win amount added to main balance
    Then MaxBet Win amount should get added to the main balance after win and balance should get increased with win amount in Sapphire Heart slot game    

#5. SapphireHeart_Balance_CreditBalance_For_IncrementalAndDecremental_CreditValue 
      
	Scenario: Check whether incrementing and decrementing the creditvalue, balance is equal to balance in creditform multplies by denomination respectively in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, increment, decrement and balance, balance in credit form, creditvalues
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit balance and verify the balance in credit form and verify the balance
    Then Credit balance for all credit values should be same as balance multiplies by credit value are assigned respectively in Sapphire Heart slot game 
 

#6. SapphireHeartt_Balance_FullAmount_AddedToGame_And_Reload_Option

 	Scenario: Check whether user is allowed to play with full amount in the account in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, Full amount transfer from account to game.
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, select game and transfer full amount same amount has to reflect in game balance, play and reload the game 
    Then Remaining balance should be transfered to main account balance in Sapphire Heart slot game 
 

#7. SapphireHeart_Balance_InsufficiantBalance_Validation1 

 	Scenario: Check whether user able to play the game when there is insufficiant balance in account and verify when the insuffficient alert popup is displayed with the game buttons during behavior during alert popup in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button and validation message, button behavior, 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message with buttons behavior 
    Then Check the insufficient alert popop is displayed before the clicking on spin 
    Then Player should be blocked from playing the game when there is no balance in the account and buttons are inactive state in Sapphire Heart game


#8. SapphireHeart_Check_BetType_BetValue_DropDown_For_IncrementalAndDecremental_CreditValue
   
 	Scenario: Check whether incrementing and decrementing the creditvalue, betval amount are assigned respectively in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, increment, decrement and betvalue amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, inc and dec credit and verify the betvalue assigned respectively 
    Then Bet amount for all credit values should be assigned respectively in Sapphire Heart slot game 


#9. SapphireHeart_Check_SessionExpired_Messages 
    
 	Scenario: Check whether error messages is displayed on game session is being idle for more than 20minutes in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, full screen, landscape mode ,session terminated messages 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, and full screen and change orientation of the screen, idle for more 20mins  
    Then User is addressed with valid error message on the screen 'Session Expired' in Sapphire Heart slot game 
    Then Again relauch other slot game and verify user is able to continue gameplay
 

#10. SapphireHeart_Gamble_GamblePage_NetworkInteruptions 

 	Scenario: Check whether error messages is displayed on network interruptions and upon good network connection resume to gamble session in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, gamble screen, wifi turnOFF and ON, network messages 
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, and launch the game, spin till player wins, selext any gamble option and turn OFF wifi and check for valid message and turn on wifi for gamble to resume if won or go back to game screen
    Then User is addressed with valid error message 'No Internet' for network interuptions in gamble page of Sapphire Heart slot game 
 
 
#11. SapphireHeart_Gamble_Reload_Option
 
 	Scenario: Check whether reload the game while playing gamble is allowed in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, gamble page, browser hamburger reload button valid session invalid error message.
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, spin till player wins, gamble screen, gamble should won,  click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message and again relauch the game and game session redirected to gamble page in Sapphire Heart slot game 
 


#12. SapphireHeart_ManualSpin_Validations_ButtonsBehavior

 	Scenario: Check bet value, credit value, home button, info button, play button, gamble link (active/disable) behavior during manual spin in Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, spin button and check for buttons behavior & functionality
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin option and check behavior of different buttons in different scenarios
    Then Bet value & Credit value buttons should not be clickable under spin condition in Sapphire Heart slot game
	And Home, Info and Turbo buttons should not be clickable on screen under spin condition in Sapphire Heart slot game
	And Spin button should be disabled during reel spin in Sapphire Heart slot game
	And Spin button should be visible after reel spin stops and if  win is triggered clicking on collect button in Sapphire Heart slot game
	And Gamble button behaviour under win triggered and disabled when next spin starts in Sapphire Heart slot game
	

#13. SapphireHeart_Reload_Option 

 	Scenario: Check whether reload the game is allowed in Sapphire Heart slot game 
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, balance, spin button, browser hamburger reload button valid session invalid error message.
    When Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, click on  hamburger menu and reload the game session.
    Then User should not able to resume to game and informed with valid error message for session invalid error message in Sapphire Heart slot game 


	
	
	
	Scenario: Check whether system is providing balance in try now feature of Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, try now button and balance to play
    When Open the Sapphire Heart slot game by entering the valid URL in browser, click on try now button
    Then System should provide five thousand as balance on click on try now button in Sapphire Heart slot game
	
	
	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, try now button, balance to play and spin button
    When Open the Sapphire Heart slot game by entering the valid URL in browser, click on try now button and click on spin button
    Then Amount should get deducted from balance on click on spin button in try now page of Sapphire Heartslot game
	
	
	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Sapphire Heart slot game
    Given Chrome browser, valid URL, valid login details, Sapphire Heart slot game, try now button, balance to play, spin button and win amount
    When Open the Sapphire Heart slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    Then Win amount should get added to the balance when the player wins in try now page of Sapphire Heart slot game