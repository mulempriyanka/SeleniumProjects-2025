package seleniumfirstproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadingExcelFile {
	public static void main(String[] args) throws InvalidFormatException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(ReadingPropertiesFile.getProperty("rurl"));


		List<Object> list = ReadingExcelFile.readExcel();

		//driver.findElement(By.xpath("//input[@name='userName']")).sen
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(list.get(0).toString());
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(list.get(1).toString());
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(list.get(2).toString());
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(list.get(3).toString());
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(list.get(4).toString());
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(list.get(5).toString());
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(list.get(6).toString());
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(list.get(7).toString());
		Select countryDropdown = new Select(driver.findElement(By.xpath("//select[@name='country']")));
		countryDropdown.selectByVisibleText(list.get(8).toString());
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(list.get(9).toString());
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(list.get(10).toString());
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(list.get(11).toString());
	}

	public static List<Object> readExcel() throws InvalidFormatException, IOException {
		
		List<Object> list1 = new ArrayList<Object>();

		File file = new File("src/test/resources/Registration_File.xlsx");

		XSSFWorkbook xssfworkbook = new XSSFWorkbook(file);

		XSSFSheet sheet = xssfworkbook.getSheet("Sheet1");

		int lastNum = sheet.getLastRowNum();

		for (int i = 1; i <= lastNum; i++) {

			XSSFRow row = sheet.getRow(i);

			int lastCellNum = row.getLastCellNum();

			for (int j = 0; j < lastCellNum; j++) {

				XSSFCell cell = row.getCell(j);

				if (cell.getCellType() == cell.CELL_TYPE_NUMERIC) {
					//System.out.println(cell.getNumericCellValue());

					list1.add(cell.getNumericCellValue());
				}
				if (cell.getCellType() == cell.CELL_TYPE_STRING) {
					//System.out.println(cell.getStringCellValue());

					list1.add(cell.getStringCellValue());
				}
			}
		}
		return list1;
	}

}
