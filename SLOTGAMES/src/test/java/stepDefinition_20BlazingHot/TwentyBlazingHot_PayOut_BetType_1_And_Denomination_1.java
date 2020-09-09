package stepDefinition_20BlazingHot;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyBlazingHot_PayOut_BetType_1_And_Denomination_1 {
	AppiumDriver<MobileElement> driver;

	public TwentyBlazingHot_PayOut_BetType_1_And_Denomination_1() throws InterruptedException {
		this.driver = TwentyBlazingHot_URL_Login.getDriver();
		//this.driver = TwentyBlazingHot_URL_TryNow.getDriver();	
	}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Blazing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like bar, wild n etc, back button, bet type (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Blazing_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_bar_wild_n_etc_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the (\\d+) Blazing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bar, wild n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Blazing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_bar_wild_n_etc_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		//Getting the bet value 0.01 and Bet amount 1
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 0.2 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup10.2")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "0.2";
		System.out.println("Selected bet value is : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String scatter="",Seven="",Seven1="",Seven2="",Seven3="",
				Bar="",Bar1="",Bar2="",bw="",bw1="",bw2="",agc="",agc1="",agc2="";
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		
		//Check for Scatter symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("26")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "100 YSI";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "4 YSI";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "0.4 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}

		//Check for Seven symbol
		if(me.getId().equals("30")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "10 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 0.2 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "2 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 0.2 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "0.6 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 0.2 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("33")){
			Seven3 = me.getText();
			String expected7 = Seven3;
			String actual7 = "0.04 YSI";
			System.out.println("Payout Value of 2 Seven symbols for denomination 0.2 is: " +Seven3);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		

		//Check for Bar symbol
		if(me.getId().equals("33")){
			Bar = me.getText();
			String expected8 = Bar;
			String actual8 = "3 YSI";
			System.out.println("Payout Value of 5 Bar symbol for denomination 0.2: " +Bar);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			Bar1 = me.getText();
			String expected9 = Bar1;
			String actual9 = "1 YSI";
			System.out.println("Payout Value of 4 Bar symbol for denomination 0.2: " +Bar1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			Bar2 = me.getText();
			String expected10 = Bar2;
			String actual10 = "0.4 YSI";
			System.out.println("Payout Value of 3 Bar symbol for denomination 0.2: " +Bar2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		//Check for Banana or Watermelon symbol
		if(me.getId().equals("36")){
			bw = me.getText();
			String expected11 = bw;
			String actual11 = "2 YSI";
			System.out.println("Payout Value of 5 Banana or Watermelon symbol for denomination 0.2 is: " +bw);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			bw1 = me.getText();
			String expected12 = bw1;
			String actual12 = "0.8 YSI";
			System.out.println("Payout Value of 4 Banana or Watermelon symbol for denomination 0.2 is: " +bw1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			bw2 = me.getText();
			String expected13 = bw2;
			String actual13 = "0.2 YSI";
			System.out.println("Payout Value of 3 Banana or Watermelon symbol for denomination 0.2 is: " +bw2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Orange or Cherry or Grapes symbol
		if(me.getId().equals("39")){
			agc = me.getText();
			String expected14 = agc;
			String actual14 = "1 YSI";
			System.out.println("Payout Value of 5 Orange or Cherry or Grapes symbol for denomination 0.2 is: " +agc);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			agc1 = me.getText();
			String expected15 = agc1;
			String actual15 = "0.4 YSI";
			System.out.println("Payout Value of 4 Orange or Cherry or Grapes symbol for denomination 0.2 is: " +agc1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("41")){
			agc2 = me.getText();
			String expected16 = agc2;
			String actual16 = "0.1 YSI";
			System.out.println("Payout Value of 3 Orange or Cherry or Grapes symbol for denomination 0.2 is: " +agc2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like bar, wild n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in (\\d+) Blazing Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_bar_wild_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Blazing_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
