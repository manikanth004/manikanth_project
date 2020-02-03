package test_fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class keyboard_inter_innotepad {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_SHIFT);
		
		robot.keyPress(KeyEvent.VK_H);
		robot.keyPress(KeyEvent.VK_E);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_L);
		robot.keyPress(KeyEvent.VK_O);
		
		robot.keyPress(KeyEvent.VK_SPACE);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);;
		
		robot.keyPress(KeyEvent.VK_M);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyPress(KeyEvent.VK_D);
		robot.keyPress(KeyEvent.VK_Q);

	}

}
