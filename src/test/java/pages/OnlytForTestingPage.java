package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlytForTestingPage {
	// Web element
	WebDriver driver;
	WebElement firstNameTextField;
	WebElement lastName;

	// PageConstructor
	public WebElement getFirstNameTextField() {
		this.setFirstNameTextField();
		return firstNameTextField;
	}

//getter setter
	public void setFirstNameTextField() {
		
		this.firstNameTextField = driver.findElement(By.cssSelector("#text1"));
	}

	public OnlytForTestingPage(WebDriver driver) {
		this.driver = driver;

	}
//page methods

	public boolean verifyFirstNameTextFieldEnabled() {
		this.setLastName();
		return getFirstNameTextField().isEnabled();
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName() {
		this.lastName = driver.findElement(By.cssSelector("#text2"));
	}

	public boolean verifyLastNameTextFieldEnabled() {
		return getLastName().isEnabled();

	}

}
