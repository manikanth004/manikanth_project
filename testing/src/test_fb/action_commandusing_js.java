package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class action_commandusing_js {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		JavascriptExecutor js=((JavascriptExecutor)driver);


		WebElement location=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		js.executeScript("arguments[0].style.backgroundColour='yellow'", location);
		 

	}

}
