package project8f;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyCalculate extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField txt1, txt2;
	JLabel label, optLabel, resLabel;
	JButton btn1, btn2, btn3, btn4;

	public MyCalculate(String title) {
		super(title);
		setSize(600, 250);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口

		txt1 = new JTextField(5);
		label = new JLabel(" 运算 ");
		txt2 = new JTextField(5);
		btn1 = new JButton("相加");
		btn2 = new JButton("相减");
		btn3 = new JButton("相乘");
		btn4 = new JButton("相除");
		optLabel = new JLabel(" = ");
		resLabel = new JLabel("0");
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);

		Box boxMain = Box.createVerticalBox();
		Box box = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		boxMain.add(box);
		boxMain.add(box2);

		box.add(txt1);
		box.add(label);
		box.add(txt2);
		box.add(optLabel);
		box.add(resLabel);

		box2.add(btn1);
		box2.add(btn2);
		box2.add(btn3);
		box2.add(btn4);

		add(boxMain);
		setVisible(true);
	}

	public static boolean isNumer(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) > 57 || str.charAt(i) < 48) {// ascll码判断每一个字符是否为数字0=48，9=57
				return false;
			}
		}
		return true;
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if (isNumer(txt1.getText())) {
			if (isNumer(txt2.getText())) {
				int a = Integer.parseInt(txt1.getText());
				int b = Integer.parseInt(txt2.getText());

				if (e.getActionCommand() == "相加") {
					resLabel.setText(String.valueOf(a + b));
				} else if (e.getActionCommand() == "相减") {
					resLabel.setText(String.valueOf(a - b));
				} else if (e.getActionCommand() == "相乘") {
					resLabel.setText(String.valueOf(a * b));
				} else if (e.getActionCommand() == "相除") {
					double x = Double.parseDouble(txt1.getText());
					double y = Double.parseDouble(txt2.getText());
					if (y == 0) {
						resLabel.setText("被除数不能为零");
					} else {
						resLabel.setText(String.valueOf(x / y));
					}

				}
			}
		} else {
			resLabel.setText("您输入的数值不正确,请重新输入");
		}

	}

}

public class Second {

	public static void main(String[] args) {

		new MyCalculate("计算器");
	}
}