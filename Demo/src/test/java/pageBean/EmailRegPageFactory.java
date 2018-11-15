package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailRegPageFactory {
	WebDriver driver;
	
	
	@FindBy(name="txtUName")
	@CacheLookup
	WebElement eusername;
	
	@FindBy(name="txtPwd")
	@CacheLookup
	WebElement epwd;
	
	@FindBy(id="txtConfPassword")
	@CacheLookup
	WebElement ecpwd;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement efirstname;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement elastname;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement egender;
	
	@FindBy(name="DtOB")
	@CacheLookup
	WebElement edob;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement eemail;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement ecity;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement ephone;
	
	@FindBy(name="chkHobbies")
	@CacheLookup
	WebElement ehobbies;
	
	@FindBy(name="submit")
	@CacheLookup
	WebElement ebooking;
	
	public EmailRegPageFactory(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		
	}

	
	
	public WebElement getEusername() {
		return eusername;
	}

	public void setEusername(String username) {
		eusername.sendKeys(username);
	}

	public WebElement getEpwd() {
		return epwd;
	}

	public void setEpwd(String pwd) {
		epwd.sendKeys(pwd);
	}

	public WebElement getEcpwd() {
		return ecpwd;
	}

	public void setEcpwd(String cpwd) {
		ecpwd.sendKeys(cpwd);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getEfirstname() {
		return efirstname;
	}

	public void setEfirstname(String firstname) {
		efirstname.sendKeys(firstname);
	}

	public WebElement getElastname() {
		return elastname;
	}

	public void setElastname(String lastname) {
		elastname.sendKeys(lastname);
	}

	public WebElement getEgender() {
		return egender;
	}

	public void setEgender(String gender) {
		egender.sendKeys(gender);
	}

	public WebElement getEdob() {
		return edob;
	}

	public void setEdob(String dob) {
		edob.sendKeys(dob);
	}

	public WebElement getEemail() {
		return eemail;
	}

	public void setEemail(String email) {
		eemail.sendKeys(email);
	}

	public WebElement getEcity() {
		return ecity;
	}

	public void setEcity(String city) {
		ecity.sendKeys(city);
	}

	public WebElement getEphone() {
		return ephone;
	}

	public void setEphone(String phone) {
		ephone.sendKeys(phone);
	}

	public WebElement getEhobbies() {
		return ehobbies;
	}

	public void setEhobbies(String hobbies) {
		ehobbies.sendKeys(hobbies);
	}

	public WebElement getEbooking() {
		return ebooking;
	}

	public void setEbooking() {
		ebooking.click();
	}
}
