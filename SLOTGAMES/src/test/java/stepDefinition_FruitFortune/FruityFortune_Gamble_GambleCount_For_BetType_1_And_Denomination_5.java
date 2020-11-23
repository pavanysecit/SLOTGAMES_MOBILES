package stepDefinition_FruitFortune;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FruityFortune_Gamble_GambleCount_For_BetType_1_And_Denomination_5 {
	AppiumDriver<MobileElement> driver;

	public FruityFortune_Gamble_GambleCount_For_BetType_1_And_Denomination_5() throws InterruptedException {
		this.driver = FruityFortune_URL_Login.getDriver();
		//this.driver = FruityFortune_URL_TryNow.getDriver();
		}
	
	
	@Given("^Chrome browser, valid URL, valid login details, Fruity Fortune slot game, bet type as (\\d+)\\.(\\d+), denomination as EIGHT, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page of slot game$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Fortune_slot_game_bet_type_as_denomination_as_EIGHT_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count_in_gamble_page_of_slot_game(int arg1, int arg2) throws Throwable {
	    
	}

	@When("^Open the Fruity Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as EIGHT, click on spin button till player wins, click on gamble button and check the gamble count in gamble page of slot game$")
	public void open_the_Fruity_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_EIGHT_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count_in_gamble_page_of_slot_game(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The current balance of the account :" +balance);
		
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(1000);
		MobileElement cr1 = driver.findElement(By.id("hud_CreditPopup10.01"));
		String credit1 =cr1.getText();
		System.out.println(credit1);
		String expectedA = "0.01";
		Assert.assertEquals(expectedA, credit1);
		cr1.click();
		Thread.sleep(1000);

		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(1000);
		MobileElement bet1_5= driver.findElement(By.id("hud_BetPopup58"));
		String Betval1_5 =bet1_5.getText();
		System.out.println(Betval1_5);
		String expectedB = "8";
		Assert.assertEquals(expectedB, Betval1_5);
		Thread.sleep(2000);
		bet1_5.click();

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
		System.out.println("Maximum gamble win amount for bet amount 8 and credit value 0.01 is : 280 SRD");	                                                                                                                             
		Double maxV = Double.parseDouble(prewin);
		if(maxV < 280)
		   {
			   System.out.println("Win amount less than Gamble max value 280 i.e : "+" " +maxV +". Test Case Passed");
		   }
		else
		{
			System.out.println("Win amount greater than Gamble max value 280 : i.e "+" " +maxV +". Test Case Failed");
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
		if(monty>=0.1 && monty<=16)
		{
			System.out.println("The no. of attempts should be : "+" "+"5"+" "+" & no. of actual attempts are :"+attempts.getText());
			Assert.assertEquals("5",attempts.getText());
		}
	   else if(monty>16 && monty<=32){
		  System.out.println("The no. of attempts should be : "+" "+"4"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("4", attempts.getText());
		}
	   else if(monty>32 && monty<=64){
		  System.out.println("The no. of attempts should be :"+" "+"3"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("3",attempts.getText());
	   }
	   else if(monty>64 && monty<=128){
		  System.out.println("The no. of attempts should be :"+" "+"2"+" "+"& no. of actual attempts are :"+attempts.getText());
		  
		  Assert.assertEquals("2",attempts.getText());
	   }
	   else if(monty>128 && monty<=280){
		  System.out.println("The no. of attempts should be :"+" "+"1"+" "+"& no. of actual attempts are:"+attempts.getText());  
		  
		  Assert.assertEquals("1", attempts.getText());
	   }
		 driver.findElement(By.id("gamble_btnCollect")).click();
		 System.out.println("The testcase has passed");
	}

	@Then("^Gamble count should be displayed  on gamble page of slot game based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination EIGHT in Fruity Fortune game$")
	public void gamble_count_should_be_displayed_on_gamble_page_of_slot_game_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_EIGHT_in_Fruity_Fortune_game(int arg1, int arg2) throws Throwable {
	   Thread.sleep(1000);
	   driver.quit();
	}
}
