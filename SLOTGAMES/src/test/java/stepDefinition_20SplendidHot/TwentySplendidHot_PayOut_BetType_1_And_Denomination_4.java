package stepDefinition_20SplendidHot;

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

public class TwentySplendidHot_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public TwentySplendidHot_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = TwentySplendidHot_URL_Login.getDriver();
		//this.driver = TwentySplendidHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like orange, cherry & etc etc, back button, bet type (\\d+)\\.(\\d+) and denomination as TWO on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_orange_cherry_etc_etc_back_button_bet_type_and_denomination_as_TWO_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like orange, cherry & etc etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination value as TWO and check payout amount on mobile$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_orange_cherry_etc_etc_click_on_back_button_select_bet_type_as_denomination_value_as_TWO_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		//Getting the bet value 0.01 and Bet amount 2
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 2 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup42")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "2";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Scatter="",Scatter1="",Scatter2="",Seven="",Seven1="",Seven2="",
			Grapes="",Grapes1="",Grapes2="",Plum="",Plum1="",Plum2="",Orange="",Orange1="",Orange2="";
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		

		//Check for Seven symbol
		if(me.getId().equals("26")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "100 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 2 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "40 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 2 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "4 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 2 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		//Check for Scatter symbol
		if(me.getId().equals("29")){
			Scatter = me.getText();
			String expected2 = Scatter;
			String actual2 = "1000 YSI";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 2 is : " +Scatter);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("30")){
			Scatter1 = me.getText();
			String expected3 = Scatter1;
			String actual3 = "40 YSI";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 2 is : " +Scatter1);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			Scatter2 = me.getText();
			String expected4 = Scatter2;
			String actual4 = "10 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 2 is : " +Scatter2);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		
		//Check for Grapes symbol
		if(me.getId().equals("32")){
			Grapes = me.getText();
			String expected11 = Grapes;
			String actual11 = "50 YSI";
			System.out.println("Payout Value of 5 Grapes symbol for denomination 2 is: " +Grapes);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("33")){
			Grapes1 = me.getText();
			String expected12 = Grapes1;
			String actual12 = "8 YSI";
			System.out.println("Payout Value of 4 Grapes symbol for denomination 2 is: " +Grapes1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("34")){
			Grapes2 = me.getText();
			String expected13 = Grapes2;
			String actual13 = "2 YSI";
			System.out.println("Payout Value of 3 Grapes symbol for denomination 2 is: " +Grapes2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Plum or Watermelon symbol
		if(me.getId().equals("35")){
			Plum = me.getText();
			String expected14 = Plum;
			String actual14 = "20 YSI";
			System.out.println("Payout Value of 5 Plum or Watermelon symbol for denomination 2 is: " +Plum);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("36")){
			Plum1 = me.getText();
			String expected15 = Plum1;
			String actual15 = "4 YSI";
			System.out.println("Payout Value of 4 Plum or Watermelon symbol for denomination 2 is: " +Plum1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("37")){
			Plum2 = me.getText();
			String expected16 = Plum2;
			String actual16 = "2 YSI";
			System.out.println("Payout Value of 3 Plum or Watermelon symbol for denomination 2 is: " +Plum2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Orange or Lemon or Cherry symbol
		if(me.getId().equals("38")){
			Orange = me.getText();
			String expected17 = Orange;
			String actual17 = "10 YSI";
			System.out.println("Payout Value of 5 Orange or Lemon or Cherry symbol for denomination 2 is: " +Orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("39")){
			Orange1 = me.getText();
			String expected18 = Orange1;
			String actual18 = "2 YSI";
			System.out.println("Payout Value of 4 Orange or Lemon or Cherry symbol for denomination 2 is: " +Orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("40")){
			Orange2 = me.getText();
			String expected19 = Orange2;
			String actual19 = "1 YSI";
			System.out.println("Payout Value of 3 Orange or Lemon or Cherry symbol for denomination 2 is: " +Orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like orange, cherry & etc etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value to TWO in (\\d+) Splendid Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_orange_cherry_etc_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_to_TWO_in_Splendid_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
