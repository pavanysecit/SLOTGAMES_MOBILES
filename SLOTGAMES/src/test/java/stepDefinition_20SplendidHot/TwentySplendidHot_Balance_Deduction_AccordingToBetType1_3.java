package stepDefinition_20SplendidHot;

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

public class TwentySplendidHot_Balance_Deduction_AccordingToBetType1_3 {
	AppiumDriver<MobileElement> driver;

	public TwentySplendidHot_Balance_Deduction_AccordingToBetType1_3() throws InterruptedException {
		this.driver = TwentySplendidHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Splendid Hot game, bet type as (\\d+)\\.(\\d+), bet value as ONE, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_Splendid_Hot_game_bet_type_as_bet_value_as_ONE_balance_and_spin_button(int arg1, int arg2, int arg3) throws Throwable {
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

	@When("^Open the (\\d+) Splendid Hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value to ONE, click on spin button and check the slot game balance$")
	public void open_the_Splendid_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_to_ONE_click_on_spin_button_and_check_the_slot_game_balance(int arg1, int arg2, int arg3) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 90);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));     
	   //Storing the value before spin
		String preSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before spin: " +preSpin);
		
		//Getting the bet value and Bet amount
		String creditValue = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is: " +creditValue);
		//Selecting bet amount as 1
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("1")){
				be.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual);
		String expected = "1";
		Assert.assertEquals(actual, expected);
		Thread.sleep(2000);
			
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(5000);
		
		//Storing the value after spin
		String postSpin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account After spin: " +postSpin);
		
		//Deducting bet value from the preSpin and formating string to double
		double fValue = Double.parseDouble(preSpin) - Double.parseDouble(actual);
		String dbi = String.format("%.2f", fValue);  
		System.out.println("Final balance after deducting bet amount from the balance : "+dbi);
		
		Assert.assertEquals(dbi,postSpin);
	}

	@Then("^Existing Balance should get deducted by ONE as bet type is selected as (\\d+)\\.(\\d+) and bet value as ONE in (\\d+) Splendid Hot slot game$")
	public void existing_Balance_should_get_deducted_by_ONE_as_bet_type_is_selected_as_and_bet_value_as_ONE_in_Splendid_Hot_slot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}
