 

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
//��׼���ڲ���
public class StandardFrameCZ extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected Font titleFont = new Font("��Բ",Font.BOLD,30);
	protected Font normalFont = new Font("����",Font.PLAIN,22);

	public void FrameCZ() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600,400);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
	}
	public StandardFrameCZ() {
		super();
		FrameCZ();
	}
	public StandardFrameCZ(String name) {
		super();
		FrameCZ();
	}
}
