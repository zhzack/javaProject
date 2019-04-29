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
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.WindowConstants;
import javax.swing.plaf.FontUIResource;

import java.awt.Container;;

public class Login extends JFrame implements ActionListener {
	JPanel[] p = new JPanel[4];
	Container container;
	JLabel usernameJLabel, passwordJLabel, jLabelTitle;
	JTextField fieldUser;
	JPasswordField fieldPassword;
	JButton button;
//	JPanel jPanel, jPanel2, jPanel3, jPanel4;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Login(String titleString) {
		super(titleString);
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
		button.addActionListener(this);

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

	public void actionPerformed(ActionEvent e) {
		if (usernameJLabel.getText().equals("123") && passwordJLabel.getText().equals("123")) {

			JOptionPane.showMessageDialog(null, "登陆成功");
		} else {
			JOptionPane.showMessageDialog(null, "登陆失败");
		}

	}

	public static void main(String[] args) {
		Font fnt = new Font("微软雅黑", Font.BOLD, 20);
		initGlobalFontSetting(fnt);

		Login login = new Login("登录窗口");
		login.setVisible(true);
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
