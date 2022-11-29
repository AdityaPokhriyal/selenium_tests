package seleniumJavaFramework;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TC1 {
WebDriver driver = new ChromeDriver();
	
	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void test() {
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input]")).sendKeys("Hard Disk");
		driver.findElement(By.xpath("//*[@id=\"//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg]")).click();
		driver.findElement(By.xpath("//*[@id=\"//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div/div/section[2]/div[4]/div[1]/select]")).sendKeys("1000");
		driver.findElement(By.xpath("//*[@id=\"//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div/div/section[2]/div[4]/div[3]/select]")).sendKeys("5000");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[1]/div/a[2]")).click();
	}
	
	@AfterTest
	public void tearDownTest() {	
		String at = driver.getTitle();
		String et = "Flipkart.com : Hard Disk";
		driver.close();
		
		if(at.equalsIgnoreCase(et)) {
			System.out.println("Test Successful");
		}
		else {
			System.out.println("Test Failure");
		}

	}
}
