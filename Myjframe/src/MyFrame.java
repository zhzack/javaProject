import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Myframe0 extends JFrame implements ItemListener {

	JLabel label;

	public Myframe0(String title) {
		super(title);
		setSize(600, 400);
		setLayout(new FlowLayout());

		String[] ss = { "�ƿ�", "���", "����" };
		JComboBox combo = new JComboBox(ss);
		combo.addItemListener(this);

		label = new JLabel("��ʼ��������");

		add(combo);
		add(label);
		setLocationRelativeTo(null);// ���þ�����ʾ
		setVisible(true);
	}

	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		label.setText(e.getItem().toString());
	}

	
}

public class MyFrame {

	public static void main(String[] args) {
		new Myframe0("ComboBoxѡ��");
		Box box=Box.createHorizontalBox();
	}
}