package test_fb;

import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","brow\\chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		
		//ChromeDriver chrome=new ChromeDriver();
		chrome.get("https://www.gmail.com");
		//chrome.findElementsById().sendkeys();
		
		
		

		
	}

}
