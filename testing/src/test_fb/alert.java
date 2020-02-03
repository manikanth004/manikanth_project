package test_fb;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement serach=driver.findElement(By.xpath("(//*[@type=\'submit\'])[2]"));
		serach.click();
		
	
		try {
			
			Alert alert=driver.switchTo().alert();
			String alert_text=alert.getText();
			System.out.println(alert_text);
			alert.accept();

			
			
			
		} catch (Exception e) {

			System.out.println("alert not presented");
		}
		
		
		//driver.close();
		
		

	}

}
