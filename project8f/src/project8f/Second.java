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
		setLocationRelativeTo(null);// ������ʾ����

		txt1 = new JTextField(5);
		label = new JLabel(" ���� ");
		txt2 = new JTextField(5);
		btn1 = new JButton("���");
		btn2 = new JButton("���");
		btn3 = new JButton("���");
		btn4 = new JButton("���");
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
			if (str.charAt(i) > 57 || str.charAt(i) < 48) {// ascll���ж�ÿһ���ַ��Ƿ�Ϊ����0=48��9=57
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

				if (e.getActionCommand() == "���") {
					resLabel.setText(String.valueOf(a + b));
				} else if (e.getActionCommand() == "���") {
					resLabel.setText(String.valueOf(a - b));
				} else if (e.getActionCommand() == "���") {
					resLabel.setText(String.valueOf(a * b));
				} else if (e.getActionCommand() == "���") {
					double x = Double.parseDouble(txt1.getText());
					double y = Double.parseDouble(txt2.getText());
					if (y == 0) {
						resLabel.setText("����������Ϊ��");
					} else {
						resLabel.setText(String.valueOf(x / y));
					}

				}
			}
		} else {
			resLabel.setText("���������ֵ����ȷ,����������");
		}

	}

}

public class Second {

	public static void main(String[] args) {

		new MyCalculate("������");
	}
}