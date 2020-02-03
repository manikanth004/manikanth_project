package test_fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_fb {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "bro.exe\\chromedriver.exe;");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		
 
	}

}
