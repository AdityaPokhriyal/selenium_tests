package seleniumJavaFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Iphone 13");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"low-price\"]")).sendKeys("40000");
		driver.findElement(By.xpath("//*[@id=\"high-price\"]")).sendKeys("60000");
		driver.findElement(By.xpath("//*[@id=\"a-autoid-1\"]/span/input")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
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
