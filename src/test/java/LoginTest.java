import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	
	
	
	
	
	
	
	public static WebDriver driver;
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 
		 
		 
	}
	@Test
	public void doLogin() {
		
		
		driver.get("http://gmail.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("dudhe.asavari@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		
	}
	
	@AfterSuite
	public void tearDown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	


}
