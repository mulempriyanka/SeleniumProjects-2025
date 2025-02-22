package codemind.b14.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorStrategies {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriverManager.chromedriver().setup();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		//By.name
		WebElement userNameTextField = driver.findElement(By.name("password"));
		
		userNameTextField.sendKeys("Hello");
		
		//By.tagName
		List<WebElement> images = driver.findElements(By.tagName("img"));
        
		System.out.println("Number of images = "+ images.size());
		
		//By.linkText
		WebElement signon = driver.findElement(By.linkText("SIGN-ON"));
		
		signon.click();
		
		// By.partialLinkText
		WebElement hotelsLink = driver.findElement(By.partialLinkText("tels"));
		
		hotelsLink.click();

		driver.navigate().to("https://omayo.blogspot.com/");

		// By.id
		WebElement textAreaField = driver.findElement(By.id("ta1"));

		textAreaField.sendKeys("Codemind");

		// By.className
		
		WebElement title = driver.findElement(By.className("title"));

		System.out.println(title.getText());

	}
}
