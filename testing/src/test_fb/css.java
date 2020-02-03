package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class css {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/login?lang=en"); 
		driver.manage().window().maximize();
		Thread.sleep(3000);

	
		driver.findElement(By.xpath("//*[@autocomplete=\'on\']")).clear();
		driver.findElement(By.xpath("//*[@autocomplete=\'on\']")).sendKeys("dasamani004@gmail.com");


		driver.findElement(By.xpath("//*[@class=\'js-password-field\']")).sendKeys("manikanth");
		driver.findElement(By.xpath("//*[@class=\"submit EdgeButton EdgeButton--primary EdgeButtom--medium\"]")).click();
		
	
	}
 
}
