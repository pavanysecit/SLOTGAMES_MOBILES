package stepDefinition_GlowingHot;

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

public class GlowingHot_PayOut_BetType_1_And_Denomination_3 {
	AppiumDriver<MobileElement> driver;

	public GlowingHot_PayOut_BetType_1_And_Denomination_3() throws InterruptedException {
		this.driver = GlowingHot_URL_Login.getDriver();
		//this.driver = GlowingHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Glowing Hot slot game, icon to open payout table, all symbols, max amount on each symbol like watermelon, bell & etc, back button, bet type (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_watermelon_bell_etc_back_button_bet_type_and_denomination_value_as(int arg1, int arg2, int arg3, int arg4) throws Throwable {
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

	@When("^Open the Glowing Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like watermelon, bell & etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_watermelon_bell_etc_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.03";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.75
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.75")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.75";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", wmelon="",wmelon1="",wmelon2="",wmelon3="", grape="",grape1="",grape2="",bell="",bell1="",bell2="",cherry="",cherry1="",cherry2="",
				orange="", orange1="", orange2="", scatter="", scatter1="", scatter2="",scatter3="",pscatter="";
		for(MobileElement me:balance){
			
		// Checking payout max amount for each symbol when bet type is 0.03 and denomination is 0.75
		//Check for 777 symbol
		if(me.getId().equals("16")){
			Fsymbol = me.getText();
			String expected33 = Fsymbol;
			String actual33 = "450 YSI";
			System.out.println("Max Payout Value of 5 77777 symbols for denomination 0.75 is : " +Fsymbol);
			Assert.assertEquals(actual33, expected33);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("17")){
			F1symbol = me.getText();
			String expected1 = F1symbol;
			String actual1 = "30 YSI";
			System.out.println("Max Payout Value of 5 7777 symbols for denomination 0.75 is : " +F1symbol);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("18")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "7.5 YSI";
			System.out.println("Max Payout Value of 5 777 symbols for denomination 0.75 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("19")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "1.5 YSI";
			System.out.println("Max Payout Value of 5 77 symbols for denomination 0.75 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for watermelon symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("20")){
			wmelon = me.getText();
			String expected4 = wmelon;
			String actual4 = "75 YSI";
			System.out.println("Payout Value of 5 watermelon symbols for denomination 0.75 is : " +wmelon);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("21")){
			wmelon1 = me.getText();
			String expected5 = wmelon1;
			String actual5 = "15 YSI";
			System.out.println("Payout Value of 4 watermelon symbols for denomination 0.75 is: " +wmelon1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("22")){
			wmelon2 = me.getText();
			String expected6 = wmelon2;
			String actual6 = "7.5 YSI";
			System.out.println("Payout Value of 3 watermelon symbols for denomination 0.75 is: " +wmelon2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for Grape symbol
		if(me.getId().equals("23")){
			grape = me.getText();
			String expected7 = grape;
			String actual7 = "75 YSI";
			System.out.println("Payout Value of 5 grapes symbols for denomination 0.75 is: " +grape);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("24")){
			grape1 = me.getText();
			String expected8 = grape1;
			String actual8 = "15 YSI";
			System.out.println("Payout Value of 4 grapes symbols for denomination 0.75 is: " +grape1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("25")){
			grape2 = me.getText();
			String expected9 = grape2;
			String actual9 = "7.5 YSI";
			System.out.println("Payout Value of 3 grapes symbols for denomination 0.75 is: " +grape2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for bell symbol
		if(me.getId().equals("26")){
			bell = me.getText();
			String expected10 = bell;
			String actual10 = "30 YSI";
			System.out.println("Payout Value of 5 Bell symbols for denomination 0.75 is: " +bell);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("27")){
			bell1 = me.getText();
			String expected11 = bell1;
			String actual11 = "7.5 YSI";
			System.out.println("Payout Value of 4 Bell symbols for denomination 0.75 is: " +bell1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("28")){
			bell2 = me.getText();
			String expected12 = bell2;
			String actual12 = "4.5 YSI";
			System.out.println("Payout Value of 3 Bell symbols for denomination 0.75 is: " +bell2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for cherry symbol
		if(me.getId().equals("29")){
			cherry = me.getText();
			String expected13 = cherry;
			String actual13 = "15 YSI";
			System.out.println("Payout Value of 5 cherry symbols for denomination 0.75 is: " +cherry);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("30")){
			cherry1 = me.getText();
			String expected14 = cherry1;
			String actual14 = "4.5 YSI";
			System.out.println("Payout Value of 4 cherry symbols for denomination 0.75 is: " +cherry1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("31")){
			cherry2 = me.getText();
			String expected15 = cherry2;
			String actual15 = "1.5 YSI";
			System.out.println("Payout Value of 3 cherry symbols for denomination 0.75 is: " +cherry2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for orange symbol
		if(me.getId().equals("32")){
			orange = me.getText();
			String expected16 = orange;
			String actual16 = "15 YSI";
			System.out.println("Payout Value of 5 orange symbols for denomination 0.75 is: " +orange);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("33")){
			orange1 = me.getText();
			String expected17 = orange1;
			String actual17 = "4.5 YSI";
			System.out.println("Payout Value of 4 orange symbols for denomination 0.75 is: " +orange1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("34")){
			orange2 = me.getText();
			String expected18 = orange2;
			String actual18 = "1.5 YSI";
			System.out.println("Payout Value of 3 orange symbols for denomination 0.75 is: " +orange2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		//Check for scatter symbol
		if(me.getId().equals("35")){
			scatter = me.getText();
			String expected19 = scatter;
			String actual19 = "75 YSI";
			System.out.println("Payout Value of 5 scatter symbols for denomination 0.75 is: " +scatter);
			Assert.assertEquals(expected19, actual19);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("36")){
			scatter1 = me.getText();
			String expected20 = scatter1;
			String actual20 = "15 YSI";
			System.out.println("Payout Value of 4 scatter symbols for denomination 0.75 is: " +scatter1);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("37")){
			scatter2 = me.getText();
			String expected21 = scatter2;
			String actual21 = "2.25 YSI";
			System.out.println("Payout Value of 3 scatter symbols for denomination 0.75 is: " +scatter2);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		
		if(me.getId().equals("38")){
			pscatter = me.getText();
			String expected22 = pscatter;
			String actual22 = "15 YSI";
			System.out.println("Payout Value of 3 purple scatter symbol for denomination 0.75 is: " +pscatter);
			Assert.assertEquals(actual22, expected22);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like watermelon, bell & etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination value as (\\d+)\\.(\\d+) in Glowing Hot slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_watermelon_bell_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_value_as_in_Glowing_Hot_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
