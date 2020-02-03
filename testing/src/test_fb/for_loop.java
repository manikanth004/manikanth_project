package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class for_loop {

	public static void main(String[] args) 
	{
		String path="brow\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement email=driver.findElement(By.id("email"));
		email.clear();
		
		
		Object fb_em[][]= 
			
			{
					{"manikanyh","970545"},
					{"manika","12345"},
					
			};
		

		System.out.println(fb_em[0][1]);
	}

}
