/*package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	ChromeDriver driver;
	@Given("open the browser")
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@And("launch the Url")
	public void launchUrl() {
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@And("set the timeouts")
	public void setTimeOuts() {
		driver.manage().timeouts().
		implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("set the timeouts")
	public void setTimeOuts1() {
		driver.manage().timeouts().
		implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("maximize the browser")
	public void maxBrowser() {
		driver.manage().window().maximize();
	}
	
	@And("enter the username as (.*)")
	public void enterUserName(String userName) {
		driver.findElementById("username")
		.sendKeys(userName);
	}
	@And("enter the password as (.*)")
	public void enterPassWord(String passWord) {
		driver.findElementById("password")
		.sendKeys(passWord);
	}
	
	@When("click on the login button")
	public void clickLoginButton() {
		driver.findElementByClassName("decorativeSubmit").click();
	}
	
	@Then("login should be success")
	public void loginSuccess() {
		System.out.println("Login success");
	}
	@Then("login should be failed")
	public void loginFailed() {
		System.out.println("login failed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	







}












*/