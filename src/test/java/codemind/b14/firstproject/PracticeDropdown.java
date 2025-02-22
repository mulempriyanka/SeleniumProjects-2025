package codemind.b14.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PracticeDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");

		driver.manage().window().maximize();

		WebElement we = driver.findElement(By.xpath("//span[@class ='arrowMore arrowDownMore']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(we).build().perform();

		List<WebElement> menuoptions = driver.findElements(By.xpath("//a[@class='append_bottom5 blackText']"));
		
		List<WebElement> submenuoptions = driver.findElements(By.xpath("//p[@class='font18 lato-bold append-bottom20']"));

		for (WebElement element : menuoptions) {

			if (element.getText().equalsIgnoreCase("Giftcards")) {
				
				element.click();
			
					}
				}
				
				}

			}


