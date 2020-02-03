package multiple;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ismultiple {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		

		/*		
		 * Using javascript changing Dropdown Selection from single option
		 * to multiple.
		 */
		((JavascriptExecutor)driver)
		.executeScript("document.getElementById('customState')"
				+ ".setAttribute('multiple','multiple')");
		Thread.sleep(5000);  //Static timeout
		
		boolean flag=new Select(driver.findElement(By.id("customState"))).isMultiple();
		
		System.out.println("Dropdown multiple selection status is => \"+flag");
		
		if(flag==true)
		{
			Select statedropdown=new Select(driver.findElement(By.id("customState")));
			statedropdown.selectByIndex(3);
			statedropdown .selectByIndex(5);
			statedropdown .selectByIndex(7);
			
			int count=statedropdown.getAllSelectedOptions().size();
			if(count>1)
			{
				System.out.println("as expected");
				
				
			}
			else 
			{
				throw new Exception("Failed to select morethan one option");
			}
				
		} 
		else 
		{
			throw new Exception("dropdown is single option selection type");
		}
			
		
		
			
		
		System.out.println("test completed");

		

	}

}
