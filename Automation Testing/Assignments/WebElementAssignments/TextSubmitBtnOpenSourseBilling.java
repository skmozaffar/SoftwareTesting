package WebElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextSubmitBtnOpenSourseBilling {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opensourcebilling.org/users/sign_in");
		driver.manage().window().maximize();
		WebElement submitBtn = driver.findElement(By.id("user_login_btn"));
		String tag = submitBtn.getTagName();
		String attribute = submitBtn.getAttribute("class");
		String text = submitBtn.getText();
		System.out.println(tag);
		System.out.println(attribute);
		System.out.println(text);
		driver.close();
	}
}
