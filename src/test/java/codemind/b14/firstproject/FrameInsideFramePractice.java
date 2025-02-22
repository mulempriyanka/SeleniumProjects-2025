package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameInsideFramePractice {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/droppable.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("(//button[@class='accordion-button collapsed'])[3]")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"collapseThree\"]/div/ul/li[3]/a")).click();
        
        WebElement Frame = driver.findElement(By.xpath("(//iframe[@src='new-tab-sample.php'])[1]"));
        driver.switchTo().frame(Frame);
        driver.findElement(By.xpath("//a[@href='https://www.tutorialspoint.com']")).click();
        driver.findElement(By.xpath("/html/body/div/header/div[1]/a/svg")).click();
	}

}
