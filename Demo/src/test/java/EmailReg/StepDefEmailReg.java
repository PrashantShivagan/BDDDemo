package EmailReg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageBean.EmailRegPageFactory;

public class StepDefEmailReg {

	private WebDriver driver;
	private EmailRegPageFactory email;
	
	

@Given("^user is on Email Reg page$")
public void user_is_on_Email_Reg_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	email = new EmailRegPageFactory(driver);
	driver.get("file:///D:/Reading%20material%20java/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html");

}

@Then("^check the heading of the page$")
public void check_the_heading_of_the_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String str = driver.findElement(By.xpath("html/body/h1")).getText();
	if(str.contentEquals("Email Registration")) {
		System.out.println("Heading Matched");
	}else
	{
		System.out.println("Heading not Matched");
	}
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.close();
}

@When("^user does not enter firstname , lastname$")
public void user_does_not_enter_firstname_lastname() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^prompt user to fill in details$")
public void prompt_user_to_fill_in_details() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user does not enter dateofbirth in correct format$")
public void user_does_not_enter_dateofbirth_in_correct_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^prompt user to write input correctly$")
public void prompt_user_to_write_input_correctly() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user does not enter email in correct format$")
public void user_does_not_enter_email_in_correct_format() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Given("^user is on Email reg page$")
public void user_is_on_Email_reg_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user does not select city$")
public void user_does_not_select_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^prompt user to select city$")
public void prompt_user_to_select_city() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user does not enter mobile number$")
public void user_does_not_enter_mobile_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^prompt user to enter mobile number$")
public void prompt_user_to_enter_mobile_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user enters  incorrect mobile no format and clicks the button$")
public void user_enters_incorrect_mobile_no_format_and_clicks_the_button(DataTable arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
    // E,K,V must be a scalar (String, Integer, Date, enum etc)
    //throw new PendingException();
}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@When("^user clicks on confirm booking button$")
public void user_clicks_on_confirm_booking_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}

@Then("^navigate to booking successful$")
public void navigate_to_booking_successful() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
}


@When("^user enters  username,  password$")
public void user_enters_username_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	email.setEusername("Prashant");Thread.sleep(1000);
	email.setEpwd("prash123");Thread.sleep(1000);
	
}

@When("^enter same password in conform password$")
public void enter_same_password_in_conform_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	email.setEcpwd("prash123");Thread.sleep(1000);
	email.setEbooking();
	
}

@Then("^navigate to Success$")
public void navigate_to_Success() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	driver.navigate().to("file:///D:/hotelBooking/success.html");
	driver.close();
}

@When("^user enters incorrect username or password or confirm password$")
public void user_enters_incorrect_username_or_password_or_confirm_password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	email.setEusername("Prashant");Thread.sleep(1000);
	email.setEpwd("prash123");Thread.sleep(1000);
	email.setEcpwd("prash");Thread.sleep(1000);
	email.setEbooking();
}

@Then("^display login failed message$")
public void display_login_failed_message() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //throw new PendingException();
	String alertMessage = driver.switchTo().alert().getText();
	
	driver.switchTo().alert().accept();
	System.out.println("" + alertMessage);
	driver.close();
	
}



}
