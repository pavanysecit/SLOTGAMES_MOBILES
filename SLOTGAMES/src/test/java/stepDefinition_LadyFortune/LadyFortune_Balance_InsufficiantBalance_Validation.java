package stepDefinition_LadyFortune;

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

public class LadyFortune_Balance_InsufficiantBalance_Validation {
	AppiumDriver<MobileElement> driver;

	public LadyFortune_Balance_InsufficiantBalance_Validation() throws InterruptedException {
		this.driver = LadyFortune_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, Lady Fortune slot game, balance, spin button and validation message$")
	public void chrome_browser_valid_URL_valid_login_details_Lady_Fortune_slot_game_balance_spin_button_and_validation_message() throws Throwable {
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

	@When("^Open the Lady Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance, click on spin button till balance turns to zero and check the validation message$")
	public void open_the_Lady_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_click_on_spin_button_till_balance_turns_to_zero_and_check_the_validation_message() throws Throwable {
		//Storing the value before converting the balance into credits
		String preWin = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		System.out.println("Current balance of the account Before Converting into credits: " +preWin);
		
		//Selecting the credit as 0.5 from the drop down
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.5")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.5";
		Assert.assertEquals(actual, expected);

		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +actual1);
		String expected1 = "10";
		Assert.assertEquals(actual1, expected1);
		Thread.sleep(2000);
		String betValue = actual1;
		
		//Clicking on Spin button
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.id("hud_btnSpin")).click();
		Thread.sleep(2000);
		
//		driver.findElement(By.id("hud_btnSpin")).click();
//		Thread.sleep(2000);
		
		String actual2 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[3]/android.view.View[3]/android.view.View[3]/android.view.View")).getText();
		String expected2 = "Insufficient Balance.";
		Assert.assertEquals(actual2, expected2);
		Thread.sleep(2000);
	}

	@Then("^Player should be blocked from playing the game when there is no balance in the account in Lady Fortune game$")
	public void player_should_be_blocked_from_playing_the_game_when_there_is_no_balance_in_the_account_in_Lady_Fortune_game() throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}
