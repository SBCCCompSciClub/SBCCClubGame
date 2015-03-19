package main;

/*
 * Computer Science Club Game Project: Coach's Crusade.
 */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Frame;

@SuppressWarnings("serial")
public class Main extends Applet implements Runnable {

	public static void main(String[] args) {

	}

	@Override
	public void init() {

		setSize(800, 400);
		setBackground(Color.BLACK);
		setFocusable(true);
		Frame frame = (Frame) this.getParent().getParent();
		frame.setTitle("Coach's Crusade");

	}

	@Override
	public void start() {

		Thread thread = new Thread(this);
		thread.start();
	}

	@Override
	public void stop() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void run() {

		while (true) {

			repaint();

			try {
				Thread.sleep(17);// thread stops for 17 milliseconds, this
									// gives us approximately 60FPS
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}// end of while loop
	}
}
