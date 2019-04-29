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
		setLocationRelativeTo(null);// ������ʾ����
		// getContentPane().setBackground(Color.YELLOW);
		// setLayout(new FlowLayout(FlowLayout.LEFT));

		stuNumJLabel = new JLabel("ѧ��:");
		stuNameJLabel = new JLabel("����:");
		stuAgeJLabel = new JLabel("����:");

		stuAgeField = new JTextField(8);
		stuNameField = new JTextField(8);
		stuNumField = new JTextField(8);

		stuNumField.setText(null);
		stuNameField.setText(null);
		stuAgeField.setText(null);
		JButton button = new JButton("���");
		button.addActionListener(this);
		// listModel.addElement("ѧ�ţ�����������");

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

		m_date = new DefaultTableModel();// ����һ���յ����ݱ��
		m_Table = new JTable(m_date);
//		m_Table.setPreferredScrollableViewportSize(new Dimension(300, 150));
//		m_Table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane jScrollPane = new JScrollPane(m_Table);
//		Object object0= {"ѧ��","����","����"}
		m_date.addColumn("ѧ��");
		m_date.addColumn("����");
		m_date.addColumn("����");
		jPanel2.add(jScrollPane);

	}

	public void actionPerformed(ActionEvent e) {

		if (stuNumField.getText().isEmpty()) {
//			jTextField1.getText().equals("");
//			��
//			jTextField1.getText().length()==0; 
//			�������ж��ı���������Ƿ�Ϊ��ʱ���������ַ���������ʹ�ã�
//			���ѡ����isEmpty���ж�
			JOptionPane.showMessageDialog(null, "ѧ�Ų���Ϊ��");

		} else {
			Object[] object = { stuNumField.getText(), stuNameField.getText(), stuAgeField.getText() };
			m_date.addRow(object);
			stuNumField.setText(null);
			stuNameField.setText(null);
			stuAgeField.setText(null);
		}

	}

	public static void main(String[] args) {
		Font fnt = new Font("΢���ź�", Font.BOLD, 20);
		initGlobalFontSetting(fnt);

		addTable addTable = new addTable("���");
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
