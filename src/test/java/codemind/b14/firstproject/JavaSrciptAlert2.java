package codemind.b14.firstproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSrciptAlert2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
        driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
        
        Alert alt = driver.switchTo().alert();
        
        Thread.sleep(2000);
        
        alt.accept();
        
        System.out.println(alt.getText());
        
	}

}
