package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explict_clickable {

	public static void main(String[] args)
	{
		String path="brow\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		WebDriverWait wait=new WebDriverWait(driver, 50);
		 
		By City_loc=By.xpath("//select[@name='cityName']");
		wait.until(ExpectedConditions.elementToBeClickable(City_loc)).click();
		

	}

}
