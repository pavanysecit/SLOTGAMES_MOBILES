package stepDefinition_GoldenHot1;

import java.text.DecimalFormat;
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

public class GoldenHot_Balance_Deduction_AccordingToBetType2_5 {
AppiumDriver<MobileElement> driver;
//private MobileElement pqr;

	public GoldenHot_Balance_Deduction_AccordingToBetType2_5() throws InterruptedException {
		this.driver = SlotGames_URL_Login.getDriver();
	}	
	
	@Given("^Chrome browser, valid URL, valid login details, golden hot slot game, bet type as (\\d+)\\.(\\d+), bet value as FIVE, balance and spin button$")
	public void chrome_browser_valid_URL_valid_login_details_golden_hot_slot_game_bet_type_as_bet_value_as_FIVE_balance_and_spin_button(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("transferInput")));
		
		driver.findElement(By.id("transferInput")).sendKeys("33.82");
		Thread.sleep(2000);
		driver.findElement(By.className("Transfer_Ok_but")).click();
		Thread.sleep(40000);
		 
		 
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

	@When("^Open the Golded hot slot game by entering the valid URL in browser, enter the valid login details, select the bet type as (\\d+)\\.(\\d+), select the bet value as FIVE, click on spin button and check the balance$")
	public void open_the_Golded_hot_slot_game_by_entering_the_valid_URL_in_browser_enter_the_valid_login_details_select_the_bet_type_as_select_the_bet_value_as_FIVE_click_on_spin_button_and_check_the_balance(int arg1, int arg2) throws Throwable {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("hud_Hud_txtBalance1")));
		List<MobileElement> balance = driver.findElementsByClassName("android.view.View");
		
		//Storing the balance before spin
		String prewin1="";
		for(MobileElement me:balance){
			//System.out.println(me.getId()+"  "+me.getText());
			if(me.getId().equals("37")){
				 prewin1 = me.getText();
			System.out.println("The current Balance of Account Before Spin: " +me.getText());
			}
		}
		
		//Selecting bet type as 0.05
		for(MobileElement me7:balance)
		{
			if(me7.getText().equals("1 Cr ="))
			{
				me7.click();
			Thread.sleep(2000);
			}
			 if(me7.getText().equals("0.05"))
			 {
				 me7.click();
			 Thread.sleep(1000);
			 }
			 //System.out.println(me1.getId()+"  "+me1.getText());	 
		}
		
		// Selecting bet value as 5
		for(MobileElement me3:balance)
		{
			if(me3.getText().equals("Bet"))
			{
				me3.click();
			Thread.sleep(2000);
			}
			 if(me3.getText().equals("5"))
			 {
				 me3.click();
			 Thread.sleep(1000);
			 }
			 //System.out.println(me1.getId()+"  "+me1.getText());	 
		}
		
		// Storing the bet value 5
		String betvalue1="";
		for(MobileElement be1:balance)
		{
			if(be1.getId().equals("25")){
				 betvalue1 = be1.getText();
				  
			System.out.println("The bet value is: " +be1.getText());
			String expected = be1.getText();
			Assert.assertTrue(expected.contentEquals("5"));	
			System.out.println("expected bet value should be: "+be1.getText());
			}
		}
		
		//Clicking on start button
		MobileElement start = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[6]/android.view.View[2]"));
		start.click();
		//MobileElement pqr= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View[2]/android.view.View[1]/android.view.View[22]/android.view.View[1]"));
		
		//Storing the balance after 2nd spin
		String postspin1="";
		for(MobileElement me4:balance){
			//System.out.println(me4.getId()+"  "+me4.getText());
			if(me4.getId().equals("33")){
				 postspin1 = me4.getText();
				  //this.pqr=me4;
			System.out.println("The current Balance of Account After Spin : " +me4.getText());
			}
		}
		double secSpin = Double.parseDouble(prewin1) - Double.parseDouble(betvalue1);
		System.out.println("After deducting the bet value after spin: " +secSpin);
		DecimalFormat df1 = new DecimalFormat("#.00");
	    //df.setRoundingMode(RoundingMode.DOWN);
	    Double dbi1 =Double.parseDouble(df1.format(secSpin));
	    String pq1="";
	    String paq1=pq1+dbi1;
		Assert.assertEquals(paq1,postspin1);
	}

	@Then("^Current Balance should get deducted by FIVE as bet type is selected as (\\d+)\\.(\\d+) & bet value as (\\d+) in golden hot game$")
	public void current_Balance_should_get_deducted_by_FIVE_as_bet_type_is_selected_as_bet_value_as_in_golden_hot_game(int arg1, int arg2, int arg3) throws Throwable {
		Thread.sleep(3000);
		driver.quit();
	}
}