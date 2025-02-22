package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		
		driver.switchTo().frame(frame);
		
		//driver.switchTo().frame(0);
		
		//driver.switchTo().frame("iframe1");
		
		driver.findElement(By.xpath("//a[@href='https://t.me/qafoxoriginal']//img")).click();
		
		driver.switchTo().defaultContent();
		
		//driver.findElement(By.xpath("//textarea[@id='ta1']")).sendKeys("Hello selenium");
		
		driver.findElement(By.cssSelector("#ta1")).sendKeys("Hello selenium");
		
	}

}
