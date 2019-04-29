 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

 

public class ReturnFrameCZ extends StandardFrameCZ {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel titleJLabel = new JLabel("�黹ͼ��");
	private JLabel returnBookNameJLabel = new JLabel("ͼ������    ");
	private JTextField returnBookNameJTextField = new JTextField(15);
	private JLabel returnBookDateJLabel = new JLabel("�黹ʱ��    ");
	private JTextField returnBookDateJTextField = new JTextField(15); 
	private JLabel payPriceJLabel = new JLabel("Ӧ֧�����  ��0");
	private JButton subButton = new JButton("�ύ");
	Box box0 = Box.createVerticalBox();
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();
	Box box3 = Box.createHorizontalBox();
	Box box4 = Box.createHorizontalBox();
	Box box5 = Box.createHorizontalBox();
	private void init() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		titleJLabel.setFont(titleFont);
		returnBookNameJLabel.setFont(normalFont);
		returnBookNameJTextField.setFont(normalFont);
		returnBookDateJLabel.setFont(normalFont);
		returnBookDateJTextField.setFont(normalFont);
		returnBookDateJTextField.setText("��д����,��0");
		payPriceJLabel.setFont(normalFont);
		subButton.setFont(normalFont);
		box1.add(titleJLabel);
		box2.add(returnBookNameJLabel);
		box2.add(returnBookNameJTextField);
		box3.add(payPriceJLabel);
		box4.add(subButton);
		box5.add(returnBookDateJLabel);
		box5.add(returnBookDateJTextField);
		box0.add(box1);
		box0.add(Box.createVerticalStrut(30));
		box0.add(box2);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box5);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box3);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box4);
		add(box0);
		subButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				int state;
				BookList bookList = new BookList();
				try {
						state = bookList.returnBook(returnBookNameJTextField.getText(),Integer.parseInt(returnBookDateJTextField.getText()) );
				}
				catch (NumberFormatException n) {
					returnBookDateJTextField.setText("0");
					JOptionPane.showMessageDialog(null,"����д��ȷ�Ĺ黹����");
					return;
				}
				if(state==BookList.noexist) {
					JOptionPane.showMessageDialog(null,"�黹ͼ��ʧ�ܣ������ڸ�ͼ��");
				}
				else if(state==BookList.returnSuccess) {
					JOptionPane.showMessageDialog(null,"�黹ͼ��ɹ�");
					payPriceJLabel.setText(payPriceJLabel.getText().substring(0, 7)+bookList.caculatePrice(returnBookNameJTextField.getText())+"");
				}
				else if(state==BookList.exist) {
					JOptionPane.showMessageDialog(null,"ͼ���ѳɹ��黹�������ظ��黹");
				}
			}
		});
		
	}
	public ReturnFrameCZ() {
		super();
		init();
	}
	public ReturnFrameCZ(String name) {
		super(name);
		init();
	}
}
