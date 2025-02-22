package codemind.b14.firstproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		WebElement textfield = driver.findElement(By.xpath("//textarea[@cols='80']"));
		
		textfield.sendKeys("Welcome to codemind");
		
		Thread.sleep(2000);
		
		textfield.clear();
		
		String attributeValue = textfield.getAttribute("id");
		
		System.out.println(attributeValue);
		
		String accName = textfield.getAccessibleName();
		
		String ariarole = textfield.getAriaRole();
		
		System.out.println("accName = " + accName + " " + "aria role = " + ariarole);
		
		Point p = textfield.getLocation();
		
		System.out.println("x = " + p.getX() + " " + "y = " + p.getY());
		
		Rectangle r = textfield.getRect();
		
		System.out.println("height = " + r.getHeight() + " " + r.getWidth());
		
		String tagName = textfield.getTagName();
		
		System.out.println("tagname is " + tagName);
		
		System.out.println("textfield is displayed = " + "textfield is displayed = " + textfield.isDisplayed());
	}

}
