package com.hupeng.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ReportLossFrame extends StandardFrame {
	private JLabel titleJLabel = new JLabel("报损书籍");
	private JLabel bookNameLabel = new JLabel("图书名称    ");
	private JTextField bookNameJTextField = new JTextField(15);
	private JLabel bookTypeJLabel = new JLabel("图书类型    ");
	private String[] bookTypesStrings = {"普通图书","教师讲义"};
	private JComboBox<String>bookTypeJComboBox = new JComboBox<String>(bookTypesStrings);
	private JLabel lossPageJLabel = new JLabel("损坏页数    ");
	private JTextField lossPageJTextField = new JTextField(15);
	private JButton subJButton = new JButton("提交");
	private Box box0 = Box.createVerticalBox();
	private Box box1 = Box.createHorizontalBox();
	private Box box2 = Box.createHorizontalBox();
	private Box box3 = Box.createHorizontalBox();
	private Box box4 = Box.createHorizontalBox();
	private Box box5 = box0.createHorizontalBox();
	private void init() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		titleJLabel.setFont(titleFont);
		bookNameLabel.setFont(normalFont);
		bookNameJTextField.setFont(normalFont);
		bookTypeJLabel.setFont(normalFont);
		bookTypeJComboBox.setFont(normalFont);
		lossPageJLabel.setFont(normalFont);
		lossPageJTextField.setFont(normalFont);
		subJButton.setFont(normalFont);
		//设置部分控件不可见
		box4.setVisible(false);
		//下拉选择框的选中事件
		bookTypeJComboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() ==ItemEvent.SELECTED) {
					if(e.getItem().equals("普通图书")) {
						box4.setVisible(false);
					}
					else {
						box4.setVisible(true);
					}
				}
				
			}
		});
		//提交按钮点击事件
		subJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		//添加控件
		box1.add(titleJLabel);
		box2.add(bookNameLabel);
		box2.add(bookNameJTextField);
		box3.add(bookTypeJLabel);
		box3.add(bookTypeJComboBox);
		box4.add(lossPageJLabel);
		box4.add(lossPageJTextField);
		
		box5.add(subJButton);
		box0.add(box1);
		box0.add(Box.createVerticalStrut(30));
		box0.add(box2);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box3);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box4);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box5);
		add(box0);
		subJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				BookList bookList = new BookList();
				int state;
				if(lossPageJTextField.isVisible()) {
					try {
						state = bookList.ReportLossBook(bookNameJTextField.getText(), Integer.parseInt(lossPageJTextField.getText()));
					}
					catch (NumberFormatException n) {
						lossPageJTextField.setText("0");
						JOptionPane.showMessageDialog(null,"错误,请填写正确的损坏页数");
						return;
					}
				
				
				}
				else {
					state = bookList.ReportLossBook(bookNameJTextField.getText());	
				}
				if(state==BookList.noexist) {
					JOptionPane.showMessageDialog(null,"报损失败，不存在该图书");
				}
				else if(state==BookList.reportLossSuccess) {
					JOptionPane.showMessageDialog(null,"报损图书成功");
				}
			}
		});
	}
	public ReportLossFrame() {
		super();
		init();
	}
	public ReportLossFrame(String name) {
		super(name);
		init();
	}
}
