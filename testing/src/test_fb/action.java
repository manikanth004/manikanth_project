package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html#example-html-simple-context-menu");
		driver.manage().window().maximize();
		 
		WebElement element=driver.findElement(By.xpath("//span[text()='right click me']"));
		new Actions(driver).contextClick(element).perform();
		
		WebElement Delete_option=driver.findElement(By.xpath("//span[text()=\'Delete\']"));
		new Actions(driver).click(Delete_option).perform();
		//new Actions(driver).click(element2).perform();
		

		driver.switchTo().alert().accept();
		

	}

}
