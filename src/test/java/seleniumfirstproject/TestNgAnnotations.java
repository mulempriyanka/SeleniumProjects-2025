package seleniumfirstproject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNgAnnotations {
    @BeforeSuite 
	public void beforeSuit() 
	{
		System.out.println("Before suit");	
    }
    @BeforeTest
    public void beforeTestPlan() {
    	System.out.println("Before Test Plan");
    }
    @BeforeClass
    public void beforeClass() {
    	System.out.println("Before Class");
    }
    @Test
    public void testCase() {
    	System.out.println("Test case");
    }
    @BeforeTest
    public void beforeTestCase() {
    	
    	System.out.println("Before Testcase");
    }
    @AfterTest
    public void afterTestCase() {
    	
    	System.out.println("After Testcase");
    }
    @AfterClass
    public void afterClass() {
    	System.out.println("After Class");
    }
    
	@AfterSuite
	public void afterSuit() {
		System.out.println("After suit");
	}
}