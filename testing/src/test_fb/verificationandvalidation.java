package test_fb;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class verificationandvalidation {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement nifty_tab=driver.findElement(By.id("TradeRec"));
		String bg_color=nifty_tab.getCssValue("outline-color");
		String bg_orgin=nifty_tab.getCssValue("background-origin");
		String bg_size=nifty_tab.getCssValue("background-size");
		
		System.out.println("background color in RGBA format => "+bg_color);
		System.out.println(bg_orgin);
		System.out.println(bg_size);
		
		
		if(bg_color.equals("rgba(255, 255, 255, 1)"))
			System.out.println("as expected");
		else
			System.out.println("expected colour is not displayed");
		
		
		driver.close();

	}

}
