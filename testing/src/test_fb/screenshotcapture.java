package test_fb;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshotcapture {

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		
		Date d=new Date();
		SimpleDateFormat spd=new SimpleDateFormat("yyyy-MM-dd");
		String time=spd.format(d);
		
		

		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("screens\\"+time+"targetime.png"));
		driver.close();
		
		
		
		

	}

}
