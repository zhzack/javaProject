package libraryManage;

import java.awt.BorderLayout;

import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javax.swing.WindowConstants;

import libraryManage.Start.DataContainer;

public class registered extends JFrame {
	JPanel[] p = new JPanel[5];
	Container container;
	JLabel usernameJLabel, passwordJLabel, passwordJLabel1, jLabelTitle;
	JTextField fieldUser;
	JPasswordField fieldPassword0, fieldPassword1;
	JButton button;

	private static final long serialVersionUID = 1L;

	public registered() {
		super("ע��");
		setSize(500, 250);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// ������ʾ����

		jLabelTitle = new JLabel("��ӭע��");
		usernameJLabel = new JLabel(" �û���   ��");
		passwordJLabel = new JLabel(" ��   ��   ��");
		passwordJLabel1 = new JLabel("�ٴ����룺");
		fieldUser = new JTextField(10);
		fieldPassword0 = new JPasswordField(10);
		fieldPassword1 = new JPasswordField(10);
		button = new JButton("ע��");
		button.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				 boolean b=false;//����û���������
				for (Users users : DataContainer.users) {
					if (users.getUsername().equals(fieldUser.getText())) {
						JOptionPane.showMessageDialog(null,"�û����Ѵ���", "����",  JOptionPane.ERROR_MESSAGE);
						fieldUser.setText(null);
					} else {
						if (fieldPassword0.getText().equals(fieldPassword1.getText())) {
							b=true;
							
						} else {
							JOptionPane.showMessageDialog(null, "�������벻��ͬ", "����", JOptionPane.ERROR_MESSAGE);
						}
					}
				}
				if (b) {
					DataContainer.users.add(new Users(fieldUser.getText(), fieldPassword0.getText()));
					new Login().show();
					dispose();
				}
			}
		});

		container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		for (int i = 0; i < 4; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			container.add(p[i]);
		}

		p[4] = new JPanel();
		p[4].setLayout(new BorderLayout());
		container.add(p[4]);

		p[0].add(jLabelTitle);
		p[1].add(usernameJLabel);
		p[1].add(fieldUser);
		p[2].add(passwordJLabel);
		p[2].add(fieldPassword0);
		p[3].add(passwordJLabel1);
		p[3].add(fieldPassword1);
		p[4].add(button, BorderLayout.SOUTH);

	}

}
