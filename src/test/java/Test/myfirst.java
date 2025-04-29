package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class myfirst {
	public static WebDriver driver;
	@Test
	void get() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

}
