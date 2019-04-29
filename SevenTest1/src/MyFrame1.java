import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import com.sun.javafx.geom.AreaOp.AddOp;

public class MyFrame1 extends JFrame {
	public MyFrame1(String name, int x, int y, int w, int h) {
		super(name);
		setSize(w, h);
		setLocation(x, y);
		setResizable(false);
		// getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MyFrame1 frame1 = new MyFrame1("�������", 100, 100, 800, 800);

		JLabel jLabel0 = new JLabel("רҵ��");
		jLabel0.setBounds(10, 30, 50, 50);
		JRadioButton button0 = new JRadioButton("���繤��");
		JRadioButton button1 = new JRadioButton("�������");
		JRadioButton button2 = new JRadioButton("�������ѧ");
		button0.setBounds(100, 10, 100, 100);
		button1.setBounds(220, 10, 100, 100);
		button2.setBounds(350, 10, 100, 100);
		ButtonGroup btnButtonGroup = new ButtonGroup();

		frame1.add(button0);
		frame1.add(button1);
		frame1.add(button2);
		btnButtonGroup.add(button0);
		btnButtonGroup.add(button1);
		btnButtonGroup.add(button2);

		JLabel jLabel1 = new JLabel("��Ȥ��");
		jLabel1.setBounds(10, 130, 50, 50);
		JCheckBox checkBox0=new JCheckBox("java");
		JCheckBox checkBox1=new JCheckBox("python");
		JCheckBox checkBox2=new JCheckBox("cpp");
		checkBox0.setBounds(100, 100, 100, 100);
		checkBox1.setBounds(220, 100, 100, 100);
		checkBox2.setBounds(350, 100, 100, 100);
		
		JLabel jLabel2 = new JLabel("���ڳ��У�");
		jLabel2.setBounds(10, 200, 100, 100);
		Object[] cities= {"�Ϸ�","�ߺ�","����","��ɽ"};
		JComboBox  coBox=new JComboBox(cities);
		coBox.setBounds(100, 230, 200, 30);
		
		JLabel jLabel3 = new JLabel("���ҽ��ܣ�");
		jLabel3.setBounds(10, 300, 100, 100);
		JTextArea area=new JTextArea();
		area.setBounds(100, 330, 500, 300);
		
		JButton button=new JButton("�ύ");
		button.setBounds(10, 650, 100, 30);
		
		frame1.add(jLabel0);
		frame1.add(jLabel1);
		frame1.add(jLabel2);
		frame1.add(jLabel3);
		
		frame1.add(checkBox0);
		frame1.add(checkBox1);
		frame1.add(checkBox2);
		
		frame1.add(coBox);
		
		frame1.add(area);
		frame1.add(button);
		frame1.setVisible(true);
	}
}
