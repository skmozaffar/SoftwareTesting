package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.generics.BaseClass;

public class HomePage extends BaseClass{
	@FindBy(id="logoutLink")
	private WebElement lgout;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogout() {
		lgout.click();
	}
}
