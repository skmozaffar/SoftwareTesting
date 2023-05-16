package ListboxAssignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OptionsAlphabeticalMtr {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ArrayList<String> ar = new ArrayList<>();
		WebDriver driver = new ChromeDriver();
		driver.get("https://skmozaffar.github.io/HotelMenu/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement mtrList = driver.findElement(By.id("mtr"));
		Select s = new Select(mtrList);
		List<WebElement> allOpt = s.getOptions();
		for(WebElement option:allOpt) {
			String text = option.getText();
			ar.add(text);
		}
		Collections.sort(ar);
//		System.out.println(ar); // [biscuit, coffee, curd, curd, halwa, idly, idly, tea]
//		for printing vertically
		for(String text:ar) {
			System.out.println(text);
		}
		driver.close();
	}
}
