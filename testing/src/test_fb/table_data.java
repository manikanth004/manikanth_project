package test_fb;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table_data {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://content.icicidirect.com/IdirectContent/Markets/MarketOverview.aspx");			  
		driver.manage().window().maximize();
		

		WebElement Markets=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		
		Markets.click();
	

		WebElement Table=driver.findElement(By.xpath("//*[@id=\"Table4\"]"));

		List<WebElement> rows=Table.findElements(By.tagName("tr"));
	    
	    WebElement selected_rows=rows.get(2);
	    List<WebElement> cells=selected_rows.findElements(By.tagName("td"));
	    String data=cells.get(0).getText();
	    System.out.println(data);
	    driver.close();
	    
	    
	    
		

	}

}
