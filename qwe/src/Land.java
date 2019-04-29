
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Land extends JFrame implements ActionListener {

	JLabel title, user, pwd;
	JTextField username;
	JPasswordField password;
	JButton sign;

	public Land(String title) {

		super(title);
		setSize(300, 150);
		setLayout(new BorderLayout());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(getOwner());

		JPanel panelmain = new JPanel();
		BoxLayout boxLayout = new BoxLayout(panelmain, BoxLayout.Y_AXIS);
		panelmain.setLayout(boxLayout);

		this.title = new JLabel("»¶Ó­Ê¹ÓÃXXÏµÍ³");
		Box titelBox = Box.createHorizontalBox();
		Box bodyBox = Box.createHorizontalBox();
		Box leftBox = Box.createVerticalBox();
		Box rightBox = Box.createVerticalBox();

		titelBox.add(Box.createHorizontalGlue());
		titelBox.add(this.title);
		titelBox.add(Box.createHorizontalGlue());

		panelmain.add(titelBox);
		panelmain.add(bodyBox);
		bodyBox.add(leftBox);
		bodyBox.add(rightBox);

		user = new JLabel("ÓÃ»§Ãû£º");
		pwd = new JLabel("ÃÜÂë£º");
		leftBox.add(user);
		leftBox.add(Box.createVerticalGlue());
		leftBox.add(pwd);
		leftBox.add(Box.createVerticalGlue());

		username = new JTextField();
		password = new JPasswordField();
		rightBox.add(username);
		rightBox.add(password);

		sign = new JButton("µÇÂ¼");
		add(panelmain, BorderLayout.CENTER);
		add(sign, BorderLayout.SOUTH);
		setVisible(true);

		sign.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {

		if (username.getText().equals("admin") && password.getText().equals("123")) {
			JOptionPane.showMessageDialog(null, "µÇÂ½³É¹¦");
		} else {
			JOptionPane.showMessageDialog(null, "µÇÂ¼Ê§°Ü");
		}
	}

	public static void main(String[] args) {
		new Land("ºúºÀç÷");
	}
}
