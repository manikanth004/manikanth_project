package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practise {

	public static void main(String[] args) throws Exception 
	{

		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com/");
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 
		String text=driver.getTitle();
		System.out.println(text);
		String url=driver.getCurrentUrl();
		System.out.println(url);
	

		WebElement loc=driver.findElement(By.xpath("//input[contains(@name,'firstname')]"));
		String attr=loc.getAttribute("class");
		System.out.println(attr);
	}

}
