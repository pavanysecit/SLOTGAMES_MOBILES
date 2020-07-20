package stepDefinition_20FruityBrownie;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class TwentyFruityBrownie_PayOut_BetType_1_And_Denomination_4 {
	AppiumDriver<MobileElement> driver;

	public TwentyFruityBrownie_PayOut_BetType_1_And_Denomination_4() throws InterruptedException {
		this.driver = TwentyFruityBrownie_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Fruity Brownie slot game, icon to open payout table, all symbols, max amount on each symbol like banana, watermelon n etc, back button, bet type (\\d+)\\.(\\d+) and denomination as (\\d+) on mobile$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Brownie_slot_game_icon_to_open_payout_table_all_symbols_max_amount_on_each_symbol_like_banana_watermelon_n_etc_back_button_bet_type_and_denomination_as_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
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

	@When("^Open the (\\d+) Fruity Brownie slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on icon to open payout table, check payout amount on each symbol like banana, watermelon n etc, click on back button, select bet type as (\\d+)\\.(\\d+) & denomination as (\\d+) and check payout amount on mobile$")
	public void open_the_Fruity_Brownie_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_icon_to_open_payout_table_check_payout_amount_on_each_symbol_like_banana_watermelon_n_etc_click_on_back_button_select_bet_type_as_denomination_as_and_check_payout_amount_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^System should display the Payout max amount on each symbol like banana, watermelon n etc and payout max amount should get changed whenever player changes the bet type to (\\d+)\\.(\\d+) and denomination to (\\d+) in (\\d+) Fruity Brownie slot game on mobile$")
	public void system_should_display_the_Payout_max_amount_on_each_symbol_like_banana_watermelon_n_etc_and_payout_max_amount_should_get_changed_whenever_player_changes_the_bet_type_to_and_denomination_to_in_Fruity_Brownie_slot_game_on_mobile(int arg1, int arg2, int arg3, int arg4) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}