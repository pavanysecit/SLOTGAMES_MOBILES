package stepDefinition_SapphireHeart;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SapphireHeart_Gamble_GambleCount_For_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public SapphireHeart_Gamble_GambleCount_For_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = SapphireHeart_URL_Login.getDriver();
		//this.driver = SapphireHeart_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Sapphire Heart slot game, bet type as (\\d+)\\.(\\d+), denomination as TWO, balance, spin button, win amount, gamble button, gamble amount, game info page and gamble count in gamble page$")
	public void chrome_browser_valid_URL_valid_login_details_Sapphire_Heart_slot_game_bet_type_as_denomination_as_TWO_balance_spin_button_win_amount_gamble_button_gamble_amount_game_info_page_and_gamble_count_in_gamble_page(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Sapphire Heart slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on golden hot slot game, select bet type as (\\d+)\\.(\\d+) & denomination as TWO, click on spin button till player wins, click on gamble button and check the gamble count in gamble page$")
	public void open_the_Sapphire_Heart_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_golden_hot_slot_game_select_bet_type_as_denomination_as_TWO_click_on_spin_button_till_player_wins_click_on_gamble_button_and_check_the_gamble_count_in_gamble_page(int arg1, int arg2) throws Throwable {
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
		MobileElement bet1_2= driver.findElement(By.id("hud_BetPopup22"));
		String Betval1_2 =bet1_2.getText();
		System.out.println(Betval1_2);
		String expectedB = "2";
		Assert.assertEquals(expectedB, Betval1_2);
		Thread.sleep(2000);
		bet1_2.click();

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
		System.out.println("Maximum gamble win amount for bet amount 2 and credit value 0.01 is : 70 SRD");	                                                                                                                             
		Double maxV = Double.parseDouble(prewin);
		if(maxV < 70)
		{
			System.out.println("Win amount less than Gamble max value 70 i.e : "+" " +maxV +". Test Case Passed");
		}
		else
		{
			System.out.println("Win amount greater than Gamble max value 70 : i.e "+" " +maxV +". Test Case Failed");
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
		if(monty>=2 && monty<=4)
		{
			System.out.println("The no. of attempts should be : "+" "+"5"+" "+" & no. of actual attempts are :"+attempts.getText());
			Assert.assertEquals("5",attempts.getText());
		}
		else if(monty>4 && monty<=8){
			System.out.println("The no. of attempts should be : "+" "+"4"+" "+"& no. of actual attempts are :"+attempts.getText());

			Assert.assertEquals("4", attempts.getText());
		}
		else if(monty>8 && monty<=17){
			System.out.println("The no. of attempts should be :"+" "+"3"+" "+"& no. of actual attempts are :"+attempts.getText());

			Assert.assertEquals("3",attempts.getText());
		}
		else if(monty>17 && monty<=35){
			System.out.println("The no. of attempts should be :"+" "+"2"+" "+"& no. of actual attempts are :"+attempts.getText());

			Assert.assertEquals("2",attempts.getText());
		}
		else if(monty>35 && monty<=70){
			System.out.println("The no. of attempts should be :"+" "+"1"+" "+"& no. of actual attempts are:"+attempts.getText());  

			Assert.assertEquals("1", attempts.getText());
		}
		driver.findElement(By.id("gamble_btnCollect")).click();
		System.out.println("The testcase has passed");
	}

	@Then("^Gamble count should be displayed on gamble page based on win amount and gamble max amount configured on the game info page for bet type (\\d+)\\.(\\d+) & denomination TWO Sapphire Heart game$")
	public void gamble_count_should_be_displayed_on_gamble_page_based_on_win_amount_and_gamble_max_amount_configured_on_the_game_info_page_for_bet_type_denomination_TWO_Sapphire_Heart_game(int arg1, int arg2) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
