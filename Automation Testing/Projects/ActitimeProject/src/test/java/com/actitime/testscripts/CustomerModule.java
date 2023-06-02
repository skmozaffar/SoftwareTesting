package com.actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.actitime.generics.BaseClass;
import com.actitime.generics.FileLib;
import com.actitime.pom.TaskList;

public class CustomerModule extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("testCreateCustomer executed", true);
		TaskList t = new TaskList(driver);
		t.setTaskList();
		t.getAddNewBtn().click();
		t.getAddNewCustomerBtn().click();
		FileLib f = new FileLib();
		String customerName = f.readExcelData("CreateCustomer", 1, 2);
		t.getEnterCustomertbx().sendKeys(customerName);
		String customerDetails = f.readExcelData("CreateCustomer", 1, 3);
		t.getEnterCustomerDetails().sendKeys(customerDetails);
		t.getSelectCustomerDD().click();
		t.getBigBangCompany().click();
		t.getCreateCustomerBtn().click();
		Reporter.log("Customer is created successfully", true);
		Thread.sleep(5000);
	}
}
