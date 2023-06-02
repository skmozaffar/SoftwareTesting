package com.actitime.generics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static {
		WebDriverManager.chromedriver().setup();
	}
	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() {
		Reporter.log("openBrowser", true);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		Reporter.log("login", true);
		FileLib f = new FileLib();
		String url = f.getPropertyData("url");
		String un = f.getPropertyData("username");
		String pw = f.getPropertyData("password");
		driver.get(url);
		LoginPage l = new LoginPage(driver);
		l.setLogin(un, pw);
	}
	
	@AfterMethod
	public void logout() {
		Reporter.log("logout", true);
		HomePage h = new HomePage(driver);
		h.setLogout();
	}
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closeBrowser", true);
		driver.close();
	}
}
