package testCases;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

import pages.HomePage;

public class VerifyTableData extends BaseTest {
	HomePage hopeHomePage;
	@Test(groups ={"sanity"})
	public void verifyTableData()
	{
		hopeHomePage = new HomePage(driver);
		List<String> expectedTabledata =  Arrays.asList("Kishore", "22", "Delhi", "Manish", "25", "Pune", "Praveen", "29", "Bangalore", "Dheepthi", "31", "Mumbai");
	    List<String> data = hopeHomePage.getTableData();
	    verify.assertEquals(data, hopeHomePage, "Table data not matched");
		
	}
}
