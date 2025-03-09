package seleniumfirstproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://omayo.blogspot.com/");

		driver.manage().window().maximize();

		WebElement multidropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));

		Select select = new Select(multidropdown);

		select.selectByIndex(3);
		
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Hyundai");
		
		Thread.sleep(2000);
		
		select.selectByContainsVisibleText("Swift");
		
		Thread.sleep(2000);

		select.deselectByValue("audix");

		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();

		for (WebElement options : allSelectedOptions) {

			System.out.println("All selected options are " + options.getText());
		}
		WebElement firstSelectedOption = select.getFirstSelectedOption();

		System.out.println("First selected option is " + firstSelectedOption.getText());

		List<WebElement> alloptions = select.getOptions();

		for (WebElement option : alloptions) {

			System.out.println("Dropdown options " + option.getText());
		}
		boolean multiSelectionAllowed = select.isMultiple();

		System.out.println("Multiselection allowed " + multiSelectionAllowed);

		select.deselectByIndex(2);
		
		Thread.sleep(2000);
		
		select.deselectByValue("volvox");
		
		Thread.sleep(2000);
		
		select.deselectByVisibleText("Hyundai");
		
		Thread.sleep(2000);
		
		select.deSelectByContainsVisibleText("Volv");
		
		Thread.sleep(2000);
		
		select.deselectAll();
		
	}

}
