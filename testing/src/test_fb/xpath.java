package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://login.yahoo.com/account/create?specId=yidReg");
		driver.manage().window().maximize();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\'usernamereg-firstName\']")).clear();
		driver.findElement(By.xpath("//*[@id=\'usernamereg-firstName\']")).sendKeys("mani");
		driver.findElement(By.xpath("//*[@autocomplete=\'family-name\']")).clear();
		driver.findElement(By.xpath("//*[@autocomplete=\'family-name\']")).sendKeys("kanth");
		driver.findElement(By.xpath("(//*[@aria-required=\'true\'])[3]")).sendKeys("dasamani004");
		driver.findElement(By.xpath("(//*[@aria-required=\'true\'])[4]")).sendKeys("dasamani004");
		driver.findElement(By.xpath("(//*[@aria-required=\'true\'])[6]")).sendKeys("9705453560");
		driver.findElement(By.xpath("(//*[@aria-required=\'true\'])[7]")).click();
		driver.findElement(By.xpath("(//*[@id=\'usernamereg-month\'])/option[6]")).click();
		driver.findElement(By.xpath("(//*[@minlength=\'1\'])[1]")).clear();
		driver.findElement(By.xpath("(//*[@minlength=\'1\'])[1]")).sendKeys("04");
		driver.findElement(By.xpath("(//*[@role=\'textbox\'])[3]")).clear();
		driver.findElement(By.xpath("(//*[@role=\'textbox\'])[3]")).sendKeys("1998");

		driver.findElement(By.xpath("//*[@name=\'freeformGender\']")).sendKeys("male");
	//	driver.findElement(By.xpath("class=\'usernamereg-freeformGender\'")).sendKeys("male");
		
		
		
	}

}
