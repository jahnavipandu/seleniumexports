package testngpac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class testngdemo {
	WebDriver driver;
  @Test(priority=2)
  public void google() {
	  driver.get("https://www.google.com");
  }
  @Test(priority=0)
  public void facebook() {
	  driver.get("https://www.facebook.com");
  }
  @Test(enabled=false)
  public void amazon() {
	  driver.get("https://www.amazon.com");
  }
  @Test(priority=1)
  public void flipkart() {
	  driver.get("https://www.flipkart.com");
  }
  @Test
  public void gmail() {
	  driver.get("https://www.gmail.com");
  }
  @BeforeTest
  public void beforeTest() {
	  /*System.setProperty("webdriver.chrome.driver", "E:\\ABC\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();*/
	System.setProperty("wdbdriver.chrome.driver", "D:\\lib\\chromedriver_win32.exe");	
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");	
	}
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
