package stepDefinition_40SplendidHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class FourtySplendidHot_Balance_Deduction_AccordingToBetType1_5 {
	AppiumDriver<MobileElement> driver;

	public FourtySplendidHot_Balance_Deduction_AccordingToBetType1_5() throws InterruptedException {
		this.driver = FourtySplendidHot_URL_Login.getDriver();
		//this.driver = FourtySplendidHot_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot game, bet type as (\\d+)\\.(\\d+), bet value as EIGHT, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_game_bet_type_as_bet_value_as_EIGHT_balance_and_spin_button(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to EIGHT, click on spin button and check the slot game balance$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_EIGHT_click_on_spin_button_and_check_the_slot_game_balance(int arg1, int arg2, int arg3) throws Throwable {
		//Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preSpin.replaceAll(",", "");
		System.out.println("Current balance of the account Before spin: " +str);
		
		//Selecting the credit as 0.01 from the drop down
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup10.01")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.01";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 8 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_BetPopup58")).click();
		Thread.sleep(2000);
		
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "8";
		System.out.println("Selected bet value is : " +actual1);
		Assert.assertEquals(actual1, expected1);
			
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(5000);
		
		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postSpin.replaceAll(",", "");
		System.out.println("Current balance of the account After spin: " +str1);
		
		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(str) - Double.parseDouble(actual1);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		
		Assert.assertEquals(dbi,str1);
	}

	@Then("^Existing Balance should get deducted by EIGHT as bet type is selected as (\\d+)\\.(\\d+) and bet value as EIGHT in (\\d+) Splendid Hot slot game$")
	public void existing_Balance_should_get_deducted_by_EIGHT_as_bet_type_is_selected_as_and_bet_value_as_EIGHT_in_Splendid_Hot_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
