package test_fb;

import java.awt.Robot;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screen_capture {

	public static void main(String[] args) throws Exception
	
	{
		System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MMM hh-mm-ss");
		String time=sdf.format(d);
		
		Robot robot=new Robot();
		robot.mouseWheel(100);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screenshot\\"+time+"image.png"));
		
				
	}

}
