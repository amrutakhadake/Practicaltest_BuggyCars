package WestpacProject.BuggyCarsTesting;



//import java.util.List;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Profile {
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
		 driver.findElement(By.xpath("//a[@class='nav-link'][text()='Profile']")).click();
	}
public void profile() {
	 driver.findElement(By.id("firstName")).sendKeys("Testbuggy");
    driver.findElement(By.id("lastName")).sendKeys("testbuggy");
    driver.findElement(By.id("gender"));
     driver.findElement(By.id("age")).sendKeys("30");
    driver.findElement(By.id("address")).sendKeys("Auckland");
    driver.findElement(By.id("phone")).sendKeys("0278798690");
    driver.findElement(By.id("hobby")).sendKeys("Cricket");
    driver.findElement(By.id("currentPassword")).sendKeys("John123#");
     driver.findElement(By.id("newPassword")).sendKeys("Test123#");
     driver.findElement(By.id("newPasswordConfirmation")).sendKeys("Test123#");
     driver.findElement(By.xpath("//button[@type='submit'][text()='Save']"));
     driver.findElement(By.xpath("//div[contains(text(),'The profile has been saved successful')]"));

	
	  }
  
  
  public void additional_info() {
  }
  public void Change_password() {
  }
  
}
