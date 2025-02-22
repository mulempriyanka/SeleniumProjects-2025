package codemind.b14.firstproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProject {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		driver.quit();
	}

}
