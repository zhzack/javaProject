package libraryManage;

import java.awt.BorderLayout;

import java.awt.Container;
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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.FontUIResource;

import libraryManage.Start.DataContainer;

@SuppressWarnings("unused")
public class Login extends JFrame {
	JPanel[] p = new JPanel[4];
	Container container;
	JLabel usernameJLabel, passwordJLabel, jLabelTitle;
	JTextField fieldUser;
	JPasswordField fieldPassword;
	JButton button;

	private static final long serialVersionUID = 1L;

	public Login() {
		super("登录窗口");
		setSize(500, 250);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口

		jLabelTitle = new JLabel("欢迎使用郑治的系统");
		usernameJLabel = new JLabel("用户名：");
		passwordJLabel = new JLabel(" 密   码：");
		fieldUser = new JTextField(10);
		fieldPassword = new JPasswordField(10);
		button = new JButton("登录");
		button.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				for (Users users : DataContainer.users) {
					// System.out.println(users.getUsername());
					int i = 0;
					if (users.getUsername().equals(fieldUser.getText())) {
						if (users.getPassword().equals(fieldPassword.getText())) {
							DataContainer.isLogin = i;
							new Library();
//							DataContainer.frames.add(library);
							dispose();
						}
					}
					i++;
				} // Test
				if (DataContainer.isLogin == -1) {
					JOptionPane.showMessageDialog(null, "您的账号或密码不正确", "错误", JOptionPane.ERROR_MESSAGE);
				}

			}
		});

		container = this.getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		for (int i = 0; i < 3; i++) {
			p[i] = new JPanel();
			p[i].setLayout(new FlowLayout());
			container.add(p[i]);
		}

		p[3] = new JPanel();
		p[3].setLayout(new BorderLayout());
		container.add(p[3]);

		p[0].add(jLabelTitle);
		p[1].add(usernameJLabel);
		p[1].add(fieldUser);
		p[2].add(passwordJLabel);
		p[2].add(fieldPassword);
		p[3].add(button, BorderLayout.SOUTH);

	}

	// 设置全局字体
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
