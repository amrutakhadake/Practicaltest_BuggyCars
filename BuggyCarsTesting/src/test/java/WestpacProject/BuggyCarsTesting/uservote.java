package WestpacProject.BuggyCarsTesting;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class uservote {
	public String baseurl="https://buggy.justtestit.org/";
	String driverpath="C:\\chromedriver\\newchrome\\chromedriver.exe";
	
	public static WebDriver driver;
	
	@BeforeTest
	   public void testcases()
	   {
		System.out.println("launching Chrome browser");
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver = new ChromeDriver();
		driver.get(baseurl);
			 
	   }
   
@Test
	public void test_login()
	{
    	
    	
		 
		 WebElement weblogin = driver.findElement(By.name("login"));
		 WebElement password= driver.findElement(By.name("password"));
		 weblogin.sendKeys("testpurpose");
		 password.sendKeys("John123#");
		 driver.findElement(By.xpath("//button[@type='submit'][text()='Login']")).click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 //driver.findElement(By.linkText("Logout")).click();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	 System.out.println("Login Sucessfully");
    	 
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
  @Test
  public void userchoose() {
     
	 driver.findElement(By.xpath("//img[contains(@src,'/img/cars/Lamborghini-Logo.png')]")).click();
     driver.findElement(By.xpath("//a[img[@title=\"Lamborghini AVENTADOR\"]]")).click();
     driver.findElement(By.xpath("//textarea[@id='comment']")).sendKeys("Love this car...!!");
     driver.findElement(By.xpath("//button[contains(text(),'Vote!')]")).click();
     driver.findElement(By.xpath("//a[contains(text(),'Buggy Rating')]")).click();
  }
}
