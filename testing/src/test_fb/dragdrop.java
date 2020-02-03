package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
		driver.manage().window().maximize();
		Thread.sleep(10000);

		//WebElement src=driver.findElement(By.xpath("//*[@id=\'draggable\']"));
		WebElement src=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dst=driver.findElement(By.xpath("//*[@id=\'droptarget\']"));
		
		new Actions(driver).dragAndDrop(src, dst).perform();
		
		
				

		
	}

}
