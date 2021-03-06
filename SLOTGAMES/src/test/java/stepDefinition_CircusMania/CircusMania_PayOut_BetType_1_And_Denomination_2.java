package stepDefinition_CircusMania;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class CircusMania_PayOut_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public CircusMania_PayOut_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = CircusMania_URL_Login.getDriver();
		//this.driver = CircusMania_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Circus Mania slot game, icon to open payout table, all symbols, max amount on each symbol like A, K, J & etc, back button, bet type (\\d+)\\.(\\d+) and deominations (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Circus_Mania_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_A_K_J_etc_back_button_bet_type_and_deominations(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Circus Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, K, J & etc, click on back button, select bet type as (\\d+)\\.(\\d+) & deominations as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Circus_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_A_K_J_etc_click_on_back_button_select_bet_type_as_deominations_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.4
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.4")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.4";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String joker="",joker1="",joker2="",Scatter="",KQ="",KQ1="",KQ2="",
				duck="",duck1="",duck2="",elephant="",elephant1="",elephant2="",AJ="",AJ1="",AJ2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		
		//Check for Scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("26")){
			Scatter = me.getText();
			String expected4 = Scatter;
			String actual4 = "1.6 YSI";
			System.out.println("Payout Value of 3 Scatters symbols for denomination 0.4 is : " +Scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}


		//Check for Joker symbol
		if(me.getId().equals("30")){
			joker = me.getText();
			String expected5 = joker;
			String actual5 = "100 YSI";
			System.out.println("Payout Value of 5 Jokers symbols for denomination 0.4 is: " +joker);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			joker1 = me.getText();
			String expected6 = joker1;
			String actual6 = "4 YSI";
			System.out.println("Payout Value of 4 Jokers symbols for denomination 0.4 is: " +joker1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			joker2 = me.getText();
			String expected7 = joker2;
			String actual7 = "0.2 YSI";
			System.out.println("Payout Value of 3 Jokers symbols for denomination 0.4 is: " +joker2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		

		//Check for Duck symbol
		if(me.getId().equals("33")){
			duck = me.getText();
			String expected8 = duck;
			String actual8 = "8 YSI";
			System.out.println("Payout Value of 5 Ducks symbol for denomination 0.4: " +duck);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			duck1 = me.getText();
			String expected9 = duck1;
			String actual9 = "0.8 YSI";
			System.out.println("Payout Value of 4 Ducks symbol for denomination 0.4: " +duck1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			duck2 = me.getText();
			String expected10 = duck2;
			String actual10 = "0.4 YSI";
			System.out.println("Payout Value of 3 Ducks symbol for denomination 0.4: " +duck2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		//Check for Elephant symbol
		if(me.getId().equals("36")){
			elephant = me.getText();
			String expected11 = elephant;
			String actual11 = "1.6 YSI";
			System.out.println("Payout Value of 5 Elephants symbol for denomination 0.4 is: " +elephant);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			elephant1 = me.getText();
			String expected12 = elephant1;
			String actual12 = "0.6 YSI";
			System.out.println("Payout Value of 4 Elephants symbol for denomination 0.4 is: " +elephant1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			elephant2 = me.getText();
			String expected13 = elephant2;
			String actual13 = "0.4 YSI";
			System.out.println("Payout Value of 3 Elephants symbol for denomination 0.4 is: " +elephant2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for A & J symbol
		if(me.getId().equals("39")){
			AJ = me.getText();
			String expected14 = AJ;
			String actual14 = "0.8 YSI";
			System.out.println("Payout Value of 5 A & J symbol for denomination 0.4 is: " +AJ1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			AJ1 = me.getText();
			String expected15 = AJ1;
			String actual15 = "0.6 YSI";
			System.out.println("Payout Value of 4 A & J symbol for denomination 0.4 is: " +AJ1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("41")){
			AJ2 = me.getText();
			String expected16 = AJ2;
			String actual16 = "0.3 YSI";
			System.out.println("Payout Value of 3 A & J symbol for denomination 0.4 is: " +AJ2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for K & Q symbol
		if(me.getId().equals("42")){
			KQ = me.getText();
			String expected17 = KQ;
			String actual17 = "0.8 YSI";
			System.out.println("Payout Value of 5 K & Q symbol for denomination 0.4 is: " +KQ);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			KQ1 = me.getText();
			String expected18 = KQ1;
			String actual18 = "0.6 YSI";
			System.out.println("Payout Value of 4 K & Q symbol for denomination 0.4 is: " +KQ1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("44")){
			KQ2 = me.getText();
			String expected19 = KQ2;
			String actual19 = "0.3 YSI";
			System.out.println("Payout Value of 3 K & Q symbol for denomination 0.4 is: " +KQ2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like A, K, J & etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and deomination to (\\d+)\\.(\\d+) in Circus Mania slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_A_K_J_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_deomination_to_in_Circus_Mania_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
