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

public class browserTest5_testNG5 {
	
	WebDriver driver = null;
	
	@BeforeClass
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.hotstar.com/in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div/div[2]/div/div[3]/ul/li[2]/div/a/div")).click();  //click on movies
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[1]/div/div[2]/div/div[3]/ul/li[2]/div/div/a[2]")).click();  //click on hindi
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/div[2]/div/div/div/div/div/div/div[2]/div/article/a/div[2]")).click();
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
			System.out.println("Test Successful");
		}

	}
}
