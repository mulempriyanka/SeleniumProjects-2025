package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//img[@id='Header1_headerimg']"));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='navbar-iframe']"));
		
		driver.switchTo().frame(frame);
		
        //driver.switchTo().frame(0);
        
        //driver.switchTo().frame("navbar-iframe");
        
		driver.findElement(By.xpath("//input[@class='ENqPLc']")).sendKeys("Hello");
		
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();    //if we dont swich to default page then so such element exception will come
		
		driver.findElement(By.cssSelector("#ta1")).sendKeys("back from home");
		
		driver.switchTo().frame(frame);       //Again switching to frame
		
		driver.findElement(By.xpath("//table//input[@name='q' and  not(@title)]"));
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.cssSelector("#ta1")).clear();
		
	    
	}

}
