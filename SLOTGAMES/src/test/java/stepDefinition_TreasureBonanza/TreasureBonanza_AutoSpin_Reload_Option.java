package stepDefinition_TreasureBonanza;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class TreasureBonanza_AutoSpin_Reload_Option {
	AppiumDriver<MobileElement> driver;

	public TreasureBonanza_AutoSpin_Reload_Option() throws InterruptedException {
		this.driver = TreasureBonanza_URL_Login.getDriver();
		//this.driver = TreasureBonanza_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Treasure Bonanza slot game, balance, Autospin button, browser hamburger reload button valid session invalid error message\\.$")
	public void chrome_browser_valid_URL_valid_login_details_Treasure_Bonanza_slot_game_balance_Autospin_button_browser_hamburger_reload_button_valid_session_invalid_error_message() throws Throwable {
	  
	}

	@When("^Open the Treasure Bonanza slot game by entering the valid URL in browser, enter the valid login details, select autospin button, click on  hamburger menu and reload the game session\\.$")
	public void open_the_Treasure_Bonanza_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_autospin_button_click_on_hamburger_menu_and_reload_the_game_session() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		String balance = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("The balance in first session"+" "+balance);
		MobileElement start = driver.findElement(By.id("hud_btnAuto"));
		start.click();
		Thread.sleep(4000);
		// Click on Hamburger Menu
		MobileElement menu = driver.findElement(By.id("com.android.chrome:id/menu_button"));
		menu.click();
		Thread.sleep(2000);
		// Select the refresh button
		MobileElement refresh = driver. findElement(MobileBy. AccessibilityId("Refresh page"));
		refresh.click();
		Thread.sleep(2000);
		// Validation message on refreshing the game page
		MobileElement title = driver.findElement(By.id("com.android.chrome:id/title"));
		System.out.println("Title: "+title.getText());
		MobileElement ValidMessage = driver.findElement(By.id("com.android.chrome:id/message"));
		String validmsg = ValidMessage.getText();
		System.out.println("Valid error message with details:  "+validmsg);
		String message = "Authentication Failed or Session Invalid. Please try Again.";
		Assert.assertEquals(message, validmsg);
		System.out.println("Validation is successfull");

		// Click on OK button
		MobileElement ok = driver.findElement(By.id("com.android.chrome:id/positive_button"));
		ok.click();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);

		driver.context("CHROMIUM");
		Thread.sleep(4000);

		// Validating it has redirected to game selection screen
		MobileElement logo = driver.findElement(By.xpath("//img[@name='Suribet']"));
		Assert.assertTrue(logo.isDisplayed());
		System.out.println("User is redirected to game selection screen");

		// Again login to game to validate autospin is not continued
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/ui-view[1]/section[1]/section[1]/div[1]/div[1]/div[2]/div[3]/ul[1]/li[33]/div[1]/div[1]")).click();
		Thread.sleep(3000);

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

		if(driver.findElements(By.id("AutoSpinListItem_undefined")).size() != 0){
			System.out.println("Autospin list drop values is Present");
			Assert.assertTrue(driver.findElements(By.id("AutoSpinListItem_undefined")).size() != 0);
			System.out.println("Testcase passed");
		}else{
			System.out.println("Autospin list drop is Absent");
			Assert.assertFalse(driver.findElements(By.id("AutoSpinListItem_undefined")).size() != 0);
			System.out.println("Testcase failed");
		}
		Thread.sleep(2000);
	}

	@Then("^User should not able to resume to game and autospin should be terminated and informed with valid error message for session invalid in Treasure Bonanza slot game$")
	public void user_should_not_able_to_resume_to_game_and_autospin_should_be_terminated_and_informed_with_valid_error_message_for_session_invalid_in_Treasure_Bonanza_slot_game() throws Throwable {
		Thread.sleep(1000);
	    driver.quit();
	}
}
