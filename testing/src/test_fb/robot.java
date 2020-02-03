package test_fb;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class robot {

	public static void main(String[] args) throws Exception
	{

		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(3000);
		
		StringSelection string=new StringSelection("text");
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(string, string);
		
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		String path="C:\\Users\\Abhi\\Desktop\\manikanth";
		//String selection for path
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);
		
		//Use Keyboard short Cntrl+V to copy text into Notepad interface
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
				
		
		//Release Control Key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	
		
		
	}

}
