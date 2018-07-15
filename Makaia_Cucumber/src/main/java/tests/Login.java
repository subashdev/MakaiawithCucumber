package tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lib.selenium.PreAndPost;
import pages.LoginPage;

public class Login extends PreAndPost{

	@BeforeTest
	public void setData() {
		testCaseName="TC001_CreateLead";
		testDescription="Create a new Lead on LeafTaps";
		testNodes = "Leads";
		browserName="chrome";
		//dataSheetName="TC001";
		category="Smoke";
		authors="Gopi";
	}

	@Test()
	public void createLead(){

		new LoginPage()
		.enterUserName("DemoSalesManager")
		.enterPassword("crmsfa")
		.clickLogIn();
	}
}
