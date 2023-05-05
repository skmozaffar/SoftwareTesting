package WebElementAssignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColorForgotPasswordLinkFacebook {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
		String clr = link.getCssValue("color");
		System.out.println("Color: "+ clr);
		String fontType = link.getCssValue("font-family");
		System.out.println("Font Type: "+ fontType);
		String fontSize = link.getCssValue("font-size");
		System.out.println("Font Size: "+ fontSize);
		driver.close();
	}
}
