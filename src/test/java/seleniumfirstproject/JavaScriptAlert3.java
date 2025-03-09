package seleniumfirstproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptAlert3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alert.accept();
		
		alert.dismiss();
		
		System.out.println(alert.getText());
	
	}

}
