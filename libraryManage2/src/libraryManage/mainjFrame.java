package libraryManage;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.WindowConstants;

import libraryManage.Start.DataContainer;

public class mainjFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button0, button1, button2, button3, button4;
	Container container = this.getContentPane();
	//Library library = new Library();

	public mainjFrame(String titleString) {
		super(titleString);
		setSize(300, 200);
		setResizable(false);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);// 居中显示窗口

		container.setLayout(new FlowLayout(FlowLayout.CENTER));

		button0 = new JButton("登录");
		button1 = new JButton("注册");
//		button2 = new JButton("借阅");
//		button3 = new JButton("归还");
		button4 = new JButton("退出");
		Box boxMain = Box.createVerticalBox();// 纵向布局的盒子
		boxMain.add(Box.createVerticalStrut(30));
//		上下部件之间的中间间隔就可以用这个方法来控制创建一个不可见的、固定高度的组件。
		Object[] btnObjects = { button0, button1, button4 };
		button0.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {				 
				Login login = new Login( );
				DataContainer.frames.add(login);
				login.setVisible(true);
				dispose();
			}
		});
		button1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				registered re = new registered();
				DataContainer.frames.add(re);
				re.setVisible(true);
				dispose();
			}
		});
		button4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		for (int i = 0; i < btnObjects.length; i++) {
			boxMain.add((Component) btnObjects[i]);

			boxMain.add(Box.createVerticalStrut(10));
		}

		container.add(boxMain);

		setVisible(true);
	}

}
