 package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassFrameHandling {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		driver.switchTo().frame(frame);

		// driver.switchTo().frame("navbar-iframe");

		// driver.switchTo().frame(0);

		driver.findElement(By.xpath("//table//input[@name='q' and  not(@title)]")).sendKeys("Welcome to codemind");

		driver.switchTo().defaultContent();

		driver.findElement(By.cssSelector("#ta1")).sendKeys("Back from frame");

		driver.switchTo().frame(frame);

		driver.findElement(By.xpath("//table//input[@name='q' and  not(@title)]")).clear();

		driver.switchTo().defaultContent();
		
		Thread.sleep(2000);

		driver.findElement(By.cssSelector("#ta1")).clear();
	}

}
