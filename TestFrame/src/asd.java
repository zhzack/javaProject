
import java.awt.FlowLayout;

import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class asd {

	public static void main(String[] args) {

		JFrame frame = new JFrame("�������");
		frame.setSize(600, 500);
		frame.setLocation(200, 200);

		frame.setResizable(false);
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		frame.setLocationRelativeTo(null);

		JLabel labelMajor = new JLabel("רҵ��");

		ButtonGroup btnGroup = new ButtonGroup();
		JRadioButton radio1 = new JRadioButton("�ƿ�");

		JRadioButton radio2 = new JRadioButton("���");
		JRadioButton radio3 = new JRadioButton("����");

		btnGroup.add(radio1);
		btnGroup.add(radio2);
		btnGroup.add(radio3);

		JLabel labelHobby = new JLabel("��Ȥ��");

		JCheckBox chk1 = new JCheckBox("Java");

		JCheckBox chk2 = new JCheckBox("Python");

		JCheckBox chk3 = new JCheckBox("C++");

		JCheckBox chk4 = new JCheckBox("JavaScript");

		JLabel labelCity = new JLabel("���ڳ��У�");
		
		Object[] cities = { "��ɽ", "����", "�ߺ�", "����", "�Ͼ�", "����" };
		JComboBox combox = new JComboBox(cities);

		JLabel labelIntroduce = new JLabel("���ҽ���");
		
		JTextArea textArea = new JTextArea(6, 4);

		textArea.setLineWrap(true);

		JButton btnSubmit = new JButton("�ύ");
	

		Box boxVmain = Box.createVerticalBox();
		Box boxH1 = Box.createHorizontalBox();
		Box boxH2 = Box.createHorizontalBox();
		Box boxH3 = Box.createHorizontalBox();
		Box boxH4 = Box.createHorizontalBox();
		Box boxH5 = Box.createHorizontalBox();
		boxVmain.add(boxH1);
		boxVmain.add(boxH2);
		boxVmain.add(boxH3);
		boxVmain.add(boxH4);
		boxVmain.add(boxH5);
		boxH1.add(labelMajor);
		boxH1.add(radio1);
		boxH1.add(radio2);
		boxH1.add(radio3);

		boxH2.add(labelHobby);
		boxH2.add(chk1);
		boxH2.add(chk2);
		boxH2.add(chk3);
		boxH2.add(chk4);

		boxH3.add(labelCity);
		boxH3.add(combox);

		boxH4.add(labelIntroduce);
		boxH4.add(textArea);

		boxH5.add(btnSubmit);

		frame.add(boxVmain);

		frame.setVisible(true);
	}

}
