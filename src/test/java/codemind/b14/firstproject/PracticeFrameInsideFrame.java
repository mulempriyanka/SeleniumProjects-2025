package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeFrameInsideFrame {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//button[@class='accordion-button collapsed'])[3]")).click();
		
		driver.findElement(By.xpath("//a[@href='nestedframes.php']")).click();
		
	}

}
