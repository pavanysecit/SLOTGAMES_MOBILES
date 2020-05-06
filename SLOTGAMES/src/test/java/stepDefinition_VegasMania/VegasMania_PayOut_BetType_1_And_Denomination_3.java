package stepDefinition_VegasMania;

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

public class VegasMania_PayOut_BetType_1_And_Denomination_3 {
	AppiumDriver<MobileElement> driver;

	public VegasMania_PayOut_BetType_1_And_Denomination_3() throws InterruptedException {
		this.driver = VegasMania_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Vegas Mania slot game, icon to open payout table, all symbols, max amount on each symbol like A, K, apple n etc, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+)\\.(\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Vegas_Mania_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_A_K_apple_n_etc_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
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

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like A, K, apple n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+)\\.(\\d+) and check payout amount on mobile$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_A_K_apple_n_etc_click_on_back_button_select_bet_type_as_denomination_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
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

	@When("^Open the Vegas Mania slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination  values as (\\d+)\\.(\\d+) and check payout amount$")
	public void open_the_Vegas_Mania_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_click_on_back_button_select_bet_type_as_denomination_values_as_and_check_payout_amount(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    //Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		String actualC = creditValue;
		String expectedC = "0.01";
		Assert.assertEquals(expectedC, actualC);
		Thread.sleep(1000);
		
		//Selecting bet amount as 0.5
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.5")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "0.5";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
		
		//Clicking on icon to open the PayOut table
		driver.findElement(By.id("hud_btnMenu")).click();
		Thread.sleep(2000);
	
		
		String Fsymbol="", F1symbol="", F2symbol="", F3symbol="", ThreeBars="", ThreeBars1="", ThreeBars2="", TwoBars="", TwoBars1="",TwoBars2="",SingleBar="",SingleBar1="",SingleBar2="",wmelon="",wmelon1="",wmelon2="",cherry2="",
				orange="", orange1="", orange2="", Lemon="", Lemon1="", Lemon2="",scatter3="",pscatter="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			
		// Checking payout max amount for each symbol when bet type is 0.01 and denomination is 0.5
		//Check for 777 symbol
		if(me.getId().equals("27")){
			F1symbol = me.getText();
			String expected1 = F1symbol;
			String actual1 = "500 YSI";
			System.out.println("Max Payout Value of 777 symbols for denomination 0.5 is : " +F1symbol);
			Assert.assertEquals(actual1, expected1);
			Thread.sleep(1000);
		}
		if(me.getId().equals("28")){
			F2symbol = me.getText();
			String expected2 = F2symbol;
			String actual2 = "25 YSI";
			System.out.println("Max Payout Value of 77 symbols for denomination 0.5 is : " +F2symbol);
			Assert.assertEquals(actual2, expected2);
			Thread.sleep(1000);
		}
		if(me.getId().equals("29")){
			F3symbol = me.getText();
			String expected3 = F3symbol;
			String actual3 = "1 YSI";
			System.out.println("Max Payout Value of 7 symbols for denomination 0.5 is : " +F3symbol);
			Assert.assertEquals(actual3, expected3);
			Thread.sleep(1000);
		}
		
		//Check for ThreeBars symbol
		//System.out.println(me.getId()+"  "+me.getText());
		if(me.getId().equals("30")){
			ThreeBars = me.getText();
			String expected4 = ThreeBars;
			String actual4 = "200 YSI";
			System.out.println("Payout Value of 5 ThreeBars symbols for denomination 0.5 is : " +ThreeBars);
			Assert.assertEquals(actual4, expected4);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("31")){
			ThreeBars1 = me.getText();
			String expected5 = ThreeBars1;
			String actual5 = "20 YSI";
			System.out.println("Payout Value of 4 ThreeBars symbols for denomination 0.5 is: " +ThreeBars1);
			Assert.assertEquals(actual5, expected5);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("32")){
			ThreeBars2 = me.getText();
			String expected6 = ThreeBars2;
			String actual6 = "10 YSI";
			System.out.println("Payout Value of 3 ThreeBars symbols for denomination 0.5 is: " +ThreeBars2);
			Assert.assertEquals(actual6, expected6);
			Thread.sleep(1000);
		}
		
		//Check for WaterMelon symbol
		if(me.getId().equals("33")){
			wmelon = me.getText();
			String expected7 = wmelon;
			String actual7 = "10 YSI";
			System.out.println("Payout Value of 5 lemons symbols for denomination 0.5 is: " +wmelon);
			Assert.assertEquals(actual7, expected7);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("34")){
			wmelon1 = me.getText();
			String expected8 = wmelon1;
			String actual8 = "5 YSI";
			System.out.println("Payout Value of 4 lemons symbols for denomination 0.5 is: " +wmelon1);
			Assert.assertEquals(actual8, expected8);
			Thread.sleep(1000);
		}
		
		if(me.getId().equals("35")){
			wmelon2 = me.getText();
			String expected9 = wmelon2;
			String actual9 = "2 YSI";
			System.out.println("Payout Value of 3 lemons symbols for denomination 0.5 is: " +wmelon2);
			Assert.assertEquals(actual9, expected9);
			Thread.sleep(1000);
		}
		
		//Check for TwoBars symbol
		if(me.getId().equals("36")){
			TwoBars = me.getText();
			String expected10 = TwoBars;
			String actual10 = "100 YSI";
			System.out.println("Payout Value of 5 TwoBars symbols for denomination 0.5 is: " +TwoBars1);
			Assert.assertEquals(actual10, expected10);
			Thread.sleep(1000);
			} 
		if(me.getId().equals("37")){
			TwoBars1 = me.getText();
			String expected11 = TwoBars1;
			String actual11 = "10 YSI";
			System.out.println("Payout Value of 4 TwoBars symbols for denomination 0.5 is: " +TwoBars1);
			Assert.assertEquals(actual11, expected11);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("38")){
			TwoBars2 = me.getText();
			String expected12 = TwoBars2;
			String actual12 = "5 YSI";
			System.out.println("Payout Value of 3 TwoBars symbols for denomination 0.5 is: " +TwoBars2);
			Assert.assertEquals(actual12, expected12);
			Thread.sleep(1000);
			} 
		
		//Check for SingleBar symbol
		if(me.getId().equals("39")){
			SingleBar = me.getText();
			String expected13 = SingleBar;
			String actual13 = "50 YSI";
			System.out.println("Payout Value of 5 Bells symbols for denomination 0.5 is: " +SingleBar);
			Assert.assertEquals(actual13, expected13);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("40")){
			SingleBar1 = me.getText();
			String expected14 = SingleBar1;
			String actual14 = "5 YSI";
			System.out.println("Payout Value of 4 SingleBar symbols for denomination 0.5 is: " +SingleBar1);
			Assert.assertEquals(actual14, expected14);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("41")){
			SingleBar2 = me.getText();
			String expected15 = SingleBar2;
			String actual15 = "2 YSI";
			System.out.println("Payout Value of 3 SingleBar symbols for denomination 0.5 is: " +SingleBar2);
			Assert.assertEquals(actual15, expected15);
			Thread.sleep(1000);
			} 
		
		//Check for orange symbol
		if(me.getId().equals("42")){
			orange = me.getText();
			String expected16 = orange;
			String actual16 = "5 YSI";
			System.out.println("Payout Value of 5 orange symbols for denomination 0.5 is: " +orange);
			Assert.assertEquals(actual16, expected16);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("43")){
			orange1 = me.getText();
			String expected17 = orange1;
			String actual17 = "1 YSI";
			System.out.println("Payout Value of 4 orange symbols for denomination 0.5 is: " +orange1);
			Assert.assertEquals(actual17, expected17);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("44")){
			orange2 = me.getText();
			String expected18 = orange2;
			String actual18 = "0.5 YSI";
			System.out.println("Payout Value of 3 orange symbols for denomination 0.5 is: " +orange2);
			Assert.assertEquals(actual18, expected18);
			Thread.sleep(1000);
			}
		
		//Check for Lemon symbol
		if(me.getId().equals("45")){
			Lemon = me.getText();
			String expected19 = Lemon;
			String actual19 = "5 YSI";
			System.out.println("Payout Value of 5 Lemon symbols for denomination 0.5 is: " +Lemon);
			Assert.assertEquals(expected19, actual19);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("46")){
			Lemon1 = me.getText();
			String expected20 = Lemon1;
			String actual20 = "1 YSI";
			System.out.println("Payout Value of 4 Lemon symbols for denomination 0.5 is: " +Lemon1);
			Assert.assertEquals(actual20, expected20);
			Thread.sleep(1000);
			} 
		
		if(me.getId().equals("47")){
			Lemon2 = me.getText();
			String expected21 = Lemon2;
			String actual21 = "0.5 YSI";
			System.out.println("Payout Value of 3 Lemon symbols for denomination 0.5 is: " +Lemon2);
			Assert.assertEquals(actual21, expected21);
			Thread.sleep(1000);
			}
		}
	}

	@Then("^System should display the Payout max amount on each symbol like A, K, apple n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination to (\\d+)\\.(\\d+) in Vegas Mania slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_A_K_apple_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_to_in_Vegas_Mania_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    Thread.sleep(2000);
		driver.quit();
	}
}