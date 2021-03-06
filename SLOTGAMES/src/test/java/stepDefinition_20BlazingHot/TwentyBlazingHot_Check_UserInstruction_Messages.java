package stepDefinition_20BlazingHot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyBlazingHot_Check_UserInstruction_Messages {
	AppiumDriver<MobileElement> driver;

	public TwentyBlazingHot_Check_UserInstruction_Messages() throws InterruptedException {
		this.driver = TwentyBlazingHot_URL_Login.getDriver();
		//this.driver = TwentyBlazingHot_URL_TryNow.getDriver();	
	}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Blazing Hot slot game, balance, spin button and user instruction message$")
	public void chrome_browser_valid_URL_valid_login_details_Blazing_Hot_slot_game_balance_spin_button_and_user_instruction_message(int arg1) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the (\\d+) Blazing Hot hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button and check the user instruction messages$")
	public void open_the_Blazing_Hot_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_and_check_the_user_instruction_messages(int arg1) throws Throwable {
		String preMsg = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    Thread.sleep(3000);
	    String actual = preMsg;
	    String expected = "Please Place Your Bet";
	    System.out.println("Actual Message before Spin:" +actual);
	    Assert.assertEquals(expected, actual);
	    
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(1000);
		String postMsg = driver.findElement(By.id("hud_txtWinDetail")).getText();
		String actual1 = postMsg;
	    String expected1 = "GOOD LUCK!";
	    System.out.println("Actual Message After Spin:" +actual1);
	    Assert.assertEquals(expected1, actual1);
	    Thread.sleep(1000);
	}

	@Then("^User instruction message 'Please place your bet' should be displayed before spin button is clicked$")
	public void user_instruction_message_Please_place_your_bet_should_be_displayed_before_spin_button_is_clicked() throws Throwable {
		Thread.sleep(2000);
	}

	@Then("^User instruction message 'Good Luck' should be displayed after spin button is clicked in (\\d+) Blazing Hot slot game$")
	public void user_instruction_message_Good_Luck_should_be_displayed_after_spin_button_is_clicked_in_Blazing_Hot_slot_game(int arg1) throws Throwable {
	    driver.quit();
	}
}
