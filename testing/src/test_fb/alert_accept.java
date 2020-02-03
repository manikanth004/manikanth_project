package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert_accept {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement search_bt=driver.findElement(By.xpath("//input[@type='submit']"));
		search_bt.click();
		
		

	}

}
