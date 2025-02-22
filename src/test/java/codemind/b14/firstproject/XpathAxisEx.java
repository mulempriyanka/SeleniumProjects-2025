package codemind.b14.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxisEx {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='radio1']"));
		element.click();
		
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		System.out.println("Number of images are " + images.size());
		
		WebElement element1 = driver.findElement(By.xpath("//input[@id]"));
		element1.click();
		
		WebElement element3 = driver.findElement(By.xpath("//input[@value='Login']"));
		element3.click();
		
		WebElement element4 = driver.findElement(By.xpath("*[@type='button']"));
		element4.click();
		
		WebElement subbutton = driver.findElement(By.xpath("//button[@name='samename'][2]"));
		subbutton.click();
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@name='gender' and @value='female']"));
		radiobutton.click();
		
		//text() method
		WebElement text = driver.findElement(By.xpath("//h2[text()='Text Area Field Two']"));
		
		//starts-with method
		WebElement ele = driver.findElement(By.xpath("//input[starts-with(@type,'pass')]"));
		
		//contains method
		WebElement button= driver.findElement(By.xpath("//button[contains(@class,'ropd')]"));
		
		//use of normalize space
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='omayo (QAFox.com)']"));
		
		
		
		
		
		
		
		
		
        ;
	}

}

