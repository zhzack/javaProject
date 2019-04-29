package project8s;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class myJFrame extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel titleJLabel, stuNumJLabel, stuNameJLabel, stuGenJLabel, stuAgeJLabel, stuCityJLabel;
	JTextField stuNumField, stuNameField, stuGenField, stuAgeField, stuCityField;
	DefaultListModel<String> listModel = new DefaultListModel<String>();
	JList<String> jlist = new JList<String>(listModel);

	public myJFrame(String str) {

		super(str);
		setSize(800, 600);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口

		titleJLabel = new JLabel("请在以下文本框中输入信息");
		stuNumJLabel = new JLabel("学号:");
		stuNameJLabel = new JLabel("姓名:");
		stuGenJLabel = new JLabel("性别:");
		stuAgeJLabel = new JLabel("年龄:");
		stuCityJLabel = new JLabel("城市:");

		stuAgeField = new JTextField();
		stuCityField = new JTextField();
		stuGenField = new JTextField();
		stuNameField = new JTextField();
		stuNumField = new JTextField();

		JButton btn = new JButton("提交");
		Box boxMain = Box.createVerticalBox();
		boxMain.add(Box.createVerticalStrut(100));
		Box boxTitle = Box.createHorizontalBox();
		Box boxStuNum = Box.createHorizontalBox();
		Box boxStuName = Box.createHorizontalBox();
		Box boxStuGen = Box.createHorizontalBox();
		Box boxStuAge = Box.createHorizontalBox();
		Box boxStuCity = Box.createHorizontalBox();
		Box boxStuBtn = Box.createHorizontalBox();
		Box boxTable = Box.createHorizontalBox();

		boxMain.add(boxTable);
		boxMain.add(boxTitle);
		boxMain.add(Box.createVerticalStrut(10));
		boxTitle.add(titleJLabel);
		boxMain.add(Box.createVerticalStrut(10));
		boxMain.add(boxStuNum);
		boxStuNum.add(stuNumJLabel);
		boxStuNum.add(stuNumField);
		boxMain.add(Box.createVerticalStrut(10));

		boxMain.add(boxStuName);
		boxStuName.add(stuNameJLabel);
		boxStuName.add(stuNameField);
		boxMain.add(Box.createVerticalStrut(10));
		boxMain.add(boxStuGen);
		boxStuGen.add(stuGenJLabel);
		boxStuGen.add(stuGenField);
		boxMain.add(Box.createVerticalStrut(10));
		boxMain.add(boxStuAge);
		boxStuAge.add(stuAgeJLabel);
		boxStuAge.add(stuAgeField);
		boxMain.add(Box.createVerticalStrut(10));
		boxMain.add(boxStuCity);
		boxStuCity.add(stuCityJLabel);
		boxStuCity.add(stuCityField);
		boxMain.add(Box.createVerticalStrut(10));
		boxMain.add(boxStuBtn);
		boxStuBtn.add(btn);
		btn.addActionListener(this);
		listModel.addElement("学号，姓名，性别，年龄，城市");
		boxTable.add(jlist);
		boxMain.add(boxTable);
		add(boxMain);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		listModel.addElement(stuNumField.getText() + "," + stuNameField.getText() + "," + stuGenField.getText() + ","
				+ stuAgeField.getText() + "," + stuCityField.getText());
		stuNumField.setText(null);
		stuNameField.setText(null);
		stuGenField.setText(null);
		stuAgeField.setText(null);
		stuCityField.setText(null);
	}

	public static void main(String[] args) {

		myJFrame frame = new myJFrame("简单组件");
	}
}