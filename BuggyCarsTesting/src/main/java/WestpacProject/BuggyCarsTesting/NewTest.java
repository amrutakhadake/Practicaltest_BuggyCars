package WestpacProject.BuggyCarsTesting;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\newchrome\\chromedriver.exe");
	  driver.get("https://buggy.justtestit.org/");
		 driver.manage().window().maximize();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

}
