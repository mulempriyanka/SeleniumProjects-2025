package codemind.b14.firstproject;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenshotSelenium {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		TakesScreenshot takescreenshot =(TakesScreenshot) driver;    //Interface of selenium
		
		File scr = takescreenshot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scr, new File("src/test/resources/" + System.currentTimeMillis() + ".png"));
		
		
	}

}
