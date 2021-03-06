import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.*;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

/**
 * 计算器 随机生成题，计算答案，并判断
 *
 */
class MyGuessCalc extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	JLabel labelNum1 = new JLabel("3");
	JLabel labelNum2 = new JLabel("5");
	JLabel labelOption = new JLabel("+");
	JLabel labelAns = new JLabel(" 答案是：");
	JTextField txtRes = new JTextField(5);

	JLabel labelTip = new JLabel("提示信息");

	JButton btnCheck = new JButton("检查");
	JButton btnNew = new JButton("刷新");

	public MyGuessCalc() {
		super("两数计算");
		setSize(500, 250);

		// 设置流动布局
		setLayout(new FlowLayout());
		// 纵向盒子
		Box boxMain = Box.createVerticalBox();
		// 创建多个横向盒子
		Box boxTitle = Box.createHorizontalBox();
		Box boxNums = Box.createHorizontalBox();
		Box boxTip = Box.createHorizontalBox();
		Box boxBtn = Box.createHorizontalBox();
		add(boxMain);
		boxMain.add(boxTitle);
		boxMain.add(Box.createVerticalStrut(10));// 添加垂直间距
		boxMain.add(boxNums);
		boxMain.add(Box.createVerticalStrut(10));// 添加垂直间距
		boxMain.add(boxTip);
		boxMain.add(Box.createVerticalStrut(10));// 添加垂直间距
		boxMain.add(boxBtn);

		boxTitle.add(new JLabel("10以内的加减乘除练习"));

		boxNums.add(labelNum1);
		boxNums.add(labelOption);
		boxNums.add(labelNum2);
		boxNums.add(labelAns);
		boxNums.add(txtRes);

		boxTip.add(labelTip);

		// 添加按钮事件监听
		btnCheck.addActionListener(this);
		btnNew.addActionListener(this);
		btnNew.setEnabled(false);// 默认禁用
		boxBtn.add(btnCheck);
		boxBtn.add(btnNew);

		setLocationRelativeTo(null);// 居中显示
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		int a = Integer.parseInt(labelNum1.getText());
		int b = Integer.parseInt(labelNum2.getText());
		int c = 0;// 初始化运算符为“+”
		int d;
		int res = 0;// 初始化结果为零
		String[] optionString = { "+", "-", "*", "/" };

		if (txtRes.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "请输入你的答案");
		} else {
			if (e.getActionCommand() == "检查") {
				d = Integer.parseInt(txtRes.getText());
				for (int i = 0; i < optionString.length; i++) {
					if (labelOption.getText().equals(optionString[i])) {
						c = i;// 判断运算符
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
					labelTip.setText("答案正确");
					btnNew.setEnabled(true);// 解除禁用

				} else {
					labelTip.setForeground(Color.RED);
					labelTip.setText("答案错误！！！请重新回答");

				}
			} else if (e.getActionCommand() == "刷新") {
				double a1 = Math.random() * 100;
				double b1 = Math.random() * 100;
				double c1 = Math.random() * 100;
				a = (int) a1 % 10;
				b = (int) b1 % 10;
				c = (int) c1 % 4;
				if (c == 3) {
					if (b == 0) {
						c++;// 规避被除数为零的情况
					}
				}
				txtRes.setText(null);
				System.out.println(a + b + c + a1);
				labelNum1.setText(String.valueOf(a));
				labelNum2.setText(String.valueOf(b));
				labelOption.setText(optionString[c]);
				labelTip.setForeground(Color.BLACK);
				labelTip.setText("提示信息");
				btnNew.setEnabled(false);
			}
		}

	}

}

public class Trial_09_calc {

	public static void main(String[] args) {
		Font fnt = new Font("微软雅黑", Font.BOLD, 20);
		initGlobalFontSetting(fnt);

		new MyGuessCalc();
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
