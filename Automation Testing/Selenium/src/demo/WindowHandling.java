package demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank edge browser will be launched
		driver.get("http://omayo.blogspot.com/"); // This url will be opened in the above browser
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Open a popup window")).click();
		driver.findElement(By.linkText("Blogger")).click();
		
		Set<String> windowids = driver.getWindowHandles(); // Getting all the current opened windows id and store it in the set
		Iterator<String> itr = windowids.iterator(); // Accessing all the ids one by one like for/for each loop
		
//		while(itr.hasNext()) {
//			String windowid = itr.next();
//			System.out.println(windowid); // Printing all the window ids one by one
//		}
		
//		Drowback of this, if there are more than one child windows as set will store the elements randomly,
//		we can not make sure that which id belongs to which windows
//		----------------------------------------------------------------------------------------------------
//		String mainwindowid = itr.next(); // We will get id of main window
//		String childwindowid = itr.next(); // We will get id of child window
//		// We switched the focus of Selenium to the child window
//		driver.switchTo().window(childwindowid); // Now focus is on child window
//		
//		String firstparaonchildwindow = driver.findElement(By.id("para1")).getText();
//		System.out.println(firstparaonchildwindow);
//		
//		driver.close(); // This will close the child window as Selenium can only see one window at a time
//		
//		driver.switchTo().window(mainwindowid); // Now focus in on main window
//		driver.close(); // Main window will be closed
//		------------------------------------------------------------------------------------------------------
		
//		Better to go with this logic
//		-----------------------------
		String paraTextOnPopupWindow = null;
		while(itr.hasNext()) { // This will return true if any element is present in set
			String windowid = itr.next();
			driver.switchTo().window(windowid);
			
			if(driver.getTitle().equals("Basic Web Page Title")) {
				paraTextOnPopupWindow = driver.findElement(By.id("para1")).getText();
			}
		}
		System.out.println(paraTextOnPopupWindow);
		
		driver.quit();
		
	}

}
