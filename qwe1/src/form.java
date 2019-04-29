
import java.awt.BorderLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class form extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel a, b, c;
	JTextField stuNum, stuName, stuAge;
	JButton jbu;
	JTable table;
	DefaultTableModel tableModel;

	public form(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setSize(360, 360);
		setLayout(new BorderLayout());
		setLocationRelativeTo(getOwner());
		Box bodyBox = Box.createVerticalBox();
		add(bodyBox, BorderLayout.NORTH);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		// ��ǩ������
		Box boxtitle = Box.createHorizontalBox();
		a = new JLabel("ѧ�ţ�");
		b = new JLabel("������");
		c = new JLabel("����");
		stuNum = new JTextField();
		stuName = new JTextField();
		stuAge = new JTextField();
		jbu = new JButton("���");
		boxtitle.add(a);
		boxtitle.add(stuNum);
		boxtitle.add(b);
		boxtitle.add(stuName);
		boxtitle.add(c);
		boxtitle.add(stuAge);
		boxtitle.add(jbu);
		bodyBox.add(boxtitle);

		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);
		table.setRowHeight(30);
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		String[] heaStrings = { "ѧ��", "����", "����" };
		for (String head : heaStrings) {
			tableModel.addColumn(head);
		}

		jbu.addActionListener(this);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent arg0) {

		Object[] date = { stuNum.getText(), stuName.getText(), stuAge.getText() };
		if (stuNum.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "ѧ�Ų���Ϊ��");
		} else {
			tableModel.addRow(date);
			stuNum.setText(null);
			stuName.setText(null);
			stuAge.setText(null);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new form("������");
	}
}
