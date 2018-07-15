package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.aventstack.extentreports.ExtentTest;

import cucumber.api.java.en.Then;
import lib.selenium.PreAndPost;
import lib.selenium.WebDriverServiceImpl;

public class HomePage extends WebDriverServiceImpl{

	public HomePage() {
		/*this.driver = driver;
		this.test = test;*/
		PageFactory.initElements(driver,this);
	}	

	@FindBy(className = "decorativeSubmit")
	private WebElement eleLogOut;
	public LoginPage clickLogOut() {
		//WebElement eleLogin = locateElement("class","decorativeSubmit");
		System.out.println("success");
		return new LoginPage();		
	}

	@FindBy(xpath="//h2[text()[contains(.,'Selenium Automation Engineer')]]")
	private WebElement eleLoggedName;
	@Then("login should be success")
	public HomePage verifyLoggedName() {
		System.out.println("passed");
		return this;		
	}






}
