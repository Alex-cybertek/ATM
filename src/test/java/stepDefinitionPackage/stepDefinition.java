package stepDefinitionPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import runnerPackage.ATM_runner;

public class stepDefinition extends ATM_runner{

	@Given("^I navigate to ATM page$")
	public void i_navigate_to_ATM_page() {
       driver.get("url");
	}

	@Given("^I should be able to see 'Select your language' text on the page$")
	public void i_should_be_able_to_see_Select_your_language_text_on_the_page()  {
		WebElement text=driver.findElement(By.name("Language"));
		Assert.assertEquals(text.getText(), "Select your language");
	}

	@Then("^I should be able to click on 'English' button and see 'Please enter PIN' text$")
	public void i_should_be_able_to_click_on_English_button_and_see_Please_enter_PIN_text() {
        WebElement englButton=driver.findElement(By.id("123"));
        englButton.click();
        WebElement text2=driver.findElement(By.tagName("please enter"));
        String actual=text2.getText();
        Assert.assertTrue(actual.contains("Please enter PIN"));
	}

	@Then("^I should be able to click 'Cancel' button and see 'Select your language' text$")
	public void i_should_be_able_to_click_Cancel_button_and_see_Select_your_language_text() {
        WebElement cancel=driver.findElement(By.xpath("//input[@name='ghdfgh']"));
        cancel.click();
		WebElement lang=driver.findElement(By.xpath("//div[@id='fdfd']"))	;
		String langText=lang.getText();
		Assert.assertTrue(langText.contains("language"));
	}

	@Then("^I should be able to click 'Spanish\" button and see 'In Spanish'$")
	public void i_should_be_able_to_click_Spanish_button_and_see_In_Spanish() throws Exception {

	}

	@Then("^I should be able to enter invalid PIN, click 'Enter' and see 'PIN incorrect, enter valid PIN' text$")
	public void i_should_be_able_to_enter_invalid_PIN_click_Enter_and_see_PIN_incorrect_enter_valid_PIN_text()  {

		WebElement pinField=driver.findElement(By.xpath("//span[@id='dfhj']"));
		pinField.sendKeys("1234567"+ Keys.ENTER);
		
		
		
		
		
	}

	@Then("^I should be able to enter \"([^\"]*)\" three times and see 'Account is blocked' text$")
	public void i_should_be_able_to_enter_three_times_and_see_Account_is_blocked_text(String pin) throws Exception {

		WebElement pinField=driver.findElement(By.xpath("//div[@a='fgfgf']"));
		pinField.sendKeys(pin + Keys.ENTER);
		
		
	}

	@Then("^I should be able to enter valid PIN, click 'Enter' and see 'Select Transaction' text$")
	public void i_should_be_able_to_enter_valid_PIN_click_Enter_and_see_Select_Transaction_text() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to enter valid PIN, click \"([^\"]*)\" and see 'Select Transaction' text$")
	public void i_should_be_able_to_enter_valid_PIN_click_and_see_Select_Transaction_text(String arg1) throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to click 'Withdrawal' button and see 'Select account to withdraw'$")
	public void i_should_be_able_to_click_Withdrawal_button_and_see_Select_account_to_withdraw() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to click 'Checking' button and see 'Please Enter amount' text$")
	public void i_should_be_able_to_click_Checking_button_and_see_Please_Enter_amount_text() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should be able to input amount and click 'Enter'$")
	public void i_should_be_able_to_input_amount_and_click_Enter() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should see 'Please take your money' text$")
	public void i_should_see_Please_take_your_money_text() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
