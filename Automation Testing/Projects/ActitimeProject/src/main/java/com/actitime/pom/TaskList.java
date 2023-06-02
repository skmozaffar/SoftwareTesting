package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskList {
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement taskTab;
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNewBtn;
	
	@FindBy(xpath = "//div[text()='+ New Customer']")
	private WebElement addNewCustomerBtn;
	
	@FindBy(xpath = "//input[@placeholder='Enter Customer Name' and @class]")
	private WebElement enterCustomertbx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDetails;
	
	@FindBy(xpath = "//div[@class='emptySelection']")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath = "//div[text()='Big Bang Company' and @class='itemRow cpItemRow ']")
	private WebElement bigBangCompany;
	
	@FindBy(xpath = "//div[text()='Create Customer']")
	private WebElement createCustomerBtn;
	
	@FindBy(xpath = "//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomer;

	public TaskList(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setTaskList() {
		taskTab.click();
	}
	
	public WebElement getAddNewBtn() {
		return addNewBtn;
	}

	public WebElement getAddNewCustomerBtn() {
		return addNewCustomerBtn;
	}

	public WebElement getEnterCustomertbx() {
		return enterCustomertbx;
	}

	public WebElement getEnterCustomerDetails() {
		return enterCustomerDetails;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getBigBangCompany() {
		return bigBangCompany;
	}

	public WebElement getCreateCustomerBtn() {
		return createCustomerBtn;
	}

	public WebElement getActualCustomer() {
		return actualCustomer;
	}
}
