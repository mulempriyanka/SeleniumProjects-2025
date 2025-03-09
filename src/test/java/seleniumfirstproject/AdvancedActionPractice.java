package seleniumfirstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdvancedActionPractice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		
		WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        //single and multiple key press and release 
        actions.keyDown(searchBox, Keys.SHIFT).keyDown("s").keyUp("s").keyDown("a").keyUp("a").build().perform();
        //double click
        actions.doubleClick(searchBox).build().perform();
        //right click
        actions.contextClick(searchBox).build().perform();
        //mouse hover
        WebElement ele = driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));
        //passing webelemnt to moveToElement method we are navigating to other webpage
        actions.moveToElement(ele).build().perform();
        //for further practical we are navigating to other webpage
        driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");
        //we are finding webelement from where to drag 
        WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        //we are finding webelement to where we want to drop
        WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
        //performing action using dragAndDrop method
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
        
	}

}
