package seleniumfirstproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitInSelenium {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/disappearing_elements");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Gallery']"));
		
		System.out.println("Element is visible "+ element.isDisplayed());
	}

}
