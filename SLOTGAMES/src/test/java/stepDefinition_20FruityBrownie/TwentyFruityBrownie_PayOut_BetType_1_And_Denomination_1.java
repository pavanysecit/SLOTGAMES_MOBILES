package stepDefinition_20FruityBrownie;

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

public class TwentyFruityBrownie_PayOut_BetType_1_And_Denomination_1 {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_PayOut_BetType_1_And_Denomination_1() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		//this.driver = TwentyFruityBrownie_URL_TryNow.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, icon to open payout table, all symbols, max amount on each symbol like bar, wild n etc, back button, bet type (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_bar_wild_n_etc_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
	}

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like bar, wild n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_bar_wild_n_etc_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
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
				Bell="",Bell1="",Bell2="",Bell3="",Apple="",Apple1="",Apple2="",Apple3="",wmelon="",wmelon1="",wmelon2="",op="",op1="",op2="",
				LC2="",LC="",LC1="",banana="",banana1="",banana2="",grapes2="",grapes1="",grapes="";
		
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		
		
		//Check for Seven symbol
		if(me.getId().equals("26")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "10 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 0.2 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "2.5 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 0.2 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "0.5 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 0.2 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("29")){
			Seven3 = me.getText();
			String expected7 = Seven3;
			String actual7 = "0.1 YSI";
			System.out.println("Payout Value of 2 Seven symbols for denomination 0.2 is: " +Seven3);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
				
		//Check for Scatter symbol
		if(me.getId().equals("30")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "40 YSI";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "4 YSI";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			scatter = me.getText();
			String expected4 = scatter;
			String actual4 = "1 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 0.2 is : " +scatter);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}


		//Check for Bell symbol
		if(me.getId().equals("33")){
			Bell = me.getText();
			String expected8 = Bell;
			String actual8 = "1 YSI";
			System.out.println("Payout Value of 5 Bell symbol for denomination 0.2: " +Bell);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			Bell1 = me.getText();
			String expected9 = Bell1;
			String actual9 = "0.5 YSI";
			System.out.println("Payout Value of 4 Bell symbol for denomination 0.2: " +Bell1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			Bell2 = me.getText();
			String expected10 = Bell2;
			String actual10 = "0.1 YSI";
			System.out.println("Payout Value of 3 Bell symbol for denomination 0.2: " +Bell2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("36")){
			Bell3 = me.getText();
			String expected10 = Bell3;
			String actual10 = "0.05 YSI";
			System.out.println("Payout Value of 2 Bell symbol for denomination 0.2: " +Bell3);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		
		//Check for apple symbol
		if(me.getId().equals("37")){
			Apple = me.getText();
			String expected8 = Apple;
			String actual8 = "0.8 YSI";
			System.out.println("Payout Value of 5 Apple symbol for denomination 0.2: " +Apple);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("38")){
			Apple1 = me.getText();
			String expected9 = Apple1;
			String actual9 = "0.4 YSI";
			System.out.println("Payout Value of 4 Apple symbol for denomination 0.2: " +Apple1);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("39")){
			Apple2 = me.getText();
			String expected10 = Apple2;
			String actual10 = "0.1 YSI";
			System.out.println("Payout Value of 3 Apple symbol for denomination 0.2: " +Apple2);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("40")){
			Apple3 = me.getText();
			String expected10 = Apple3;
			String actual10 = "0.05 YSI";
			System.out.println("Payout Value of 2 Apple symbol for denomination 0.2: " +Apple3);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
		}

		//Check for Watermelon symbol
		if(me.getId().equals("41")){
			wmelon = me.getText();
			String expected11 = wmelon;
			String actual11 = "0.4 YSI";
			System.out.println("Payout Value of 5 Banana or Watermelon symbol for denomination 0.2 is: " +wmelon);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("42")){
			wmelon1 = me.getText();
			String expected12 = wmelon1;
			String actual12 = "0.2 YSI";
			System.out.println("Payout Value of 4 Banana or Watermelon symbol for denomination 0.2 is: " +wmelon1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("43")){
			wmelon2 = me.getText();
			String expected13 = wmelon2;
			String actual13 = "0.1 YSI";
			System.out.println("Payout Value of 3 Banana or Watermelon symbol for denomination 0.2 is: " +wmelon2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		
		//Check for Banana symbol
		if(me.getId().equals("44")){
			banana = me.getText();
			String expected11 = banana;
			String actual11 = "0.6 YSI";
			System.out.println("Payout Value of 5 Banana symbol for denomination 0.2 is: " +banana);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("45")){
			banana1 = me.getText();
			String expected12 = banana1;
			String actual12 = "0.3 YSI";
			System.out.println("Payout Value of 4 Banana symbol for denomination 0.2 is: " +banana1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("46")){
			banana2 = me.getText();
			String expected13 = banana2;
			String actual13 = "0.1 YSI";
			System.out.println("Payout Value of 3 Banana symbol for denomination 0.2 is: " +banana2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Grapes symbol
		if(me.getId().equals("47")){
			grapes = me.getText();
			String expected14 = grapes;
			String actual14 = "0.5 YSI";
			System.out.println("Payout Value of 5 Grapes symbol for denomination 0.2 is: " +grapes);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("48")){
			grapes1 = me.getText();
			String expected15 = grapes1;
			String actual15 = "0.3 YSI";
			System.out.println("Payout Value of 4 Grapes symbol for denomination 0.2 is: " +grapes1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("49")){
			grapes2 = me.getText();
			String expected16 = grapes2;
			String actual16 = "0.1 YSI";
			System.out.println("Payout Value of 3 Grapes symbol for denomination 0.2 is: " +grapes2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for plum or orange symbol
		if(me.getId().equals("50")){
			op = me.getText();
			String expected14 = op;
			String actual14 = "0.4 YSI";
			System.out.println("Payout Value of 5 Plum or Orange symbol for denomination 0.2 is: " +op);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("51")){
			op1 = me.getText();
			String expected15 = op1;
			String actual15 = "0.2 YSI";
			System.out.println("Payout Value of 4 Plum or Orange symbol for denomination 0.2 is: " +op1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("52")){
			op2 = me.getText();
			String expected16 = op2;
			String actual16 = "0.1 YSI";
			System.out.println("Payout Value of 3 Plum or Orange symbol for denomination 0.2 is: " +op2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Lemon or Cherry symbol
		if(me.getId().equals("53")){
			LC = me.getText();
			String expected14 = LC;
			String actual14 = "0.3 YSI";
			System.out.println("Payout Value of 5 Lemon or Cherry symbol for denomination 0.2 is: " +LC);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("54")){
			LC1 = me.getText();
			String expected15 = LC1;
			String actual15 = "0.1 YSI";
			System.out.println("Payout Value of 4 Lemon or Cherry symbol for denomination 0.2 is: " +LC1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("55")){
			LC2 = me.getText();
			String expected16 = LC2;
			String actual16 = "0.05 YSI";
			System.out.println("Payout Value of 3 Lemon or Cherry symbol for denomination 0.2 is: " +LC2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like bar, wild n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in (\\d+) Fruity Brownie slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_bar_wild_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Fruity_Brownie_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4, int arg5) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
