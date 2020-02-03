package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class scroller {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.hdfcbank.com/personal/tools-and-calculators/personal-loan-calculator");
		driver.manage().window().maximize();
		
		WebElement scroller=driver.findElement(By.xpath("//*[@class=\'rangeslider__handle\']"));
		new Actions(driver).dragAndDropBy(scroller, 200, 0).perform();
		
		

	}

}
