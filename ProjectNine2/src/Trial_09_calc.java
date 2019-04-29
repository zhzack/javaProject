import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

/**
 * ������ ��������⣬����𰸣����ж�
 *
 */
class MyGuessCalc extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel labelNum1 = new JLabel("3");
	JLabel labelNum2 = new JLabel("5");
	JLabel labelOption = new JLabel("+");
	JLabel labelAns = new JLabel(" ���ǣ�");
	JTextField txtRes = new JTextField(5);

	JLabel labelTip = new JLabel("��ʾ��Ϣ");

	JButton btnCheck = new JButton("���");
	JButton btnNew = new JButton("ˢ��");

	public MyGuessCalc() {
		super("��������");
		setSize(500, 250);

		// ������������
		setLayout(new FlowLayout());
		// �������
		Box boxMain = Box.createVerticalBox();
		// ��������������
		Box boxTitle = Box.createHorizontalBox();
		Box boxNums = Box.createHorizontalBox();
		Box boxTip = Box.createHorizontalBox();
		Box boxBtn = Box.createHorizontalBox();
		add(boxMain);
		boxMain.add(boxTitle);
		boxMain.add(Box.createVerticalStrut(10));// ��Ӵ�ֱ���
		boxMain.add(boxNums);
		boxMain.add(Box.createVerticalStrut(10));// ��Ӵ�ֱ���
		boxMain.add(boxTip);
		boxMain.add(Box.createVerticalStrut(10));// ��Ӵ�ֱ���
		boxMain.add(boxBtn);

		boxTitle.add(new JLabel("10���ڵļӼ��˳���ϰ"));

		boxNums.add(labelNum1);
		boxNums.add(labelOption);
		boxNums.add(labelNum2);
		boxNums.add(labelAns);
		boxNums.add(txtRes);

		boxTip.add(labelTip);

		// ��Ӱ�ť�¼�����
		btnCheck.addActionListener(this);
		btnNew.addActionListener(this);
		btnNew.setEnabled(false);// Ĭ�Ͻ���
		boxBtn.add(btnCheck);
		boxBtn.add(btnNew);

		setLocationRelativeTo(null);// ������ʾ
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(labelNum1.getText());
		int b = Integer.parseInt(labelNum2.getText());
		int c = 0;// ��ʼ�������Ϊ��+��
		int d;
		int res = 0;// ��ʼ�����Ϊ��
		String[] optionString = { "+", "-", "*", "/" };

		if (txtRes.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "��������Ĵ�");
		} else {
			if (e.getActionCommand() == "���") {
				d = Integer.parseInt(txtRes.getText());
				for (int i = 0; i < optionString.length; i++) {
					if (labelOption.getText().equals(optionString[i])) {
						c = i;// �ж������
					}
				}

				switch (c) {
				case 0:
					res = a + b;
					break;
				case 1:
					res = a - b;
					break;
				case 2:
					res = a * b;
					break;
				case 3:
					res = a / b;
					break;

				default:
					break;
				}
				if (res == d) {
					labelTip.setForeground(Color.GREEN);
					labelTip.setText("����ȷ");
					btnNew.setEnabled(true);// �������

				} else {
					labelTip.setForeground(Color.RED);
					labelTip.setText("�𰸴��󣡣��������»ش�");

				}
			} else if (e.getActionCommand() == "ˢ��") {
				double a1 = Math.random() * 100;
				double b1 = Math.random() * 100;
				double c1 = Math.random() * 100;
				a = (int) a1 % 10;
				b = (int) b1 % 10;
				c = (int) c1 % 4;
				if (c == 3) {
					if (b == 0) {
						c++;// ��ܱ�����Ϊ������
					}
				}
				txtRes.setText(null);
				System.out.println(a + b + c + a1);
				labelNum1.setText(String.valueOf(a));
				labelNum2.setText(String.valueOf(b));
				labelOption.setText(optionString[c]);
				labelTip.setForeground(Color.BLACK);
				labelTip.setText("��ʾ��Ϣ");
				btnNew.setEnabled(false);
			}
		}

	}

}

public class Trial_09_calc {

	public static void main(String[] args) {
		Font fnt = new Font("΢���ź�", Font.BOLD, 20);
		initGlobalFontSetting(fnt);

		new MyGuessCalc();
	}

	// ����ȫ������
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
