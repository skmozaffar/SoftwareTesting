package ListboxAssignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSelectedOptionSlv {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://skmozaffar.github.io/HotelMenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement slvList = driver.findElement(By.id("slv"));
		Select s = new Select(slvList);
		WebElement firstOpt = s.getFirstSelectedOption();
		String text = firstOpt.getText();
		System.out.println(text);
		driver.close();
	}
}
