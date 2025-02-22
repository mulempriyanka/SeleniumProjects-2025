package codemind.b14.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownWithoutSelect {

		static WebDriver driver;
	
		public static void main(String[] args) throws InterruptedException {
			
		    driver = new ChromeDriver();
			
			driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");
		
            driver.manage().window().maximize();
            
            selectValueFromDropdown("Return Trip");
            
            Thread.sleep(2000);
            
            selectValueFromDropdown("One Way");
	}
		
	   public static void selectValueFromDropdown(String tripType) {
		   
		   driver.findElement(By.xpath("//input[@id='tripType']")).click();

           List<WebElement> tripOptions = driver.findElements(By.xpath("//div[@class='tripTypeFilter']/ul/li/p"));
           
   		for (WebElement elm : tripOptions) {
   			
  			if (elm.getText().equalsIgnoreCase(tripType)) {
  				
 				elm.click();
 				
  				break;
	   }

   		}
	   }
}
