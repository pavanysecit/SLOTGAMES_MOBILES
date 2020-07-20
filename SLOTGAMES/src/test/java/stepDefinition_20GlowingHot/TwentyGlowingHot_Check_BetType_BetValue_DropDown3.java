package stepDefinition_20GlowingHot;

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

public class TwentyGlowingHot_Check_BetType_BetValue_DropDown3 {
	AppiumDriver<MobileElement> driver;

	public TwentyGlowingHot_Check_BetType_BetValue_DropDown3() throws InterruptedException {
		this.driver = TwentyGlowingHot_URL_Login.getDriver();
		}
	
	@Given("^Chrome browser, valid URL, valid login details, (\\d+) Glowing Hot slot game, bet type as (\\d+)\\.(\\d+) from down (\\d+) and bet value as (\\d+),(\\d+),(\\d+),(\\d+) & (\\d+)$")
	public void chrome_browser_valid_URL_valid_login_details_Glowing_Hot_slot_game_bet_type_as_from_down_and_bet_value_as(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) throws Throwable {
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

	@When("^Open the (\\d+) Glowing Hot slot game by entering the valid URL in browser, enter the valid logi\\., n details, select the bet type as (\\d+)\\.(\\d+) from down  and check the bet value should be (\\d+),(\\d+),(\\d+),(\\d+) & (\\d+)$")
	public void open_the_Glowing_Hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_logi_n_details_select_the_bet_type_as_from_down_and_check_the_bet_value_should_be(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		//Selecting the credit as 0.05 from the drop down
		driver.findElement(By.id("hud_btnCredit")).click();
		Thread.sleep(2000);
		for(MobileElement be:balance)
		{
			
			if(be.getText().equals("0.05")){
				be.click();
				Thread.sleep(3000);
				break;
			}	
		}
		String actual = driver.findElement(By.id("hud_txtCreditValue")).getText();
		System.out.println("Selected credit value is : " +actual);
		String expected = "0.05";
		Assert.assertEquals(actual, expected);
		
		//Selecting the bet amount as 1 from the drop down
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be1:balance)
		{
			
			if(be1.getText().equals("1")){
				be1.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual1 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected1 = "1";
		System.out.println("Available bet amounts under credit 0.05 are : " +"\n" +actual1);
		Assert.assertEquals(actual1, expected1);
		
		//Selecting bet amount as 2
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be2:balance)
		{
			
			if(be2.getText().equals("2")){
				be2.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual2 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected2 = "2";
		System.out.println("\n" +actual2);
		Assert.assertEquals(actual2, expected2);
		
		//Selecting bet amount as 5
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be3:balance)
		{
			
			if(be3.getText().equals("5")){
				be3.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual3 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected3 = "5";
		System.out.println("\n" +actual3);
		Assert.assertEquals(actual3, expected3);
		
		//Selecting bet amount as 10
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be4:balance)
		{
			
			if(be4.getText().equals("10")){
				be4.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual4 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected4 = "10";
		System.out.println("\n" +actual4);
		Assert.assertEquals(actual4, expected4);

		//Selecting bet amount as 20
		driver.findElement(By.id("hud_txtBetAmount")).click();
		Thread.sleep(2000);
		for(MobileElement be5:balance)
		{
			
			if(be5.getText().equals("20")){
				be5.click();
				Thread.sleep(2000);
				break;
			}	
		}
		String actual5 = driver.findElement(By.id("hud_txtBetAmount")).getText();
		String expected5 = "20";
		System.out.println("\n" +actual5);
		Assert.assertEquals(actual5, expected5);
		Thread.sleep(2000);
	}

	@Then("^Bet value should get changed to (\\d+),(\\d+),(\\d+),(\\d+) & (\\d+) if the bet type selected as (\\d+)\\.(\\d+) from the drop down two in (\\d+) Glowing Hot slot game$")
	public void bet_value_should_get_changed_to_if_the_bet_type_selected_as_from_the_drop_down_two_in_Glowing_Hot_slot_game(int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}