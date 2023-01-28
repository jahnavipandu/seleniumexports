package advancedfeatures;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class dropdown {
	WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("wdbdriver.chrome.driver", ".\\drivers\\chromedriver_win32.exe");	
		driver= new ChromeDriver();  
		driver.get("https://www.google.com");
		driver.manage().window().maximize();  
  }

  @AfterTest
  public void afterTest() {
	  
  }

}
