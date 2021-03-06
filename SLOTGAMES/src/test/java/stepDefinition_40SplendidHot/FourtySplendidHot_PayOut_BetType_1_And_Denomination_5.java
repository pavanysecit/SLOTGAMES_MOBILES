package stepDefinition_40SplendidHot;

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

public class FourtySplendidHot_PayOut_BetType_1_And_Denomination_5 {
	AppiumDriver<MobileElement> driver;

	public FourtySplendidHot_PayOut_BetType_1_And_Denomination_5() throws InterruptedException {
		this.driver = FourtySplendidHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot slot game, icon to open payout table, all symbols, max amount on each symbol like grapes, plum & etc, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_grapes_plum_etc_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		MobileElement balT = driver.findElement(By.id("transferInput"));
		balT.clear();
		Thread.sleep(1000);
		balT.sendKeys("300");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();

		String parent1=driver.getWindowHandle();
		Set<String>s1=driver.getWindowHandles();

		System.out.println("Window for slot game is"+" "+s1);
		 
		Set<String> contx = driver.getContextHandles();
		String pk = driver.getContext();
		//System.out.println("The current contesx is"+" "+pk);
		for(String cont:contx){
			 System.out.println(cont);
		 }
		driver.context("NATIVE_APP");
		Thread.sleep(4000);
	}

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like grapes, plum & etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+) and check payout amount on mobile$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_grapes_plum_etc_click_on_back_button_select_bet_type_as_denomination_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 8
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("8")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "8";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		
		String Scatter="",Scatter1="",Scatter2="",Seven="",Seven1="",Seven2="",Seven3="",Mango="",Mango1="",Mango2="",Cherry="",Cherry1="",Cherry2="",Cherry3="",
				Wmelon="",Wmelon1="",Wmelon2="",Grapes="",Grapes1="",Grapes2="",Plum="",Plum1="",Plum2="",Orange="",Orange1="",Orange2="";
		for(MobileElement me:balance){
		//System.out.println(me.getId()+"  "+me.getText());
		

		//Check for Seven symbol
		if(me.getId().equals("26")){
			Seven = me.getText();
			String expected5 = Seven;
			String actual5 = "200 YSI";
			System.out.println("Payout Value of 5 Seven symbols for denomination 8 is: " +Seven);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("27")){
			Seven1 = me.getText();
			String expected6 = Seven1;
			String actual6 = "80 YSI";
			System.out.println("Payout Value of 4 Seven symbols for denomination 8 is: " +Seven1);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("28")){
			Seven2 = me.getText();
			String expected7 = Seven2;
			String actual7 = "8 YSI";
			System.out.println("Payout Value of 3 Seven symbols for denomination 8 is: " +Seven2);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		//Check for Scatter symbol
		if(me.getId().equals("29")){
			Scatter = me.getText();
			String expected2 = Scatter;
			String actual2 = "4000 YSI";
			System.out.println("Payout Value of 5 Scatter symbols for denomination 8 is : " +Scatter);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("30")){
			Scatter1 = me.getText();
			String expected3 = Scatter1;
			String actual3 = "160 YSI";
			System.out.println("Payout Value of 4 Scatter symbols for denomination 8 is : " +Scatter1);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			Scatter2 = me.getText();
			String expected4 = Scatter2;
			String actual4 = "4 YSI";
			System.out.println("Payout Value of 3 Scatter symbols for denomination 8 is : " +Scatter2);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		
		//Check for Grapes symbol
		if(me.getId().equals("32")){
			Grapes = me.getText();
			String expected11 = Grapes;
			String actual11 = "100 YSI";
			System.out.println("Payout Value of 5 Grapes symbol for denomination 8 is: " +Grapes);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("33")){
			Grapes1 = me.getText();
			String expected12 = Grapes1;
			String actual12 = "16 YSI";
			System.out.println("Payout Value of 4 Grapes symbol for denomination 8 is: " +Grapes1);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("34")){
			Grapes2 = me.getText();
			String expected13 = Grapes2;
			String actual13 = "4 YSI";
			System.out.println("Payout Value of 3 Grapes symbol for denomination 8 is: " +Grapes2);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			}
		
		//Check for Plum or Watermelon symbol
		if(me.getId().equals("35")){
			Plum = me.getText();
			String expected14 = Plum;
			String actual14 = "40 YSI";
			System.out.println("Payout Value of 5 Plum or Watermelon symbol for denomination 8 is: " +Plum);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("36")){
			Plum1 = me.getText();
			String expected15 = Plum1;
			String actual15 = "8 YSI";
			System.out.println("Payout Value of 4 Plum or Watermelon symbol for denomination 8 is: " +Plum1);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("37")){
			Plum2 = me.getText();
			String expected16 = Plum2;
			String actual16 = "4 YSI";
			System.out.println("Payout Value of 3 Plum or Watermelon symbol for denomination 8 is: " +Plum2);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			}
		
		//Check for Orange or Lemon or Cherry symbol
		if(me.getId().equals("38")){
			Orange = me.getText();
			String expected17 = Orange;
			String actual17 = "20 YSI";
			System.out.println("Payout Value of 5 Orange or Lemon or Cherry symbol for denomination 8 is: " +Orange);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("39")){
			Orange1 = me.getText();
			String expected18 = Orange1;
			String actual18 = "4 YSI";
			System.out.println("Payout Value of 4 Orange or Lemon or Cherry symbol for denomination 8 is: " +Orange1);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("40")){
			Orange2 = me.getText();
			String expected19 = Orange2;
			String actual19 = "2 YSI";
			System.out.println("Payout Value of 3 Orange or Lemon or Cherry symbol for denomination 8 is: " +Orange2);
			Assert.assertEquals(actual19, expected19);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like grapes, plum & etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination to  in (\\d+) Splendid Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_grapes_plum_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_to_in_Splendid_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
