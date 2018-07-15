package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lib.listeners.WebDriverListener;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class LoginPage extends WebDriverServiceImpl{
	
	public LoginPage() {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver,this);
	}	
	
	@FindBy(id="username")
	private WebElement eleUserName;
	
	@And("enter the username as (.*)")
	public LoginPage enterUserName(String data) {
		//WebElement eleUserName = locateElement("usernama");
		type(eleUserName, data);
		return this;
	}
	
	
	@FindBy(id="password")
	private WebElement elePassword;
	@And("enter the password as (.*)")
	public LoginPage enterPassword(String data) {
		//WebElement elePassword = locateElement("password");
		type(elePassword, data);
		return this;
	}
	
	
	@FindBy(className="decorativeSubmit")
	private WebElement eleLogin;
	@When("click on the login button")
	public HomePage clickLogIn() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		/*HomePage hp = new HomePage();
		return hp;*/
		return new HomePage();
		
	}
	@Then("click login for failure")
	public LoginPage clickLogInForFailer() {
		click(eleLogin);
		return this;		
	}
	@But("login should be failed")
	public void logFail() {
		System.out.println("login failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
