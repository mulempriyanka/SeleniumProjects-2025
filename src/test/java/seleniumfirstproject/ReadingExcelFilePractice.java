package seleniumfirstproject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.Duration;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReadingExcelFilePractice {
    private static final int STRING = 0;
	private static final int NUMERIC = 0;

	public static void main(String[] args) throws InvalidFormatException, IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to website
        driver.get(ReadingPropertiesFile.getProperty("url"));

        // Wait until page loads completely
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Read data from Excel
        List<Object> list = readExcel();

        // Wait for the firstName field to be visible
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName")));

        // Filling the form fields
        driver.findElement(By.name("firstName")).sendKeys(list.get(0).toString());
        driver.findElement(By.name("lastName")).sendKeys(list.get(1).toString());
        driver.findElement(By.name("phone")).sendKeys(list.get(2).toString());
        driver.findElement(By.name("userName")).sendKeys(list.get(3).toString());
        driver.findElement(By.name("address1")).sendKeys(list.get(4).toString());
        driver.findElement(By.name("city")).sendKeys(list.get(5).toString());
        driver.findElement(By.name("state")).sendKeys(list.get(6).toString());
        driver.findElement(By.name("postalCode")).sendKeys(list.get(7).toString());

        // Handling the country dropdown
        Select countryDropdown = new Select(driver.findElement(By.name("country")));
        countryDropdown.selectByVisibleText(list.get(8).toString());

        driver.findElement(By.name("email")).sendKeys(list.get(9).toString());
        driver.findElement(By.name("password")).sendKeys(list.get(10).toString());
        driver.findElement(By.name("confirmPassword")).sendKeys(list.get(11).toString());

        // Close the browser
        // driver.quit();
    }

    public static List<Object> readExcel() throws InvalidFormatException, IOException {
        List<Object> dataList = new ArrayList<>();
        File file = new File(System.getProperty("user.dir") + "/src/test/resources/Registration_File.xlsx");

        try (XSSFWorkbook workbook = new XSSFWorkbook(file)) {
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            int lastRowNum = sheet.getLastRowNum();

            for (int i = 0; i <= lastRowNum; i++) {
                XSSFRow row = sheet.getRow(i);
                if (row == null) continue; // Skip null rows

                int lastCellNum = row.getLastCellNum();
                for (int j = 0; j < lastCellNum; j++) {
                    XSSFCell cell = row.getCell(j);
                    if (cell == null) {
                        dataList.add(""); // Handle empty cells
                        
                    }
                    
                }
            }
        }
        return dataList;
    }
}