package libraryManage;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javax.swing.WindowConstants;

public class Library extends JFrame {
	JPanel[] p = new JPanel[3];
	Container container;
	JLabel jLabelTitle;
	JButton btnBorrowBook, btnReturnBook, btnExit;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Library() {
		super("֣�ε�ͼ��ݹ�����");
		setSize(500, 250);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// ������ʾ����

		container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		for (int i = 0; i < 3; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			container.add(p[i]);
		}

		jLabelTitle = new JLabel("��ӭʹ��֣�ε�ϵͳ");
		btnBorrowBook = new JButton("����");
		btnBorrowBook.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				BorrowBook();
			}
		});
		btnReturnBook = new JButton("�黹");
		btnReturnBook.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				ReturnBook();
			}
		});
		btnExit = new JButton("�˳�");
		btnExit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				Exit();

			}
		});

		p[0].add(btnBorrowBook);
		p[1].add(btnReturnBook);
		p[2].add(btnExit);

		setVisible(true);
	}

	public void BorrowBook() {
		// TODO Auto-generated constructor stub
	}

	public void ReturnBook() {
		// TODO Auto-generated constructor stub
	}

	public void Damaged() {
		// TODO Auto-generated constructor stub
	}

	public void Exit() {
		System.exit(0);
	}
}
