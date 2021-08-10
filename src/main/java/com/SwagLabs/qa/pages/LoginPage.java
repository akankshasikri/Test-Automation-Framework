package com.SwagLabs.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.SwagLabs.qa.base.TestBase;

public class LoginPage extends TestBase{
	
	//PageFactory:
	
	By username = By.name("user-name");
	
	By password = By.name("password");
	
	By login = By.xpath("//input[@type='submit']");
	
	By logo = By.className("login_logo");
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public boolean validateLogo() {
		return driver.findElement(logo).isDisplayed();
	}
	
	public HomePage login(String un, String pwd) {
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(pwd);
		driver.findElement(login).click();
		
		return new HomePage();
	}
}

