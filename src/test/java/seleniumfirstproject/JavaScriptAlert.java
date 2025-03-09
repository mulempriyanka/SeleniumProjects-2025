package seleniumfirstproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='prompt']")).click();

		Alert alt = driver.switchTo().alert();

		System.out.println(alt.getText());

		alt.sendKeys("Codemind");

		alt.accept();

		//alt.dismiss();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Welcome to codemind");
		
	}

}
