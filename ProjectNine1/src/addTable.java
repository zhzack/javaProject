import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.FontUIResource;
import javax.swing.table.DefaultTableModel;

import java.awt.Container;

public class addTable extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel stuNumJLabel, stuNameJLabel, stuAgeJLabel;
	JTextField stuNumField, stuNameField, stuAgeField;

	Container container;
	JPanel jPanel, jPanel2;

	DefaultTableModel m_date;
	JTable m_Table;

	public addTable(String titleString) {

		super(titleString);
		setSize(800, 500);
		// setLocation(200, 200);
		// setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口
		// getContentPane().setBackground(Color.YELLOW);
		// setLayout(new FlowLayout(FlowLayout.LEFT));

		stuNumJLabel = new JLabel("学号:");
		stuNameJLabel = new JLabel("姓名:");
		stuAgeJLabel = new JLabel("年龄:");

		stuAgeField = new JTextField(8);
		stuNameField = new JTextField(8);
		stuNumField = new JTextField(8);

		stuNumField.setText(null);
		stuNameField.setText(null);
		stuAgeField.setText(null);
		JButton button = new JButton("添加");
		button.addActionListener(this);
		// listModel.addElement("学号，姓名，年龄");

		container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));

		jPanel = new JPanel();
		jPanel.setLayout(new FlowLayout());
		container.add(jPanel);

		jPanel2 = new JPanel();
		jPanel2.setLayout(new BorderLayout());
		container.add(jPanel2);

		jPanel.add(stuNumJLabel);
		jPanel.add(stuNumField);
		jPanel.add(stuNameJLabel);
		jPanel.add(stuNameField);
		jPanel.add(stuAgeJLabel);
		jPanel.add(stuAgeField);
		jPanel.add(button);

		m_date = new DefaultTableModel();// 创建一个空的数据表格
		m_Table = new JTable(m_date);
//		m_Table.setPreferredScrollableViewportSize(new Dimension(300, 150));
//		m_Table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane jScrollPane = new JScrollPane(m_Table);
//		Object object0= {"学号","姓名","年龄"}
		m_date.addColumn("学号");
		m_date.addColumn("姓名");
		m_date.addColumn("年龄");
		jPanel2.add(jScrollPane);

	}

	public void actionPerformed(ActionEvent e) {

		if (stuNumField.getText().isEmpty()) {
//			jTextField1.getText().equals("");
//			或
//			jTextField1.getText().length()==0; 
//			在这里判断文本框的内容是否为空时，以上两种方法均不能使用，
//			最后选择了isEmpty来判断
			JOptionPane.showMessageDialog(null, "学号不能为空");

		} else {
			Object[] object = { stuNumField.getText(), stuNameField.getText(), stuAgeField.getText() };
			m_date.addRow(object);
			stuNumField.setText(null);
			stuNameField.setText(null);
			stuAgeField.setText(null);
		}

	}

	public static void main(String[] args) {
		Font fnt = new Font("微软雅黑", Font.BOLD, 20);
		initGlobalFontSetting(fnt);

		addTable addTable = new addTable("表格");
		addTable.setVisible(true);
	}

	public static void initGlobalFontSetting(Font fnt) {
		FontUIResource fontRes = new FontUIResource(fnt);
		for (@SuppressWarnings("rawtypes")
		Enumeration keys = UIManager.getDefaults().keys(); keys.hasMoreElements();) {
			Object key = keys.nextElement();
			Object value = UIManager.get(key);
			if (value instanceof FontUIResource)
				UIManager.put(key, fontRes);
		}
	}
}
