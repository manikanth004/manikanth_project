package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rediff {

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.xpath("//a[contains(@href,'details')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name*=\'name\']")).clear();
		driver.findElement(By.cssSelector("input[name*=\"name\"]")).sendKeys("mani");
		driver.findElement(By.cssSelector("input[name*=login]")).sendKeys("mani");
		driver.findElement(By.cssSelector("input[name*=\'passwd\']")).sendKeys("mani1234");
		driver.findElement(By.cssSelector("input[name*=\'confirm_passwd\']")).sendKeys("mani12");
		driver.findElement(By.cssSelector("input[name*=\'altemail']")).clear();
		driver.findElement(By.cssSelector("input[name*=\'altemail\']")).sendKeys("dasamani004@gmail.com");
		
		driver.findElement(By.cssSelector("input[name*=\"mobno\"]")).sendKeys("9705453560");

		new Select(driver.findElement(By.cssSelector("select[name*=\'DOB_Day\']"))).selectByIndex(5);
		new Select(driver.findElement(By.cssSelector("select[name*=\"DOB_Month\"]"))).selectByValue("06");
		new Select(driver.findElement(By.cssSelector("select[name*=\"DOB_Year\"]"))).selectByVisibleText("2019");
		driver.findElement(By.xpath("//input[@value='f']")).click(); 
		new Select(driver.findElement(By.cssSelector("select[name*=\"country\"]"))).selectByValue("24");
		
		
		//new Select(driver.findElement(By.cssSelector("select[name*=\'DOB_Month\']"))).selectByIndex(arg0);

	}

}
