package libraryManage;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.text.SimpleDateFormat;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
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

public class BBF extends JFrame {
	JPanel[] p = new JPanel[3];
	JLabel jLabel, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7;
	JComboBox<Integer> comboBox;
	JButton button0, button1, button2;
	DefaultTableModel m_date;
	JTable m_Table;
	Container container = this.getContentPane();
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void DateShow() {

	}

	public BBF() {
		super("借阅");
		setSize(1100, 600);
		// setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口

		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		for (int i = 0; i < 3; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			container.add(p[i]);
		}

		m_date = new DefaultTableModel();// 创建一个空的数据表格
		m_Table = new JTable(m_date);

		m_date.addColumn("编号");
		m_date.addColumn("书名");
		m_date.addColumn("类型");
		m_date.addColumn("借阅期限");
		m_date.addColumn("页数");
		m_date.addColumn("价格");
		m_date.addColumn("借阅状态");
		m_date.addColumn("借阅时间");

		final SimpleDateFormat df = new SimpleDateFormat("MM-dd");// 设置日期格式

		m_Table.setPreferredScrollableViewportSize(new Dimension(1100, 350));
		// m_Table.setAutoResizeMode(JTable.AUTO_RESIZE_SUBSEQUENT_COLUMNS);

		for (Book books : DataContainer.books) {
			Object[] b_data = { books.getBookNum() + "", books.getBookName() + "", books.kindBook(),
					books.getDeadTime() + "", books.getBookPages() + "", books.getBookPrice() + "", books.getBorrowed(),
					books.getDate() };
			m_date.addRow(b_data);// 添加数据
			m_Table.setRowHeight(35);// 设置行高

			// 数据居中显示
			DefaultTableCellRenderer r = new DefaultTableCellRenderer();
			r.setHorizontalAlignment(JLabel.CENTER);
			m_Table.setDefaultRenderer(Object.class, r);

			TableColumnModel cm = m_Table.getColumnModel();
			// 得到第i个列对象
			for (int i = 0; i < b_data.length; i++) {// 设置列宽
				javax.swing.table.TableColumn column = cm.getColumn(i);
//				column.setPreferredWidth(50);
//				column.setMaxWidth(100);
//				column.setMinWidth(80);
				column.setWidth(80);
			}

		}

		JScrollPane jScrollPane = new JScrollPane(m_Table);
		jLabel = new JLabel("您选中的书为：");
		jLabel2 = new JLabel(" ");
		jLabel3 = new JLabel("提示操作：请点击选择您要借阅的书籍");
		jLabel4 = new JLabel("");
		jLabel5 = new JLabel("预计归还时间：");
		jLabel6 = new JLabel("天");
		button0 = new JButton("选择");
		button1 = new JButton("返回");
		button2 = new JButton("确定");
		comboBox = new JComboBox<Integer>();
		comboBox.setVisible(false);
		for (int i = 0; i < 30; i++) {
			comboBox.addItem(i + 1);
		}
		comboBox.setSelectedIndex(2);// 默认预计归还时间为三天
		button0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				comboBox.setVisible(true);
				try {
//					获取你选中的行号（记录）m_Table.getSelectedRow()
//					读取你获取行号的某一列的值（也就是字段）m_Table.getValueAt(m_Table.getSelectedRow(), 1).toString());
					jLabel2.setText(m_Table.getValueAt(m_Table.getSelectedRow(), 1).toString());

				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				new Library();
//				DataContainer.frames.add(library);
				dispose();
			}
		});
		button2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
//	获取你选中的行号（记录）m_Table.getSelectedRow()
//	读取你获取行号的某一列的值（也就是字段）m_Table.getValueAt(m_Table.getSelectedRow(), 1).toString());
					jLabel2.setText(m_Table.getValueAt(m_Table.getSelectedRow(), 1).toString());
					try {
						int a = Integer.parseInt((String) m_Table.getValueAt(m_Table.getSelectedRow(), 0));
						if (!DataContainer.books.get(a).isBorrowed()) {
							DataContainer.users.get(DataContainer.isLogin);
							Users.userbooks[DataContainer.users
									.get(DataContainer.isLogin).booknumber] = DataContainer.books.get(a);
							DataContainer.users.get(DataContainer.isLogin).booknumber++;// 借阅成功，借阅人所借书的数量加一；
							String timeString = df.format(new Date());
							m_Table.setValueAt("已被借", a, 6);
							m_Table.setValueAt(timeString, a, 7);
							JOptionPane.showMessageDialog(null, "恭喜您，您已经成功借阅："
									+ m_Table.getValueAt(m_Table.getSelectedRow(), 1).toString() + " ，请在规定时间内归还");

							DataContainer.books.get(a).setBorrowed(true);
							DataContainer.books.get(a).setDate(timeString);

						}

					} catch (Exception e2) {

						JOptionPane.showMessageDialog(null, "每个人只能借阅三本书哦，把借的书看完再来吧 ！");
					}

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
		p[1].add(comboBox);
		p[1].add(jLabel6);
		p[2].add(button0);
		p[2].add(button2);
		p[2].add(button1);
		setVisible(true);
	}
}
