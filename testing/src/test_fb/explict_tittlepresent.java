package test_fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explict_tittlepresent {

	public static void main(String[] args)
	{
	
		String path="brow\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@id='RoundTrip']"));
		Roundtrip.click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementSelectionStateToBe(Roundtrip, true));
		System.out.println("timeout released roundtrip is selecetd");
		WebElement Return_Date_Loc=driver.findElement
				(By.xpath("//input[@title='Return date']"));
		Return_Date_Loc.click();
		
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementSelectionStateToBe(Return_Date_Loc, true));
		
		System.out.println("test verified");

		
	}

}
