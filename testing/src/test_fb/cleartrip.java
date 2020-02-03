package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cleartrip {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.id("RoundTrip")).click();
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("DEL");
		Thread.sleep(5000);
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		

		driver.findElement(By.linkText("14")).click();
		
		
		
				

	}

}
