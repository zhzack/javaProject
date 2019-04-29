package com.hupeng.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.InitialContext;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class BorrowFrame extends StandardFrame {
		private JLabel TitleJLabel = new JLabel("借阅图书");
		private JLabel BorrowNumberJLabel = new JLabel("借阅编号      ");
		private JTextField BorrowNumberJTextField = new JTextField(15); 
		private JLabel BorrowerNameJLabel = new JLabel("借阅人        ");
		private JTextField BorrowerNameJTextField = new JTextField(15);
		private JLabel BorrowBookNameJLabel = new JLabel("借阅刊物      ");
		private JTextField BorrowBookNameJtField = new JTextField(15);
		private JLabel BorrowDateJLabel = new JLabel("借阅时间      ");
		private JTextField borrowDateJTextField = new JTextField(15);
		private JLabel EstimatedReturnDateJLabel = new JLabel("预计归还时间  ");
		private JTextField EstimatedReturnDateJTextField = new JTextField(15);
		private JLabel PaymentAmountJLabel = new JLabel("支付金额      ");
		private JTextField paymentAmountJTextField = new JTextField(15);
		private JButton subbButton = new JButton("提交");
		Box box0 = Box.createVerticalBox();
		Box box1 = Box.createHorizontalBox();
		Box box2 = Box.createHorizontalBox();
		Box box3 = Box.createHorizontalBox();
		Box box4 = Box.createHorizontalBox();
		Box box5 = Box.createHorizontalBox();
		Box box6 = Box.createHorizontalBox();
		Box box7 = Box.createHorizontalBox();
		Box box8 = Box.createHorizontalBox();
		private void init() {
			setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
			TitleJLabel.setFont(titleFont);
			BorrowNumberJLabel.setFont(normalFont);
			BorrowNumberJTextField.setFont(normalFont);
			BorrowerNameJLabel.setFont(normalFont);
			BorrowerNameJTextField.setFont(normalFont);
			BorrowBookNameJLabel.setFont(normalFont);
			BorrowBookNameJtField.setFont(normalFont);
			BorrowBookNameJLabel.setFont(normalFont);
			BorrowBookNameJtField.setFont(normalFont);
			BorrowDateJLabel.setFont(normalFont);
			borrowDateJTextField.setFont(normalFont);
			EstimatedReturnDateJLabel.setFont(normalFont);
			EstimatedReturnDateJTextField.setFont(normalFont);
			PaymentAmountJLabel.setFont(normalFont);
			paymentAmountJTextField.setFont(normalFont);
			subbButton.setFont(normalFont);
			box1.add(TitleJLabel);
			box2.add(BorrowNumberJLabel);
			box2.add(BorrowNumberJTextField);
			box3.add(BorrowerNameJLabel);
			box3.add(BorrowerNameJTextField);
			box4.add(BorrowBookNameJLabel);
			box4.add(BorrowBookNameJtField);
			box5.add(BorrowDateJLabel);
			box5.add(borrowDateJTextField);
			box6.add(EstimatedReturnDateJLabel);
			box6.add(EstimatedReturnDateJTextField);
			box7.add(PaymentAmountJLabel);
			box7.add(paymentAmountJTextField);
			box8.add(subbButton);
			box0.add(box1);
			box0.add(Box.createVerticalStrut(30));
			box0.add(box2);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box3);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box4);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box5);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box6);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box7);
			box0.add(Box.createVerticalStrut(10));
			box0.add(box8);
			add(box0);
			subbButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					BookList bookBookList = new BookList();
					int state = bookBookList.borrowBook(BorrowBookNameJtField.getText());
					if (state==BookList.noexist) {
						JOptionPane.showMessageDialog(null,"借阅失败，不存在该图书");
					}
					else if(state==BookList.borrowSuccess) {
						JOptionPane.showMessageDialog(null,"借阅图书成功");
					}
					else if(state==BookList.borrowed) {
						JOptionPane.showMessageDialog(null,"借阅失败，该图书已被借走");
					}
					else if(state==BookList.damaged) {
						JOptionPane.showMessageDialog(null,"借阅失败，该图书已损坏");
					}
				}
			});
			
		}
		public BorrowFrame() {
			super();
			init();
		}
		public BorrowFrame(String name) {
			super(name);
			init();
		}
}
