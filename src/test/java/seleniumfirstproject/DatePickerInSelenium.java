package seleniumfirstproject;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerInSelenium {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/date-picker.php");
		
		selectData("2024","July","21");
		
		selectData("2025", "June", "1");
			
	}
	
	public static void selectData(String year, String month, String dateToBeSelected) throws InterruptedException {
    
	driver.findElement(By.xpath("//input[@id='datetimepicker1'][1]")).click();
	
	driver.findElement(By.xpath("(//input[@aria-label='Year'])[1]")).clear();

	driver.findElement(By.xpath("(//input[@aria-label='Year'])[1]")).sendKeys(year);

    Select select = new Select(driver.findElement(By.xpath("(//select[@aria-label='Month'])[1]")));
    
    select.selectByVisibleText(month);
    
    List<WebElement> dates = driver.findElements(By.xpath(
			"(//div[@class='dayContainer'])[1]//span[not(@class='flatpickr-day prevMonthDay') and not(@class='flatpickr-day nextMonthDay')]"));
    
    for(WebElement date : dates) {
    	
    	if (date.getText().equals(dateToBeSelected)) {
			date.click();
			break;
    	}
    }
    
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//h1[text()='Date Picker']")).click();

	}}
