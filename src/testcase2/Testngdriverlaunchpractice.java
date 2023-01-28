package testcase2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testngdriverlaunchpractice {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "\"D:\\\\lib\\\\chromedriver_win32.exe\"");
		driver=new ChromeDriver();
		  driver.get("https://www.facebook.com/");

	}

}
