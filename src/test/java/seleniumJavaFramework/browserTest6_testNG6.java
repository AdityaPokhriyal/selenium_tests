package seleniumJavaFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class browserTest6_testNG6 {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.geeksforgeeks.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"whatsNewCardContainer\"]/div[3]/div/div/a/div/div[2]/div[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"header_2\"]")).click();
		//driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[4]/div[2]/div/div[1]/div[2]/div[1]/a[1]/div[3]/div/button")).click();
	}
	
	@AfterClass
	public void tearDownTest() {	
		String at = driver.getTitle();
		String et = "Amazon.in : Iphone 13";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failure");
		}

	}
}
