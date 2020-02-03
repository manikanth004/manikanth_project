package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class link_testing {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		new Select(driver.findElement(By.id("customState")))
		.selectByIndex(31);
		Thread.sleep(3000);
		
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("kothapet");
		
		new Select(driver.findElement(By.id("customRadius"))).selectByValue("5");
		
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		driver.findElement(By.xpath("//input[contains(@type,'submit')]"));
		
		
		
		
		
		
		
		
	}

}
