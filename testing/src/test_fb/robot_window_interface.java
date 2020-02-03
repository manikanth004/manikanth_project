package test_fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robot_window_interface {

	public static void main(String[] args) throws AWTException, Exception
	{
		//Locate chrome browser in currnet system
				System.setProperty("webdriver.chrome.driver", "brow\\chromedriver.exe");		
				//browser initiation command
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.cleartrip.com");
				driver.manage().window().maximize();
				Thread.sleep(5000);

				//Create object for robot
				Robot robot=new Robot();
				robot.setAutoDelay(500);


				robot.mouseMove(301, 164);

				//Press Mouse 
				robot.mousePress(InputEvent.BUTTON1_MASK);
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
	}

}
