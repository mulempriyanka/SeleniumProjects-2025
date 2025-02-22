package codemind.b14.firstproject;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println("Current url is " + currentUrl);   //Will give current url
		
		String pageSource = driver.getPageSource();         //Will return complete page source(html code)
		
		System.out.println("Page source =\n "+pageSource);  
		
		String title = driver.getTitle(); 
		
		System.out.println("Current page title is "+ title);
		
		String windowHandle = driver.getWindowHandle();
		
		System.out.println("Current focused window/tab handle "+windowHandle);
		
		driver.switchTo().newWindow(WindowType.TAB).get("https://demo.guru99.com/test/newtours/index.php");
		
		Set<String> windowHandles = driver.getWindowHandles();   //Set dont alow duplicates
		//will return all window handles
		for(String handle : windowHandles) {
			
			System.out.println(handle);
		}
		driver.navigate().to("https://www.flipkart.com/");
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().refresh();
		
		driver.close();   // will close window with current focuss
		
		driver.quit();    // will close every associated window	

}
}
