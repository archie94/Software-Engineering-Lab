package Practice;

import java.applet.Applet;
import java.awt.Graphics;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ClockApplet extends Applet implements Runnable{

	Thread thread1, thread2;
	public void start() {
		thread1 = new Thread(this);
		thread1.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		thread2 = Thread.currentThread();
		while(thread1 == thread2) {
			repaint();
			try {
				thread2.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g) {
		Calendar calendar = new GregorianCalendar();
		String hour = String.valueOf(calendar.get(Calendar.HOUR));
		String minutes = String.valueOf(calendar.get(Calendar.MINUTE));
		String seconds = String.valueOf(calendar.get(Calendar.SECOND));
		g.drawString(hour + ":" + minutes + ":" + seconds, 20, 20);
	}
	
}
