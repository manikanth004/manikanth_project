package make_my_trip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Makemylogin {

	/**
	 * @param args
	 * @throws Exception
	 */
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.findElement(By.id("fromCity")).click();
		driver.findElement(By.xpath("//input[contains(@placeholder,'From')]")).sendKeys("HYD");
		driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'][contains(.,'Hyderabad, India')])[1]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@aria-autocomplete,'list')]")).sendKeys("BLR");
		Thread.sleep(000);

		driver.findElement(By.xpath("//li[contains(@id,'react-autowhatever-1-section-0-item-0')]")).click();

		driver.findElement(By.cssSelector("div[aria-label=\'Fri Dec 20 2019\']")).click();
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'][contains(.,'RETURN')]")).click();
		
		
		driver.findElement(By.cssSelector("div[aria-label=\'Mon Jan 13 2020']")).click();
		driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'][contains(.,'Travellers & CLASS')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'adults-4')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'children-3')]")).click();
		driver.findElement(By.xpath("//li[contains(@data-cy,'travelClass-0')]")).click();
		driver.findElement(By.xpath("//button[contains(.,'APPLY')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Search')]")).click();
		
		

				
		

	}

}
