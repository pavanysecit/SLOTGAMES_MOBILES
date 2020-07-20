Feature: Test all the functionalities of Glowing Hot Slot Game
   

	Scenario: Select the bet type as 0.03 from the drop down and check the bet value should be 0.15,0.3,0.75,1.5,3 in Glowing Hot game
    Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03 and bet value as 0.15,0.3,0.75,1.5,3
    When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03 and check the bet value should be 0.15,0.3,0.75,1.5,3
    Then Bet value should get changed to 0.15,0.3,0.75,1.5,3 if the bet type selected as 0.03 from the drop down in Glowing Hot slot game
	
	
	Scenario: Select the bet type as 0.05 from the drop down and check the bet value should be 0.25,0.5,1.25,2.5 & 5 in Glowing Hot slot game
    Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.05 from down 2 and bet value as 0.25,0.5,1.25,2.5 & 5
    When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid logi., n details, select the bet type as 0.05 from down  and check the bet value should be 0.25,0.5,1.25,2.5 & 5
    Then Bet value should get changed to 0.25,0.5,1.25,2.5 & 5 if the bet type selected as 0.05 from the drop down two in Glowing Hot slot game
	
	
	Scenario: Select the bet type as 0.1 from the drop down and check the bet value should be 0.5,1,2.5,5 & 10 in Glowing Hot slot game
    Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.1 from drop down and bet value as 0.5,1,2.5,5 & 10
    When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down and check the bet value should be 0.5,1,2.5,5 & 10
    Then Bet value should get changed to 0.5,1,2.5,5 & 10 if the bet type selected as 0.1 from the drop down three in Glowing Hot slot game
	
	
	Scenario: Select the bet type as ONE from the drop down and check the bet value should be 5,10,25,50 & 100 in Glowing Hot slot game
    Given Chrome browser, valid URL, valid login details, Glowing Hot game, bet type as ONE and bet value as 5,10,25,50 & 100
    When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE and check the bet value should be 5,10,25,50 & 100
    Then Bet value should get changed to 5,10,25,50 & 100 if the bet type selected as ONE from the drop down 1 in Glowing Hot slot game
	
#	
#	
#	
#	
#	Scenario: Change the bet value as 0.15, do the spin and check whether balance is deducting according to the changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, bet value as 0.15, balance and spin button, balance after spin
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.15, click on spin button and check the balance after spin
    #Then Balance should get deducted by 0.2 after spin as bet type is selected as 0.03 and bet value as 0.15 in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as 0.3, do the spin and check whether balance is deducting according to the changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, bet type as 0.03, bet value as 0.3, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 0.3, click on spin button and check the balance
    #Then Balance should get deducted by 0.3 as bet type is selected as 0.03 in Glowing Hot game
#	
#	
#	
#	Scenario: Change the bet value as 0.75, click on spin and check whether existing balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, five reals, bet type as 0.03, bet value as 0.75, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value to 0.75, click on spin button and check the slot game balance
    #Then Existing Balance should get deducted by 0.75 as bet type is selected as 0.03 and bet value as 0.75 in Glowing Hot slot game
#	
#	
#	Scenario: Change the bet value to 1.5, click on spin button and check whether current balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, bet value as 1.5, balance, spin button and win amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as 1.5, click on spin button, check the win amount and check the balance
    #Then Current Balance should get deducted by 1.5 as bet type is selected as 0.03 and bet value as 1.5 in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as THREE, do the spin and check whether balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, bet value as THREE, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.03, select the bet value as THREE, click on spin button and check the balance
    #Then Current Balance should get deducted by THREE as bet type is selected as 0.03 and bet value as 3 in Glowing Hot game
#	
#	
#	
#	
#
#	
#	Scenario: Change the bet value as 0.25, do the spin and check whether balance is deducting according to the changed bet type in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, 0.05 as bet type , 0.25 as bet value, balance, spin button and balance after spin
    #When Open the Glowing Hot game by entering the valid URL in browser, enter the valid login details, select the bet value to 0.25, click on spin button and check the balance
    #Then Balance should get deducted by 0.25 as bet type is selected as 0.05 and bet value as 0.25 in Glowing Hot game
#	
#	
#	Scenario: Change the bet type as 0.05 from drop down & bet value to 0.5 do the spin and check whether balance is deducting according to the changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type & bet value drop down, bet type as 0.05, bet value as 0.5, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05 from drop down, bet value to 0.5 click on spin button and check the balance after spin
    #Then Balance should get deducted by 0.5 if the bet type is selected as 0.05 and bet value as 0.5 in Glowing Hot hot game
#	
#	
#	Scenario: Change the bet value to 1.25, click on spin button and check whether current balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.05, bet value as 1.25, bet type & bet values drop down, balance, spin button and balance amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 1.25, click on spin button and check the balance
    #Then Current Balance should get deducted by 1.25 as bet type is selected as 0.05 & bet type as 1.25 in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as 2.5, click on spin and check whether existing balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, bet type as 0.05, bet value as 2.5, bet value drop down, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the bet value to 2.5, click on spin button and check the Glowing Hot slot game balance
    #Then Existing Balance should get deducted by 2.5 as bet type is selected as 0.05 & bet value as 2.5 in Glowing Hot slot game
#	
#	
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to changed bet type in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, bet type as 0.05, bet value as FIVE, balance, spin button and balance after spin
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.05, select the denomination as FIVE, click on spin button and check the balance
    #Then Current Balance should get deducted by FIVE as bet type is selected as 0.05 & bet value as FIVE in Glowing Hot game
#
#	
#	
#	
#	
#	
#	Scenario: Change the bet value as 0.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.5 from drop down, bet value as 0.5, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet value as 0.5 from bet type drop down, click on spin button and check the balance
    #Then Balance should get deducted by 0.5 if bet type is selected as 0.1 in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as ONE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot game, bet type as 0.1 from drop down, bet value as ONE, balance and spin button
    #When Open the Glowing Hot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, click on spin button and check the balance
    #Then Balance should get deducted by ONE after spin if bet type is selected as 0.1 & bet value as ONE in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as 2.5, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.1 from drop down, bet value as 2.5 from drop down, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as 0.1 from drop down, select the bet vale as 2.5 from down, click on spin button and check the balance
    #Then Balance should get deducted by 2.5 if bet type is selected as 0.1 & bet value as 2.5 in Glowing Hot game
#	
#		
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.1 from drop down, bet value as FIVE, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as FIVE from bet type drop down, click on spin button and check the balance
    #Then Balance should get deducted by FIVE if bet type is selected as 0.1 & bet value as FIVE in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.1 from drop down, bet value as TEN, balance, spin button and balance after spin
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as TEN from bet type drop down, click on spin button and check the balance after spin
    #Then Balance should get deducted by TEN if bet type is selected as 0.1 & bet value as TEN in Glowing Hot slot game
#	
#
#
#
#
#	
#	Scenario: Change the bet value as FIVE, do the spin and check whether balance is deducting according to the changed bet type ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as ONE, bet value as FIVE, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as FIVE, click on spin button and check the balance
    #Then Balance should get deducted by FIVE as bet type is selected as ONE in Glowing Hot game
#
#	
#	Scenario: Change the bet value as TEN, do the spin and check whether balance is deducting according to the changed bet type ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as ONE, bet value as TEN, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as TEN, click on spin button and check the balance
    #Then Balance should get deducted by TEN as bet type is selected as ONE in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as TWENTY FIVE, do the spin and check whether balance is deducting according to the changed bet type ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as ONE, bet value as TWENTY FIVE, balance and spin buttone
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as TWENTY FIVE, click on spin button and check the balance
    #Then Balance should get deducted by TWENTY FIVE as bet type is selected as ONE in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as FIFTY, do the spin and check whether balance is deducting according to the changed bet type ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as ONE, bet value as FIFTY, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as FIFTY, click on spin button and check the balance
    #Then Balance should get deducted by FIFTY as bet type is selected as ONE in Glowing Hot game
#	
#	
#	Scenario: Change the bet value as HUNDRED, do the spin and check whether balance is deducting according to the changed bet type ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as ONE, bet value as HUNDRED, balance and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as ONE & bet value as HUNDRED, click on spin button and check the balance
    #Then Balance should get deducted by HUNDRED as bet type is selected as ONE in Glowing Hot game
#	
#	
#
#	
#
#
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.03 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, credits and denomination as 0.03 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.03 and check the balance
    #Then Balance amound should be same as denomination 0.03 multiplies by credit in Glowing Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.05 in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, credits, denomination drop down and denomination as 0.05 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, select the denomination from drop down, multiply credit by 0.05 and check the balance
    #Then Balance amound should be same as denomination 0.05 multiplies by credit in Glowing Hot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination 0.1 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game window, balance, credits, denomination drop down and denomination as 0.1 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by 0.1 and compare the balance
    #Then Balance amound should be same as denomination ONE multiplies by credit balance in Glowing Hot slot game
#	
#	Scenario: Check whether balance is equals to credit multiplies by denomination ONE in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, credits and denomination drop down & value as ONE
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination ONE manually with and check the balance
    #Then Balance amount should be same after multiplying denomination ONE by credit in Glowing Hot slot game
#	
#
#
#
#	
#		
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Glowing Hot slot game, click on spin button till player wins, click on balance, check the win amount and click on balance
    #Then Win amount in credit multiplied by denomination is equal to win amount in currency in Glowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value two in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value two 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value two, click on spin button till player wins, click on balance, check the win amount and click on balance 
    #Then Win amount in credit multiplied by denomination drop down value two is equal to win amount in currency in Glowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value three in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value three 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value three, click on spin button till player wins, click on balance, check the win amount and click on balance 
    #Then Win amount in credit multiplied by denomination drop down value three is equal to win amount in currency in Glowing Hot slot game
#	
#	
#	Scenario: Convert win amount into credits and check whether win amount in credits * denomination is equals to win amount in currency for denomination drop down value four in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount in currency, credits and win amount in credits for denomination drop down value four 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select the denomination drop down value four, click on spin button till player wins, click on balance, check the win amount and click on balance 
    #Then Win amount in credit multiplied by denomination drop down value four is equal to win amount in currency in Glowing Hot slot game
#	
#	
#
#	
#	Scenario: Check whether winning amount is getting added to the balance
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, transfer button, spin button and win amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the amount, click on spin button till user win and check the balance after win in Glowing Hot slot game
    #Then Win amount should get added to the balance after win and balance should get increased with win amount in Glowing Hot slot game
#	
#	
#	Scenario: Check whether user able to play the game when there is insufficiant balance in account in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button and validation message
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message
    #Then Player should be blocked from playing the game when there is no balance in the account in Glowing Hot game
#	
#
#	Scenario: Check user instruction messages before and after spin in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button and user instruction message
    #When Open the Glowing Hot hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages
    #Then User instruction message 'Please place your bet' should be displayed before spin button is clicked 
#	And User instruction message 'Good Luck' should be displayed after spin button is clicked in Glowing Hot slot game
#
#	
#	Scenario: Navigate to home screen from Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game and home button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button
    #Then System should take the player to Home page after clicking on home button from Glowing Hot game
#	
#	
#	Scenario: Check the functionality of maximize and minimize button in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, maximize button and minimize button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on maximize button and click on minimize button
    #Then Full screen should be displayed after clicking on maximize button and minimized screen should be displayed after clicking on minimize button in Glowing Hot slot game
#	
#	
#
#	
#	Scenario: Check whether system performing ten spins after selecting ten option in the auto spin drop down of the Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot  slot game, balance, spin button, auto spin button, ten spins option and number of spins left message
    #When Open the Glowing Hot  slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on ten spin option under auto spin drop down and check the number of spins left message
    #Then Number of spin left should start from 9 to 1 after clicking ten spins option and should perform 10 spins from 9 to 1 in Glowing Hot slot game
#	
#	Scenario: Check whether system performing twenty spins after selecting twenty option in the auto spin drop down of the Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, auto spin button, twenty spins option and number of spins left message
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on twenty spin option under auto spin drop down and check the number of spins left message
    #Then Number of spin left should start from 19 to 1 after clicking twenty spins option and should perform 20 spins from 19 to 1 in Glowing Hot slot game
#	
#	Scenario: Check whether system performing continues spins after selecting auto option in the auto spin drop down of the Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message
    #Then System should keep performing the spins in Glowing Hot slot game
#	
#	
#	
#	
#	
#	
#	
#	Scenario: Check whether the max payout amount for each symbol like wild & scatter as per the bet type 0.03 and denomination 0.15 in Glowing Hot slot game on mobile
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like wild & scatter, back button, bet type 0.03 and denomination as 0.15 on mobile
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like wild & scatter, click on back button, select bet type as 0.03 & denomination value as 0.15 and check payout amount on mobile
    #Then System should display the Payout max amount on each symbol like wild & scatter and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value to 0.15 in Glowing Hot slot game on mobile
#	
#	
#	Scenario: Check whether the max payout amount for each symbol as per the bet type 0.03 and denomination 0.3 in Glowing Hot slot game on mobile
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like mango, cherry & etc, back button, bet type 0.03 and deominations 0.3 
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like mango, cherry & etc, click on back button, select bet type as 0.03 & deominations as 0.3 and check payout amount
    #Then System should display the Payout max amount on each symbol like mango, cherry & etc and payout max amount should get changed whenever player changes the bet type to 0.03 and deomination to 0.3 in Glowing Hot slot game on mobile
#	
#	
#	Scenario: Check whether the max payout amount for each symbol like watermelon, bell & etc as per the bet type 0.03 and denomination 0.75 in Glowing Hot slot game on mobile
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon, bell & etc, back button, bet type 0.03 and denomination value as 0.75
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermelon, bell & etc, click on back button, select bet type as 0.03 & denomination  values as 0.75 and check payout amount
    #Then System should display the Payout max amount on each symbol like watermelon, bell & etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value as 0.75 in Glowing Hot slot game on mobile
#	
#	
#	Scenario: Check whether the max payout amount for each symbol like orange, cherry & etc etc as per the bet type 0.03 and denomination 1.5 in Glowing Hot slot game on mobile
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, cherry & etc etc, back button, bet type 0.03 and denomination as 1.5 on mobile
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, cherry & etc etc, click on back button, select bet type as 0.03 & denomination value as 1.5 and check payout amount on mobile
    #Then System should display the Payout max amount on each symbol like orange, cherry & etc etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination value to 1.5 in Glowing Hot slot game on mobile
#	
#	
#	Scenario: Check whether the max payout amount for each symbol like grapes, plum & etc as per the bet type 0.03 and denomination as THREE in Glowing Hot slot game on mobile
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like grapes, plum & etc, back button, bet type 0.03 and denomination as THREE on mobile
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like grapes, plum & etc, click on back button, select bet type as 0.03 & denomination as THREE and check payout amount on mobile
    #Then System should display the Payout max amount on each symbol like grapes, plum & etc and payout max amount should get changed whenever player changes the bet type to 0.03 and denomination to THREE in Glowing Hot slot game on mobile
#	
#	
#
#	
#
#		
#	Scenario: Checking whether win amount is displaying as gamble amount in gamble page of Glowing Hot slot game 
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount, gamble button and gamble amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and check the gamble amount
    #Then Win amount should be displayed as Gamble amount in the gamble page of the Glowing Hot slot game
#	
#	Scenario: Checking Gamble to Win amount should be double than gamble amount in gamble page of Glowing Hot slot game 
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount, gamble button, gamble amount and gamble to win amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, click on spin button till player wins, click on gamble button and check the gamble to win amount
    #Then Gamble To Win amount should be double than Gamble amount in the gamble page of the Glowing Hot slot game
#	
#	Scenario: Check whether gamble win amount is getting added to the balance after win in Glowing Hot slot game 
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, balance, spin button, win amount, gamble button, gamble amount, red button, black button and gamble status
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, click on spin button till player wins, click on gamble button, click on red or black button and check the balance after win
    #Then Gamble Win amount should get added to main balance after status displayed as WIN and gamble page should get closed in Glowing Hot slot game 
#	
#
#
#
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 and denomination 0.15 in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, denomination as 0.15, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.03 & denomination as 0.15, click on spin button till player wins, click on gamble button and check the gamble count in gamble page
    #Then Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.15 Glowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.3 in Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, transfer button, bet type as 0.03, denomination as 0.3, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, transfer the amount, select bet type as 0.03 & denomination as 0.3, click on spin button till player wins, click on gamble button and check the gamble count
    #Then Gamble count should be displayed based on winning amount and max amount of the gamble configured on the game info page for bet type 0.03 and denomination 0.3 in Glowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 0.75 in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, denomination as 0.75, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, select bet type as 0.03 & denomination as 0.75, click on spin button till player wins, click on gamble button and check the gamble count
    #Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 0.75 in Glowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination 1.5 in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, denomination as 1.5, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as 0.03 & denomination as 1.5, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game
    #Then Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination 1.5 in Glowing Hot game
#	
#	
#	Scenario: Check whether gamble count is displaying as per the max amount configured on the info page for bet type 0.03 & denomination THREE in Glowing Hot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, bet type as 0.03, denomination as THREE, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count
    #When Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on Glowing Hot slot game, select bet type as 0.03 & denomination as THREE, click on spin button till player wins, click on gamble button and check the gamble count
    #Then Gamble count should be displayed based on win amount and gamble max amount configured on the game info page for bet type 0.03 & denomination THREE in Glowing Hot game
#
#
#
#	
#	
#	Scenario: Check whether system is providing balance in try now feature of Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, try now button and balance to play
    #When Open the Glowing Hot slot game by entering the valid URL in browser, click on try now button
    #Then System should provide five thousand as balance on click on try now button in Glowing Hot slot game
#	
#	
#	Scenario: Check whether amount is deducting from the balance after clicking on spin button in try now page of Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, try now button, balance to play and spin button
    #When Open the Glowing Hot slot game by entering the valid URL in browser, click on try now button and click on spin button
    #Then Amount should get deducted from balance on click on spin button in try now page of Glowing Hotslot game
#	
#	
#	Scenario: Check whether winning amount is gettting added to the balance when the player wins in try now page of Glowing Hot slot game
    #Given Chrome browser, valid URL, valid login details, Glowing Hot slot game, try now button, balance to play, spin button and win amount
    #When Open the Glowing Hot slot game by entering the valid URL in browser, click on try now button, click on spin button till player win and check the balance after win
    #Then Win amount should get added to the balance when the player wins in try now page of Glowing Hot slot game