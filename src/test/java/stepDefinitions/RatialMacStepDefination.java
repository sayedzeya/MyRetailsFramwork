package stepDefinitions;

import org.junit.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.RetailMacObj;
import utilities.WebDriverUtility;

public class RatialMacStepDefination extends Base{
	
	
	
	RetailMacObj MacBookPro = new RetailMacObj();
//	
//	@Given("^User User is on the webpage$")
//	public void user_User_is_on_the_webpage() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		MacBookPro.getURL();
//		logger.info("User is on the ratial WebPage");
//		WebDriverUtility.screenShot();
//		
//		
//	}

	@Then("^User Search (.+)$")
	public void user_Search(String Value) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		MacBookPro.enterValueToSearchBar(Value);
		logger.info("User Enter the Macbook Pro on the search bar");
		WebDriverUtility.screenShot();
		
		
		
		
	}

	@Then("^User click the search button$")
	public void user_click_the_search_button() throws Throwable {
		MacBookPro.ClickonSearchButton();
		logger.info("User click on the Search Button");
		WebDriverUtility.screenShot();
		
		
		
	    
	}

	@Then("^User should see the Macbook pro image$")
	public void user_should_see_the_Macbook_pro_image() throws Throwable {
		Assert.assertTrue(MacBookPro.imageIsDisplyed());
		logger.info("Image is displyed");
		WebDriverUtility.screenShot();
	    
	}

	
	
	
	
	
	

}
