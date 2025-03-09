package seleniumfirstproject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingPra {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("a#selenium143")).click();
		
		String currentWindowHandle = driver.getWindowHandle();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String handle : windowHandles ) {
			
			if(handle != currentWindowHandle ) {
				
				driver.switchTo().window(handle);
			}
		}
		
        driver.findElement(By.xpath("//a[text()='What is Selenium?']")).click();
		
		driver.close();
		
		driver.switchTo().window(currentWindowHandle);
		
		driver.quit();
		;
	}

}
