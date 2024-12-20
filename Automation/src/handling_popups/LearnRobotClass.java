package handling_popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class LearnRobotClass {
	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		Runtime.getRuntime().exec("notepad"); 
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_SHIFT); 
		r.keyPress(KeyEvent.VK_R);
		r.keyPress(KeyEvent.VK_C); 
		r.keyPress(KeyEvent.VK_B); 
		r.keyRelease(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_CONTROL); 
		r.keyPress(KeyEvent.VK_R); 
		r.keyPress(KeyEvent.VK_C); 
		r.keyPress(KeyEvent.VK_B);
		r.keyPress(KeyEvent.VK_ENTER); 
	}
}
