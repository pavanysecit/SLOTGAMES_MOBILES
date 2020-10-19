package stepDefinition_HappyFruits;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class HappyFruits_Balance_Credits_Calculations_Value4 {
	AppiumDriver<MobileElement> driver;

	public HappyFruits_Balance_Credits_Calculations_Value4() throws InterruptedException {
		this.driver = HappyFruits_URL_Login.getDriver();
		//this.driver = HappyFruits_URL_TryNow.getDriver();
	}
	
	@Given("^Chrome browser, valid URL, valid login details, Happy Fruits slot game, balance, credits and denomination drop down & value as (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Happy_Fruits_slot_game_balance_credits_and_denomination_drop_down_value_as(int arg1) throws Throwable {
		WebDriverWait wait1 = new WebDriverWait(driver, 80);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
	}

	@When("^Open the Happy Fruits slot game by entering the valid URL in browser, enter the valid login details, click on balance, multiply credit by denomination (\\d+) manually with and check the balance$")
	public void open_the_Happy_Fruits_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_click_on_balance_multiply_credit_by_denomination_manually_with_and_check_the_balance(int arg1) throws Throwable {
		//Storing the value before converting the balance into credits
		String preConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str = preConvert.replaceAll(",", "");
		System.out.println("Current balance of the account Before Converting into credits: " +str);
		
		//Selecting the credit as 1 from the drop down and bet amount
		driver.findElement(By.id("hud_txtCredit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hud_CreditPopup41")).click();
		Thread.sleep(2000);
		
		String actual = driver.findElement(By.id("hud_txtCredit")).getText();
		String creditValue = actual;
		System.out.println("Selected credit value is : " +actual);
		String expected = "1";
		Assert.assertEquals(actual, expected);
		
		String betValue = driver.findElement(By.id("hud_txtBetAmount")).getText();
		System.out.println("Selected bet amount is: " +betValue);
		Thread.sleep(2000);
		
		//Clicking on balance to convert balance into credits
		driver.findElement(By.id("hud_Hud_txtBalance1")).click();
		Thread.sleep(3000);
		
		//Displaying the balance in credits
		String postConvert = driver.findElement(By.id("hud_Hud_txtBalance1")).getText();
		String str1 = postConvert.replaceAll(",", "");
		System.out.println("Balance of the account after Converting into credits: " +str1);
		Thread.sleep(2000);
		
		//Multiplying the credit by bet value 1 and comparing the balance
		double conValue = Double.parseDouble(str1) * Double.parseDouble(creditValue);
		//System.out.println("After deducting the bet value after spin: " +secSpin3);
		String dbi = String.format("%.2f", conValue);  
		System.out.println("Final balance after converting credits into currency is: "+dbi);
		
		Assert.assertEquals(dbi,str);
	}

	@Then("^Balance amount should be same after multiplying denomination (\\d+) by credit in Happy Fruits slot game$")
	public void balance_amount_should_be_same_after_multiplying_denomination_by_credit_in_Happy_Fruits_slot_game(int arg1) throws Throwable {
	    Thread.sleep(2000);
	    driver.quit();
	}
}