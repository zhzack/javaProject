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
		setLocationRelativeTo(null);// ������ʾ����

		container.setLayout(new FlowLayout(FlowLayout.CENTER));

		button0 = new JButton("��¼");
		button1 = new JButton("ע��");
//		button2 = new JButton("����");
//		button3 = new JButton("�黹");
		button4 = new JButton("�˳�");
		Box boxMain = Box.createVerticalBox();// ���򲼾ֵĺ���
		boxMain.add(Box.createVerticalStrut(30));
//		���²���֮����м����Ϳ�����������������ƴ���һ�����ɼ��ġ��̶��߶ȵ������
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
