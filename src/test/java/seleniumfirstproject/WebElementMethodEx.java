package seleniumfirstproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethodEx {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		driver.manage().window().maximize();
		
		WebElement submitButton = driver.findElement(By.cssSelector("input[name=submit]"));
		
		System.out.println("Colour of submitbutton is "+ submitButton.getCssValue("background-color"));
		
		System.out.println("Submit button is enabled = "+ driver.findElement(By.cssSelector("input[name=submit]")).isEnabled());
		
        driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();  
		
		WebElement disappearText = driver.findElement(By.cssSelector("#deletesuccess"));
		
		System.out.println("disappearText is displayed "+ disappearText.isDisplayed());
		
		Thread.sleep(20000);
		
		System.out.println("disappearText is displayed "+ disappearText.isDisplayed());
		
		System.out.println("Male radio button is selected "+ driver.findElement(By.xpath("//input[@value='male']")).isSelected());
		
		driver.findElement(By.xpath("//input[@id='radio2']")).click();
		
		System.out.println("Female radio button is selected = " + driver.findElement(By.xpath("//input[@id='radio2']")).isSelected());
		
		System.out.println("Orange check box is selected = " +driver.findElement(By.xpath("//input[@id='dte']")).isSelected());
		
		System.out.println("Blue checkbox is selected ="+driver.findElement(By.xpath("//input[@value='blue']")).isSelected());
		
		WebElement textfield = driver.findElement(By.xpath("//textarea[@cols='80']"));
		
		File file = textfield.getScreenshotAs(OutputType.FILE);
		
	    FileUtils.copyFile(file,new File("src/test/resources/search.png"));
	    
	   // System.out.println("Webelement text = "+ );
		
	}
}
