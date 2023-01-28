package testngpac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class TestNGdependsonmethod {
	WebDriver driver;
 
	 @Test(dependsOnMethods="method3")
	  public void method1() {
		 
		 driver.findElement(By.name("q")).sendKeys("selenium"); 
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
	 
	 @Test
	  public void method2() {
		 driver.get("https://www.google.com");
		 driver.findElement(By.name("q")).sendKeys("TestNG");
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  }
	 
	 @Test
	  public void method3() {
		 driver.get("https://www.google.com");
		 
	 }
	 
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("wdbdriver.chrome.driver", "D:\\lib\\chromedriver_win32.exe");	
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	 
  }
  

  @AfterTest
  public void afterTest() {
  }

}
