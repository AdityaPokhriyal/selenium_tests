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

public class browserTest8_testNG8 {
	
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
		driver.get("https://fitgirl-repacks.site/");
		driver.manage().window().maximize();                                                  
		driver.findElement(By.xpath("//*[@id=\"menu-main-menu\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"lcp_instance_0\"]/li[33]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"post-896\"]/div/p[2]/a[2]")).click();
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
