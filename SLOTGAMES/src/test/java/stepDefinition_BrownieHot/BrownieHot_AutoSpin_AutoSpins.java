package stepDefinition_BrownieHot;

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

public class BrownieHot_AutoSpin_AutoSpins {
	AppiumDriver<MobileElement> driver;

	public BrownieHot_AutoSpin_AutoSpins() throws InterruptedException {
		this.driver = BrownieHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Brownie Hot slot game, balance, spin button, auto spin button, auto spins option and number of spins left message$")
	public void chrome_browser_valid_URL_valid_login_details_Brownie_Hot_slot_game_balance_spin_button_auto_spin_button_auto_spins_option_and_number_of_spins_left_message() throws Throwable {
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

	@When("^Open the Brownie Hot slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on auto spin option under auto spin drop down and check the player instruction message$")
	public void open_the_Brownie_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_auto_spin_option_under_auto_spin_drop_down_and_check_the_player_instruction_message() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 6);
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[1]/android.view.View[6]/android.view.View[1]/android.view.View/android.view.View[1]")).click();
		Thread.sleep(3000);
		
		while(true)
		 {
			driver.findElement(By.id("AutoSpinListItem_Auto")).click();
			Thread.sleep(0500);
			break;
		 }
		
//		MobileElement element = driver.findElement(By.id("AutoSpinListItem_10"));
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("btnSearch")));
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", element);
//		wait.until(ExpectedConditions.elementToBeClickable(By.id("AutoSpinListItem_10")));
		
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected = "GOOD LUCK!";
	    System.out.println(actual);
	    Assert.assertEquals(actual, expected);
 
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual1 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected1 = "GOOD LUCK!";
	    System.out.println(actual1);
	    Assert.assertEquals(actual1, expected1);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual2 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected2 = "GOOD LUCK!";
	    System.out.println(actual2);
	    Assert.assertEquals(actual2, expected2);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual3 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected3 = "GOOD LUCK!";
	    System.out.println(actual3);
	    Assert.assertEquals(actual3, expected3);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual4 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected4 = "GOOD LUCK!";
	    System.out.println(actual4);
	    Assert.assertEquals(actual4, expected4);
	    
	    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("hud_txtWinDetail"), "GOOD LUCK!"));
	    String actual5 = driver.findElement(By.id("hud_txtWinDetail")).getText();
	    String expected5 = "GOOD LUCK!";
	    System.out.println(actual5);
	    Assert.assertEquals(actual5, expected5);
	}

	@Then("^System should keep performing the spins in Brownie Hot slot game$")
	public void system_should_keep_performing_the_spins_in_Brownie_Hot_slot_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
