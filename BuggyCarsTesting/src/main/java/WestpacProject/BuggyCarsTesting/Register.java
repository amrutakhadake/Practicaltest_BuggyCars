package WestpacProject.BuggyCarsTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\newchrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://buggy.justtestit.org/");
		driver.manage().window().maximize();
		 driver.findElement(By.linkText("Register")).click();
		 driver.findElement(By.id("username")).sendKeys("abc");
		
		 driver.findElement(By.id("firstName")).sendKeys("abc");
		
		 driver.findElement(By.id("lastName")).sendKeys("abc");
		
		 driver.findElement(By.id("password")).sendKeys("Amru@123");
		 
		 driver.findElement(By.id("confirmPassword")).sendKeys("Amru@123");
		
		 driver.findElement(By.className("btn-default")).click();
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 //driver.close();
		 

	}

}
