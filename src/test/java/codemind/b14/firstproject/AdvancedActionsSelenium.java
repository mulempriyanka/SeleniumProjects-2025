package codemind.b14.firstproject;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class AdvancedActionsSelenium { 

		public static void main(String[] args) {

			WebDriverManager.chromedriver().setup();

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.get("https://www.google.com/");

			Actions actions = new Actions(driver);

			WebElement serachBox = driver.findElement(By.xpath("//textarea[@name='q']"));

			// single and multiple key press and release
			actions.keyDown(serachBox, Keys.SHIFT).keyDown("m").keyUp(Keys.SHIFT).keyUp("m").keyDown("d").keyUp("d").build()
					.perform();
             
			// double click
			actions.doubleClick(serachBox).build().perform();

			// right click
			actions.contextClick(serachBox).build().perform();

			// mouse hover
			actions.moveToElement(driver.findElement(By.xpath("//a[@aria-label='Google apps']"))).build().perform();

			driver.navigate().to("https://www.tutorialspoint.com/selenium/practice/droppable.php");

			WebElement sourElement = driver.findElement(By.cssSelector("div#draggable"));

			WebElement targetElement = driver.findElement(By.cssSelector("div#droppable"));

			// drag and drop
			actions.dragAndDrop(sourElement, targetElement).build().perform();
			
			WebElement bloglink = driver.findElement(By.cssSelector("#blogsmenu"));
			
			actions.moveToElement(bloglink).build().perform();
			
			driver.findElement(By.xpath("(//div[@id='cssmenu']/ul/ul//a)[3])")).click();
		}


}