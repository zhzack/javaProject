import javax.swing.JDialog;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class BGdialog extends JDialog {

	public BGdialog(JDialog jDialog, String namString, int x, int y, int w, int h) {
		super(jDialog, namString);
		setSize(w, h);
		setLocation(x, y);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}

	public BGdialog(BGframe bGframe, String namString, int x, int y) {
		super(bGframe, namString);
		int w = 600;
		int h = 300;
		setSize(w, h);
		setLocation(x, y);
		setVisible(true);
		setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		// TODO Auto-generated constructor stub
	}

}
