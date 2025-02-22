package codemind.b14.firstproject;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SynchronizationExpl {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement text = driver.findElement(By.cssSelector("#delayedText"));
		
		//Thread.sleep(10000);    //we will not use it anywhere as it will stop execution
		//WebDriverWait webdriverwait = new WebDriverWait(driver,Duration.ofSeconds(15));    //have polling period of 500ms
		//webdriverwait.until(ExpectedConditions.visibilityOf(text));
		//System.out.println(text.isDisplayed());
		//text will disapper after some time
		WebElement nonVisibleText = driver.findElement(By.cssSelector("#deletesuccess"));
		
		FluentWait<WebDriver> fluentwait = new FluentWait<WebDriver>(driver);   //with this we can customize polling period
		
		fluentwait.withTimeout(Duration.ofSeconds(30)).ignoring(TimeoutException.class)
		.pollingEvery(Duration.ofMillis(10));
		
		fluentwait.until(ExpectedConditions.visibilityOf(text));
		
		System.out.println(text.isDisplayed());
		
		fluentwait.until(ExpectedConditions.invisibilityOf(nonVisibleText));
		
		System.out.println(nonVisibleText.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
		
		WebElement mrCheckBox =driver.findElement(By.xpath("//input[@id='dte']"));
		
		System.out.println(mrCheckBox.isEnabled());
		
		System.out.println("MR checkbox disbaled attr = " + mrCheckBox.getAttribute("disabled"));

		fluentwait.until(ExpectedConditions.attributeToBe(mrCheckBox, "disabled", ""));
		
		System.out.println(mrCheckBox.isEnabled());
		
		System.out.println("Disabled Attribute value is " + mrCheckBox.getAttribute("disabled"));
		

	}

}
