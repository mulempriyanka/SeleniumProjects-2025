package testCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.OnlytForTestingPage;

public class VerifyOnlyForTestingPageDetails extends BaseTest{
	
	HomePage homePage;
	OnlytForTestingPage onlyforTestingPage;
	
	@Test
	public void VerifyOnlyForTestingPageDetails()
	{
		
	    homePage = new HomePage(driver);
		
		homePage.getOnlyTestingLink().click();
		
		onlyforTestingPage = new OnlytForTestingPage(driver);
		
		assertTrue(onlyforTestingPage.verifyFirstNameTextFieldEnabled(),"First Name text Field is enabled");
		
		assertFalse(onlyforTestingPage.verifyLastNameTextFieldEnabled(),"Last Name text Field is disabled");
	}
	
	}
	


