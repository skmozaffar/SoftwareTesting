package demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Mozaffar\\Selenium\\SeleniumYoutube\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // A blank chrome browser will be launched
		driver.get("http://omayo.blogspot.com"); // This url will be opened in the above browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
//		Taking Screenshot
//		-----------------
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot\\sreenshot1.png"));
		Thread.sleep(2000);
		driver.findElement(By.linkText("theautomatedtester")).click();
		File src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src2, new File("screenshot\\sreenshot2.png"));
		driver.navigate().back();
		File src3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src3, new File("screenshot\\\\sreenshot3.png"));
		
		driver.quit();
	}

}
