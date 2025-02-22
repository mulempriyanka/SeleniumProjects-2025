package codemind.b14.firstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSingleSelect {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement singleselectdropdown = driver.findElement(By.xpath("//select[@id='drop1']"));

		Select select = new Select(singleselectdropdown);

		List<WebElement> allselectdropdownoptions = select.getAllSelectedOptions();

		for (WebElement option : allselectdropdownoptions) {

			System.out.println(option.getText());
		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		
		System.out.println("First selected option "+firstSelectedOption.getText());
       
		List<WebElement> allOptions = select.getOptions();
		
		for(WebElement option : allOptions) {
			
			System.out.println("All Dropdown option "+ option.getText());
		}
	   boolean multiselectionAllowed = select.isMultiple();
	   
	   System.out.println("Multiselection allowed "+multiselectionAllowed );
	   
	   select.selectByIndex(2);
	   
	   Thread.sleep(2000);
	   
	   select.selectByContainsVisibleText("Newsletters");
	   
	   Thread.sleep(2000);
	   
	   select.selectByValue("def");
	   
	   Thread.sleep(2000);
	   
	   select.selectByVisibleText("doc 3");
	   
	  // select.deselectByIndex(0);       not allowed
		}
	}


