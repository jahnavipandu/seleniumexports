package testcase2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testngchromepractice {
	WebDriver deiver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\lib\\chromedriver_win32.exe" );
	  deiver=new ChromeDriver();
	  deiver.get("https://www.gmail.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
