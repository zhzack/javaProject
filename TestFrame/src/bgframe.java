import java.awt.Color;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class BGframe extends JFrame{

	public BGframe(String title, int x, int y, int w, int h) {
		super(title);
		setSize(w, h);
		setLocation(x, y);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public BGframe(String title, int x, int y) {
		super(title);
		int h=300;
		int w=600;
		setSize(w, h);
		setLocation(x, y);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
