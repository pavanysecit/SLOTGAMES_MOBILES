package stepDefinition_FruitFortune;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FruityFortune_Navigate_HomeScreen {
	AppiumDriver<MobileElement> driver;

	public FruityFortune_Navigate_HomeScreen() throws InterruptedException {
		this.driver = FruityFortune_URL_Login.getDriver();
		//this.driver = FruityFortune_URL_TryNow.getDriver();
		}
	
	
	@Given("^Chrome browser, valid URL, valid login details, Fruity Fortune slot game and home button$")
	public void chrome_browser_valid_URL_valid_login_details_Fruity_Fortune_slot_game_and_home_button() throws Throwable {
	    
	}

	@When("^Open the Fruity Fortune slot game by entering the valid URL in browser, enter the valid login details, transfer the balance and click on home button$")
	public void open_the_Fruity_Fortune_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_transfer_the_balance_and_click_on_home_button() throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1"))); 
       // change the orientation of the screen
		driver.rotate(ScreenOrientation.LANDSCAPE);   		
        driver.findElement(By.id("hud_btnHome")).click();
		Thread.sleep(4000);

		String expected= driver.findElement(By.id("com.android.chrome:id/url_bar")).getText();
		//String expected = driver.findElement(By.xpath("/html/body/div[3]/div[1]/ui-view/section/section[1]/h3")).getText();
		String actual = "demo.ysecit.in:82/SlotGames/slotsgame";
		Assert.assertEquals(expected, actual);
	}

	@Then("^System should take the player to Home page after clicking on home button from Fruity Fortune game$")
	public void system_should_take_the_player_to_Home_page_after_clicking_on_home_button_from_Fruity_Fortune_game() throws Throwable {
		Thread.sleep(2000);
	    driver.quit();
	}
}