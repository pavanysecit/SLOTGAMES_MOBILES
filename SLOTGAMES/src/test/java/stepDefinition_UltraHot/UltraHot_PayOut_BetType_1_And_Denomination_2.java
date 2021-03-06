package stepDefinition_UltraHot;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UltraHot_PayOut_BetType_1_And_Denomination_2 {
	AppiumDriver<MobileElement> driver;

	public UltraHot_PayOut_BetType_1_And_Denomination_2() throws InterruptedException {
		this.driver = UltraHot_URL_Login.getDriver();
		//this.driver = UltraHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Ultra Hot slot game, icon to open payout table, all symbols, max amount on each symbol like bell, grapes, back button, bet type (\\d+)\\.(\\d+) and  denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Ultra_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_bell_grapes_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Ultra Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bell, grapes, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Ultra_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_bell_grapes_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.03";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.3
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.3")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.3";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Fsymbol="", lemon="",orange="", wmelon="",grapes="",bell="",
				plum="",star="",cherry="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		// Checking payout max amount for each symbol when bet type is 0.03 and denomination is 0.3
		//Check for 777 symbol
		if(me.getId().equals("26")){
			Fsymbol = me.getText();
			String expected11 = Fsymbol;
			String actual11 = "30 YSI";
			System.out.println("Max Payout Value of 777 symbols for denomination 0.3 is : " +Fsymbol);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
		}
		
		//Check for Star symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			star = me.getText();
			String expected4 = star;
			String actual4 = "18 YSI";
			System.out.println("Payout Value of Star symbols for denomination 0.3 is : " +star);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		

		//Check for Bell symbol
		if(me.getId().equals("33")){
			bell = me.getText();
			String expected7 = bell;
			String actual7 = "4.8 YSI";
			System.out.println("Payout Value of Bell symbols for denomination 0.3 is: " +bell);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		

		//Check for Stake Watermelon symbol
		if(me.getId().equals("33")){
			wmelon = me.getText();
			String expected71 = wmelon;
			String actual71 = "6 YSI";
			System.out.println("Payout Value of Watermelon symbol for denomination 0.3 is: " +wmelon);
			Assert.assertEquals(actual71, expected71);
			Thread.sleep(1000);
		}
		
		//Check for Grapes symbol
		if(me.getId().equals("39")){
			grapes = me.getText();
			String expected131 = grapes;
			String actual131 = "4.8 YSI";
			System.out.println("Payout Value of Grapes symbol for denomination 0.3 is: " +grapes);
			Assert.assertEquals(actual131, expected131);
			Thread.sleep(1000);
			} 
		
		//Check for Plum symbol
		if(me.getId().equals("39")){
			plum = me.getText();
			String expected132 = plum;
			String actual132 = "2.4 YSI";
			System.out.println("Payout Value of Plum symbol for denomination 0.3 is: " +plum);
			Assert.assertEquals(actual132, expected132);
			Thread.sleep(1000);
			} 
		

		//Check for Lemon symbol
		if(me.getId().equals("42")){
			lemon = me.getText();
			String expected163 = lemon;
			String actual163 = "2.4 YSI";
			System.out.println("Payout Value of Lemon symbol for denomination 0.3 is: " +lemon);
			Assert.assertEquals(actual163, expected163);
			Thread.sleep(1000);
			} 
		
		//Check for Orange symbol
		if(me.getId().equals("45")){
			orange = me.getText();
			String expected193 = orange;
			String actual193 = "2.4 YSI";
			System.out.println("Payout Value of Orange symbol for denomination 0.3 is: " +orange);
			Assert.assertEquals(expected193, actual193);
			Thread.sleep(1000);
			} 
		
		//Check for Cherry symbol
		if(me.getId().equals("45")){
			cherry = me.getText();
			String expected193 = cherry;
			String actual193 = "2.4 YSI";
			System.out.println("Payout Value of Cherry symbol for denomination 0.3 is: " +cherry);
			Assert.assertEquals(expected193, actual193);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like bell, grapes and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in Ultra Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_bell_grapes_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Ultra_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
