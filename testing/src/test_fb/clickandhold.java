package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class clickandhold {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		
		driver.navigate().to("https://jqueryui.com/resources/demos/selectable/default.html");
		new Actions(driver).keyDown(Keys.CONTROL).perform();
		
		
		driver.findElement(By.xpath("//li[contains(.,'Item 2')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 4')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 5')]")).click();
		driver.findElement(By.xpath("//li[contains(.,'Item 7')]")).click();
	}

}
