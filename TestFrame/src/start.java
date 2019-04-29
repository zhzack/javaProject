

import java.awt.Color;
import java.awt.Frame;

import javax.swing.JLabel;
public class start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BGframe bGframe=new BGframe("asd", 100, 100);
		BGdialog bGdialog=new BGdialog(bGframe, "¶Ô»°¿ò", 100, 100);
		bGdialog.setBackground(java.awt.Color.BLACK);
		//bGdialog.show();
		JLabel label=new JLabel();
		label.setText("hello world");
		label.setOpaque(true);
		label.setBackground(Color.BLACK);
		//label.add(bGdialog);
	}

}
