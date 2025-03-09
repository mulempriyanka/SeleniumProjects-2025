package seleniumfirstproject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SynchroSeleniumPractice {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();

		WebElement text = driver.findElement(By.cssSelector("#delayedText"));

		WebElement nonvisibleText = driver.findElement(By.cssSelector("#deletesuccess"));

		// Thread.sleep(10000);

//		WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(15));
//		
//  	webDriverWait.until(ExpectedConditions.visibilityOf(text));
//		
//		System.out.println(text.isDisplayed());

		FluentWait<WebDriver> fluentWait = new FluentWait<WebDriver>(driver);

		fluentWait.withTimeout(Duration.ofSeconds(30)).ignoring(TimeoutException.class)
		.pollingEvery(Duration.ofMillis(10));
		
		fluentWait.until(ExpectedConditions.visibilityOf(text));
		
       // WebElement text1 = driver.findElement(By.cssSelector("#delayedText"));
		
		//System.out.println("Text1 is visible "+ text1.isDisplayed());
		
		System.out.println(text.isDisplayed());
		
		fluentWait.until(ExpectedConditions.invisibilityOf(nonvisibleText));
		
		System.out.println(nonvisibleText.isDisplayed());
		
		driver.findElement(By.xpath("//button[text()='Check this']")).click();
		
		WebElement mrCheckBox =driver.findElement(By.xpath("//input[@id='dte']"));
		
		System.out.println(mrCheckBox.isEnabled());
		
		System.out.println("MR checkbox disbaled attr = " + mrCheckBox.getAttribute("disabled"));

		fluentWait.until(ExpectedConditions.attributeToBe(mrCheckBox, "disabled", ""));
		
		System.out.println(mrCheckBox.isEnabled());
		
		System.out.println("Attribute value is " + mrCheckBox.getAttribute("disabled"));
        
		
	}

	}


