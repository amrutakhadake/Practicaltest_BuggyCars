package WestpacProject.BuggyCarsTesting;



import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Login {
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
    	 driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
   
   @Test
   public void testinvalidlogin()
   {
	  
	   WebElement weblogin = driver.findElement(By.name("login"));
		 WebElement password= driver.findElement(By.name("password"));
		 weblogin.sendKeys("abc");
		 password.sendKeys("abc#");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.findElement(By.className("btn-success")).click(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		String errormessage= driver.findElement(By.xpath("//div[@class='result alert alert-danger']")).getText();
		String actualerrormsg="Invalid username/password";
		if(actualerrormsg.equalsIgnoreCase(errormessage))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test failed");
		}
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
   }
   
   
@Test
   public void registration()
   {
		 
	   driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("username")).sendKeys("abcd");
		
		 driver.findElement(By.id("firstName")).sendKeys("abcd");
		
		 driver.findElement(By.id("lastName")).sendKeys("abcd");
	
		 driver.findElement(By.id("password")).sendKeys("Amru@1234");
		 
		 driver.findElement(By.id("confirmPassword")).sendKeys("Amru@1234");
		
		 driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).getText();
		String message= driver.findElement(By.xpath("//div[@class='result alert alert-danger']")).getText();
		String actualmessage="UsernameExistsException: User already exists";
		
		
		if(actualmessage.equalsIgnoreCase(message)) {
			System.out.println("test pass");
			
		}
		else {
			System.out.println("Test failed");
		}
		System.out.println(message); 
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 
   }
   @Test
   public void loginwithnewregistration()
   {
	   WebElement weblogin = driver.findElement(By.name("login"));
		 WebElement password= driver.findElement(By.name("password"));
		 weblogin.sendKeys("abcd");
		 password.sendKeys("Amru@1234");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		 driver.findElement(By.className("btn-success")).click(); 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
   }


}
