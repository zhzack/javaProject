package com.hupeng.java;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JLabel;

public class MainFrame extends StandardFrame {
	private JLabel titieJLabel = new JLabel("图书管理系统");
	private JButton borrowButton = new JButton("借阅图书");
	private JButton returnButton = new JButton("归还图书");
	private JButton reportLossButton = new JButton("报损图书");
	private BorrowFrame borrowFrame = new BorrowFrame("借阅图书");
	private ReportLossFrame reportLossFrame = new ReportLossFrame("报损图书");
	Box box0 = Box.createVerticalBox();
	Box box1 = Box.createHorizontalBox();
	Box box2 = Box.createHorizontalBox();
	Box box3 = Box.createHorizontalBox();
	Box box4 = Box.createHorizontalBox();
	private void init() {
		titieJLabel.setFont(titleFont);
		borrowButton.setFont(normalFont);
		returnButton.setFont(normalFont);
		reportLossButton.setFont(normalFont);
		borrowButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				borrowFrame.setVisible(true);
				
			}
		});
		returnButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ReturnFrame returnFrame = new ReturnFrame();
				returnFrame.setVisible(true);
			}
		});
		reportLossButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				reportLossFrame.setVisible(true);
				
			}
		});
		box1.add(titieJLabel);
		box2.add(borrowButton);
		box3.add(returnButton);
		box4.add(reportLossButton);
		box0.add(box1);
		box0.add(Box.createVerticalStrut(30));
		box0.add(box2);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box3);
		box0.add(Box.createVerticalStrut(10));
		box0.add(box4);
		add(box0);
	}
	public MainFrame() {
		super();
		init();
	}
	public MainFrame(String name) {
		super(name);
		init();
	}
}
