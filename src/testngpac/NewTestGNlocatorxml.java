package testngpac;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTestGNlocatorxml {
	WebDriver driver;
  @Test
  public void signin() {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("pandu");
	  driver.findElement(By.xpath("//*[@id=\"passwo"
	  		+ "rd\"]")).sendKeys("hai");
	  driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[3]/td[2]/label")).click();
	  
	  	driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[4]/td[2]/input")).click();
	  	/*driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
		  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();*/
  }	  
	  
  @Test
  public void home() {
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[1]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[3]/a")).click();
  }	 	  
	
	  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrom.driver", "D:\\lib\\chromedriver_win32.exe");
	  driver= new ChromeDriver();
	  driver.get("https://www.redmine.org");
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
