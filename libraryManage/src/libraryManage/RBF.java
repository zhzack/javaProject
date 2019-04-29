package libraryManage;

import java.util.Date;
import java.text.SimpleDateFormat;

import java.awt.Container;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import libraryManage.Start.DataContainer;

//import libraryManage.Start.DataContainer;

public class RBF extends JFrame {
	JPanel[] p = new JPanel[3];
	JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7;
	JButton button0, button1, button2;

	DefaultTableModel m_date;
	JTable m_Table;
	Container container = this.getContentPane();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public RBF() {
		super("����");
		setSize(800, 600);
		// setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// ������ʾ����

		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		for (int i = 0; i < 3; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			container.add(p[i]);
		}
		final SimpleDateFormat df = new SimpleDateFormat("MM-dd");// �������ڸ�ʽ
		m_date = new DefaultTableModel();// ����һ���յ����ݱ��
		m_Table = new JTable(m_date);

		m_date.addColumn("���");
		m_date.addColumn("����");
		m_date.addColumn("����");
		m_date.addColumn("��������");
		m_date.addColumn("ҳ��");
		m_date.addColumn("�۸�");
		m_date.addColumn("����ʱ��");
		m_Table.setPreferredScrollableViewportSize(new Dimension(800, 350));
		// m_Table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);
		DataContainer.users.get(DataContainer.isLogin);
//		try {

		for (int i = 0; i < Users.userbooks.length; i++) {
			if (Users.userbooks[i] != null) {
				Book books = Users.userbooks[i];
				Object[] b_data = { books.getBookNum() + "", books.getBookName() + "", books.kindBook() + "",
						books.getDeadTime() + "", books.getBookPages() + "", books.getBookPrice() + "",
						books.getDate() };

				m_date.addRow(b_data);
				m_Table.setRowHeight(35);
				DefaultTableCellRenderer r = new DefaultTableCellRenderer();
				r.setHorizontalAlignment(JLabel.CENTER);
				m_Table.setDefaultRenderer(Object.class, r);

			}
		}
//		} catch (Exception e) {
//			 
//		}

		for (int i = 0; i < 6; i++) {// �����п�
			TableColumnModel cm = m_Table.getColumnModel();
			// �õ���i���ж���
			javax.swing.table.TableColumn column = cm.getColumn(i);

			column.setWidth(80);
		}
		JScrollPane jScrollPane = new JScrollPane(m_Table);
		jLabel = new JLabel("��Ҫ�黹���鼮Ϊ��");
		jLabel2 = new JLabel(" ");
		jLabel3 = new JLabel("��ʾ����������ѡ����Ҫ�黹���鼮");
		jLabel4 = new JLabel("");
		jLabel5 = new JLabel("��ǰʱ�䣺" + df.format(new Date()));
//		jLabel6 = new JLabel("�Ƿ�����");
//		jLabel7 = new JLabel(" ");

		button0 = new JButton("ȷ��");
		button1 = new JButton("����");
		button2 = new JButton("������");
		button0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				DataContainer.users.get(DataContainer.isLogin);
				int days = Users.userbooks[m_Table.getSelectedRow()].CalculationT(df.format(new Date()));
				double money = Users.userbooks[m_Table.getSelectedRow()].Calculation(days);
				JOptionPane.showMessageDialog(null, "����Ҫ֧���Ľ��Ϊ�� " + money + "Ԫ");

			}
		});
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new Library();
//				DataContainer.frames.add(library);
				dispose();
			}
		});
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					int a = m_Table.getSelectedRow();
					DataContainer.users.get(DataContainer.isLogin);
					if (Users.userbooks[a].Damage) {
						button2.setText("������");
					} else {
						button2.setText("������");
					}
					Users.userbooks[a].setDamage();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
		p[0].add(jScrollPane);
		p[0].add(jLabel3);
		p[1].add(jLabel);
		p[1].add(jLabel2);
		p[1].add(jLabel5);
		p[2].add(button0);
		p[2].add(button2);
		p[2].add(button1);
		setVisible(true);
	}
}
