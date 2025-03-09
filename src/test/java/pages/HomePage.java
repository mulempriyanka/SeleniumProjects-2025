package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	List<WebElement> tableDCellElements;
	WebElement onlyTestingLink;
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public List<WebElement> getTableCellElements() {
		return tableDCellElements;
	}
	public void setTableData() {
		this.tableDCellElements = driver.findElements(By.xpath("//table[@id='table1']/tr/td"));
		
	}
	
	public WebElement getOnlyTestingLink() {
		this.setOnlyTestingLink();
		return onlyTestingLink;
	}

	public void setOnlyTestingLink() {
		this.onlyTestingLink = driver.findElement(By.xpath("//a[text()='onlytestingblog']"));
	}
    //methods
	public List<String> getTableData()
	{
		List<String> data = new ArrayList<String>();
		
		List<WebElement> tableData  = getTableCellElements();
		
		for(WebElement td : tableData)
		{
		    data.add(td.getText());
		}
		return data;
	}
	
}
