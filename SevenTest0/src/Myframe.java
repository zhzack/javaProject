import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Myframe extends JFrame {
	
	public Myframe(String name) {
		super(name);
		setSize(500, 500);
		setLocation(200, 200);
		setResizable(false);
		getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		//��һ�ַ���
//		JFrame frame = new JFrame("jframe and jlable");
//		frame.setSize(500, 500);
//		frame.setLocation(200, 200);
//		frame.setResizable(false);
//		frame.getContentPane().setBackground(Color.YELLOW);
//		frame.setLayout(null);
//		JLabel jLabel = new JLabel("hello label");
//		jLabel.setOpaque(true);
//		jLabel.setHorizontalAlignment(SwingConstants.CENTER);
//		jLabel.setLocation(200, 200);
//		jLabel.setSize(90, 90);
//		jLabel.setBackground(Color.RED);
//		jLabel.setForeground(Color.blue);

//		frame.add(jLabel);
//		frame.setVisible(true);
		//�ڶ��ַ���
		Myframe myframe=new Myframe("ͨ���̳�ʵ��");
		JLabel jLabel1 = new JLabel("hello �̳�");
		jLabel1.setOpaque(true);
		jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		jLabel1.setLocation(200, 200);
		jLabel1.setSize(90, 90);
		jLabel1.setBackground(Color.RED);
		jLabel1.setForeground(Color.blue);

		myframe.add(jLabel1);
		myframe.setVisible(true);
		
		

	}
}
