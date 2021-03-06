package stepDefinition_TreasureBonanza;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TreasureBonanza_Gamble_GambleCount_For_BetType_1_And_Denomination_1 {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_Gamble_GambleCount_For_BetType_1_And_Denomination_1() throws InterruptedException {
		this.driver = TreasureBonanza_URL_Login.getDriver();
		//this.driver = TreasureBonanza_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, spin button, win amount, gamble button, card to click for suit win and suit win amount$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_balance_spin_button_win_amount_gamble_button_card_to_click_for_suit_win_and_suit_win_amount() throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till player wins, click on gamble button and click on suit win card in gamble page$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_player_wins_click_on_gamble_button_and_click_on_suit_win_card_in_gamble_page() throws Throwable {
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The current balance of the account :" +balance);

		// Select the credit 
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(1000);
		MobileElement cr1 = driver.findElement(By.id("hud_CreditPopup10.01"));
		String credit1 =cr1.getText();
		System.out.println(credit1);
		String expectedA = "0.01";
		Assert.assertEquals(expectedA, credit1);
		cr1.click();
		Thread.sleep(1000);

		// select the bet value
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet1_1= driver.findElement(By.id("hud_BetPopup10.2"));
		String Betval1_1 =bet1_1.getText();
		System.out.println(Betval1_1);
		String expectedB = "0.2";
		Assert.assertEquals(expectedB, Betval1_1);
		Thread.sleep(2000);
		bet1_1.click();

		MobileElement start = driver.findElement(By.id("hud_btnSpin"));
		start.click();
		Thread.sleep(8000);
		MobileElement winE = driver.findElement(By.id("hud_Hud_txtWin1"));

		String prewin = winE.getText();
		//System.out.println("Balance before win is"+" "+prewin);                    
		String winTex= winE.getText();

		while(prewin.isEmpty()){
			start.click();	
			Thread.sleep(8000);	
			winTex = winE.getText();
			prewin= prewin+winTex;
			System.out.println(winTex.isEmpty());		
		}
		System.out.println("Win amount is: " +prewin);	
		System.out.println("Maximum gamble win amount for bet amount 0.2 and credit value 0.01 is : 7 SRD");	                                                                                                                             
		Double maxV = Double.parseDouble(prewin);
		if(maxV < 7)
		{
			System.out.println("Win amount less than Gamble max value 7 i.e : "+" " +maxV +". Test Case Passed");
		}
		else
		{
			System.out.println("Win amount greater than Gamble max value 7 : i.e "+" " +maxV +". Test Case Failed");
			driver.findElement(By.id("hud_btnGamble")).isDisplayed();
			Thread.sleep(2000);
			driver.quit();
		}
		Thread.sleep(2000);
		driver.findElement(By.id("hud_btnGamble")).click();	
		Thread.sleep(3000);
		Double monty = Double.parseDouble(prewin);
		System.out.println("Gamble amount is equal to win amount & the amount is :"+" "+monty);
		MobileElement attempts = driver.findElement(By.id("gamble_txtAttemptsLeft"));

		System.out.println("No. of attempts left :"+" "+attempts.getText());
		if(monty>=0.1 && monty<=0.4)
		{
			System.out.println("The no. of attempts should be : "+" "+"5"+" "+" & no. of actual attempts are :"+attempts.getText());
			Assert.assertEquals("5",attempts.getText());
		}
	   else if(monty>0.4 && monty<=0.86){
		  System.out.println("The no. of attempts should be : "+" "+"4"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("4", attempts.getText());
		}
	   else if(monty>0.86 && monty<=1.7){
		  System.out.println("The no. of attempts should be :"+" "+"3"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("3",attempts.getText());
	   }
	   else if(monty>1.7 && monty<=3.4){
		  System.out.println("The no. of attempts should be :"+" "+"2"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("2",attempts.getText());
	   }
	   else if(monty>3.4 && monty<=7){
		  System.out.println("The no. of attempts should be :"+" "+"1"+" "+"& no. of actual attempts are:"+attempts.getText());  
		  
		  Assert.assertEquals("1", attempts.getText());
	   }
		 driver.findElement(By.id("gamble_btnCollect")).click();
		 System.out.println("The testcase has passed");
	}

	@Then("^Suit Win amount\\((\\d+)x\\) should get added to the main balance after win else it should not get added to main balance in the Treasure Bonanza slot game$")
	public void suit_Win_amount_x_should_get_added_to_the_main_balance_after_win_else_it_should_not_get_added_to_main_balance_in_the_Treasure_Bonanza_slot_game(int arg1) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}
