package project8;


import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class first extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public first(String name) {
		super(name);
		setSize(500, 500);
		setLocation(200, 200);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// ������ʾ����
		//getContentPane().setBackground(Color.YELLOW);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setVisible(true);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		first first0 = new first("first");
		Box boxmain = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		Box box3 = Box.createHorizontalBox();
		Box box4 = Box.createHorizontalBox();
		Box box5 = Box.createHorizontalBox();

		JLabel jLabel0 = new JLabel("רҵ��");
		JRadioButton button0 = new JRadioButton("���繤��");
		JRadioButton button1 = new JRadioButton("�������");
		JRadioButton button2 = new JRadioButton("�������ѧ");
		ButtonGroup btnButtonGroup = new ButtonGroup();
		box1.add(jLabel0);
		box1.add(button0);
		box1.add(button1);
		box1.add(button2);
		btnButtonGroup.add(button0);
		btnButtonGroup.add(button1);
		btnButtonGroup.add(button2);

		JLabel jLabel1 = new JLabel("��Ȥ��");
		jLabel1.setBounds(10, 130, 50, 50);
		JCheckBox checkBox0 = new JCheckBox("java");
		JCheckBox checkBox1 = new JCheckBox("python");
		JCheckBox checkBox2 = new JCheckBox("cpp");
		JCheckBox checkBox3 = new JCheckBox("javaScript");
		box2.add(jLabel1);
		box2.add(checkBox0);
		box2.add(checkBox1);
		box2.add(checkBox2);
		box2.add(checkBox3);
		

		JLabel jLabel2 = new JLabel("���ڳ��У�");
		Object[] cities = { "�Ϸ�", "�ߺ�", "����", "��ɽ" };
		@SuppressWarnings("rawtypes")
		JComboBox coBox = new JComboBox(cities);
		box3.add(jLabel2);
		box3.add(coBox);
		

		JLabel jLabel3 = new JLabel("���ҽ��ܣ�");
		JTextArea area = new JTextArea();
		box4.add(jLabel3);
		box4.add(area);
		

		JButton button = new JButton("�ύ");
		box5.add(button);
		boxmain.add(box1);
		boxmain.add(box2);
		boxmain.add(box3);
		boxmain.add(box4);
		boxmain.add(box5);
		first0.add(boxmain);
		first0.setVisible(true);

	}

}
