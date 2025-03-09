package seleniumfirstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorExp {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		List<WebElement> buttons = driver.findElements(By.cssSelector("input[value]"));
		
		System.out.println(buttons.size());
		
		WebElement element = driver.findElement(By.cssSelector("input[value='Login']"));
		
		//element.click();
		
		WebElement button1 = driver.findElement(By.cssSelector("input[value='Login'][type='button']"));
		
		//Css different symbols
		
		WebElement element1 = driver.findElement(By.cssSelector("h2.title"));
		
		System.out.println(element1);
		
		WebElement element2 = driver.findElement(By.cssSelector("input#radio1"));
		
		element2.click();
		
		WebElement element3 = driver.findElement(By.cssSelector("[id$='dio1']"));
		
		WebElement element4 = driver.findElement(By.cssSelector("[id*='adi']"));
		
		WebElement element5 = driver.findElement(By.cssSelector("[id^='radio']"));
		
		driver.close();
		
		
	
	}

}
