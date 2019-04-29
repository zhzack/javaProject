import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Myframe0 extends JFrame implements ItemListener {

	JLabel label;

	public Myframe0(String title) {
		super(title);
		setSize(600, 400);
		setLayout(new FlowLayout());

		String[] ss = { "计科", "软件", "网络" };
		JComboBox combo = new JComboBox(ss);
		combo.addItemListener(this);

		label = new JLabel("初始化。。。");

		add(combo);
		add(label);
		setLocationRelativeTo(null);// 设置居中显示
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		label.setText(e.getItem().toString());
	}

	
}

public class MyFrame {

	public static void main(String[] args) {
		new Myframe0("ComboBox选中");
		Box box=Box.createHorizontalBox();
	}
}