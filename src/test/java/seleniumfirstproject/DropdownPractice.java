package seleniumfirstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropdownPractice {

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();

		driver.get("https://www.makemytrip.com/flights/vistara-airlines.html");

		driver.manage().window().maximize();

		selectValueFromDropdown("Giftcards");

	}
	public static void selectValueFromDropdown(String menuType) {

		WebElement we = driver.findElement(By.xpath("//span[@class ='arrowMore arrowDownMore']"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(we).build().perform();

		List<WebElement> menuoptions = driver.findElements(By.xpath("//a[@class='append_bottom5 blackText']"));
		
				for (WebElement element : menuoptions) {

			    if (element.getText().equalsIgnoreCase(menuType)) {

				element.click();
				
				break;
				}

			}

		}
		
	}


