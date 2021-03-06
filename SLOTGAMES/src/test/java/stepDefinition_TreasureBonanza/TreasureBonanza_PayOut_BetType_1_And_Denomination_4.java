package stepDefinition_TreasureBonanza;

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

public class TreasureBonanza_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = TreasureBonanza_URL_Login.getDriver();
		//this.driver = TreasureBonanza_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, icon to open payout table, all symbols, max amount on each symbol like watch n etc, back button, bet type (\\d+)\\.(\\d+) and denomination as TWO on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_watch_n_etc_back_button_bet_type_and_denomination_as_TWO_on_mobile(int arg1, int arg2) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watch n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as TWO and check payout amount on mobile$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_watch_n_etc_click_on_back_button_select_bet_type_as_denomination_value_as_TWO_and_check_payout_amount_on_mobile(int arg1, int arg2) throws Throwable {
	    List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("2")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		String actualB = betValue;
		String expectedB = "2";
		Assert.assertEquals(expectedB, actualB);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String bcase="", bcase1="", bcase2="", dmond="", dmond1="",dmond2="",nlase="",nlase1="", nlase2="",Ring="",Ring1="",Ring2="",Watch="",Watch1="",Watch2="",
				Cash="",Cash1="",Cash2="",Scatter="", Scatter1="", Scatter2="", Wild="", Wild1="",Wild2="";
				
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 2
		//Check for Scatter symbol
		if(me.getId().equals("261")){
			Scatter = me.getText();
			String expected = Scatter;
			String actual = "200 YSI";
			System.out.println("Max Payout Value of 5 Scatter symbols for denomination 2 is : " +Scatter);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("271")){
			Scatter1 = me.getText();
			String expected1 = Scatter1;
			String actual1 = "40 YSI";
			System.out.println("Max Payout Value of 4 Scatter symbols for denomination 2 is : " +Scatter1);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("281")){
			Scatter2 = me.getText();
			String expected2 = Scatter2;
			String actual2 = "4 YSI";
			System.out.println("Max Payout Value of 4 Scatter symbols for denomination 2 is : " +Scatter2);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
			
			
		//Check for Wild symbol
		if(me.getId().equals("262")){
			Wild = me.getText();
			String expected = Wild;
			String actual = "500 YSI";
			System.out.println("Max Payout Value of 5 Wild symbols for denomination 2 is : " +Wild);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("272")){
			Wild1 = me.getText();
			String expected1 = Wild1;
			String actual1 = "150 YSI";
			System.out.println("Max Payout Value of 4 Wild symbols for denomination 2 is : " +Wild1);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("282")){
			Wild2 = me.getText();
			String expected2 = Wild2;
			String actual2 = "8 YSI";
			System.out.println("Max Payout Value of 4 Wild symbols for denomination 2 is : " +Wild2);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}	
		
		
		//Check for Gold Briefcase symbol
		if(me.getId().equals("26")){
			bcase = me.getText();
			String expected = bcase;
			String actual = "30 YSI";
			System.out.println("Max Payout Value of 5 Gold Briefcase symbols for denomination 2 is : " +bcase);
			Assert.assertEquals(actual, expected);
			Thread.sleep(1000);
		}
		if(me.getId().equals("27")){
			bcase1 = me.getText();
			String expected1 = bcase1;
			String actual1 = "5 YSI";
			System.out.println("Max Payout Value of 4 Gold Briefcase symbols for denomination 2 is : " +bcase1);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			bcase2 = me.getText();
			String expected2 = bcase2;
			String actual2 = "1.5 YSI";
			System.out.println("Max Payout Value of 4 Gold Briefcase symbols for denomination 2 is : " +bcase2);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		//Check for Diamond symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			dmond = me.getText();
			String expected4 = dmond;
			String actual4 = "30 YSI";
			System.out.println("Payout Value of 5 Diamond symbols for denomination 2 is : " +dmond);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			dmond1 = me.getText();
			String expected5 = dmond1;
			String actual5 = "5 YSI";
			System.out.println("Payout Value of 4 Diamond symbols for denomination 2 is: " +dmond1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			dmond2 = me.getText();
			String expected6 = dmond2;
			String actual6 = "1.5 YSI";
			System.out.println("Payout Value of 3 Diamond symbols for denomination 2 is: " +dmond2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Necklase symbol
		if(me.getId().equals("33")){
			nlase = me.getText();
			String expected7 = nlase;
			String actual7 = "10 YSI";
			System.out.println("Payout Value of 5 Necklase symbols for denomination 2 is: " +nlase);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			nlase1 = me.getText();
			String expected8 = nlase1;
			String actual8 = "4 YSI";
			System.out.println("Payout Value of 4 Necklase symbols for denomination 2 is: " +nlase1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			nlase2 = me.getText();
			String expected9 = nlase2;
			String actual9 = "1 YSI";
			System.out.println("Payout Value of 3 Necklase symbols for denomination 2 is: " +nlase2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for Cash symbol
		if(me.getId().equals("36")){
			Cash = me.getText();
			String expected10 = Cash;
			String actual10 = "8 YSI";
			System.out.println("Payout Value of 5 Cash symbols for denomination 2 is: " +Cash);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			Cash1 = me.getText();
			String expected11 = Cash1;
			String actual11 = "2 YSI";
			System.out.println("Payout Value of 4 Cash symbols for denomination 2 is: " +Cash1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			Cash2 = me.getText();
			String expected12 = Cash2;
			String actual12 = "0.5 YSI";
			System.out.println("Payout Value of 3 Cash symbols for denomination 2 is: " +Cash2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for Ring symbol
		if(me.getId().equals("39")){
			Ring = me.getText();
			String expected13 = Ring;
			String actual13 = "8 YSI";
			System.out.println("Payout Value of 5 Ring symbols for denomination 2 is: " +Ring);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			Ring1 = me.getText();
			String expected14 = Ring1;
			String actual14 = "2 YSI";
			System.out.println("Payout Value of 4 Ring symbols for denomination 2 is: " +Ring1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			Ring2 = me.getText();
			String expected15 = Ring2;
			String actual15 = "0.5 YSI";
			System.out.println("Payout Value of 3 Ring symbols for denomination 2 is: " +Ring2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for Watch symbol
		if(me.getId().equals("42")){
			Watch = me.getText();
			String expected16 = Watch;
			String actual16 = "2 YSI";
			System.out.println("Payout Value of 5 Watch symbols for denomination 2 is: " +Watch);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			Watch1 = me.getText();
			String expected17 = Watch1;
			String actual17 = "1 YSI";
			System.out.println("Payout Value of 4 Watch symbols for denomination 2 is: " +Watch1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			Watch2 = me.getText();
			String expected18 = Watch2;
			String actual18 = "0.5 YSI";
			System.out.println("Payout Value of 3 Watch symbols for denomination 2 is: " +Watch2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like watch n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to TWO in Treasure Bonanza slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_watch_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_TWO_in_Treasure_Bonanza_slot_game_on_mobile(int arg1, int arg2) throws Throwable {
	    Thread.sleep(2000);
		driver.quit();
	}
}
