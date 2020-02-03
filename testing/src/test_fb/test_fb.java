package test_fb;


import org.openqa.selenium.chrome.ChromeDriver;

public class test_fb {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "bro.exe\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		//chrome.get("http://emicalculator.net");
		chrome.get("https:wwww.facebook.com");
		chrome.findElementById("email");
		chrome.findElementById("password");
		
		
				
		
		
		

	}
 
}
