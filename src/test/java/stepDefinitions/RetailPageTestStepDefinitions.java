package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.RetailPageObj;
import utilities.WebDriverUtility;

public class RetailPageTestStepDefinitions extends Base  {
	
	
	// In this class we will write actual Java/selenium codes associated to each Scenario 
	//steps.
	
	RetailPageObj retailPage = new RetailPageObj();
	

@When("^User seach for 'iphone'$")
public void user_seach_for_iphone(String value) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    retailPage.enterValueToSearchBar(value);
   logger.info("User entered value in serach bar");
   WebDriverUtility.screenShot();
}

@When("^User click on search button$")
public void user_click_on_search_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  retailPage.clickOnSearchButton();
  logger.info("User clicked on serach button");
}

@Then("^User should see Iphone image$")
public void user_should_see_Iphon_image() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
  Assert.assertTrue(retailPage.iPhoneImageIsDisplayed());
  WebDriverUtility.screenShot();
  logger.info("iPhone image is displayed");
}
	
	
	// This is my first check line update from Git Hup to Eclipse 
	
@When("^User click on MyAccount$")
public void user_click_on_MyAccount() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    
}

@When("^User click on Register option$")
public void user_click_on_Register_option() throws Throwable {
    retailPage.clickOnRegister();
    logger.info("User clicked on Register option");
   
}

@And("^User fill the Registration form with Below information$")
public void user_fill_the_Registration_form_with_Below_information(DataTable personalInfo) throws Throwable {
	List<Map<String, String>>  dataValues = personalInfo.asMaps(String.class, String.class);
	retailPage.enterFirstName(dataValues.get(0).get("firstName"));
	retailPage.enterLastName(dataValues.get(0).get("lastName"));
	retailPage.enterEmail(dataValues.get(0).get("email"));
	retailPage.enterTelephoneNumer(dataValues.get(0).get("telephone"));
	retailPage.enterPassword(dataValues.get(0).get("password"));
	retailPage.enterConfirmPassword(dataValues.get(0).get("conformationPassword"));
	retailPage.subscribe(dataValues.get(0).get("subscribe"));
	logger.info("User filled the information form");
	WebDriverUtility.screenShot();
	
	
	
	
    // Write code here that turns the phrase above into concrete actionsp
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    
}

@When("^User accept the privacy and policy$")
public void user_accept_the_privacy_and_policy() throws Throwable {
   retailPage.checkPrivacyPolicy();
   logger.info("User check privacy and policy");
   WebDriverUtility.screenShot();
}

@When("^User click on Continue button$")
public void user_click_on_Continue_button() throws Throwable {
	retailPage.clickOnContinueButton();
	logger.info("User Click on Continue button");
	
}
    
	

@Then("^User should be registered in Retail Website$")
public void user_should_be_registered_in_Retail_Website() throws Throwable {
   Assert.assertTrue(retailPage.registrationOutcome());
   WebDriverUtility.screenShot();
   logger.info("Account was created Successfully");
   
}


	
	
	
	
	
	
	
	
	
	
	
	

}
