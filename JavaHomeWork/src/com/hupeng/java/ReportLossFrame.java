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
	private JLabel titleJLabel = new JLabel("�����鼮");
	private JLabel bookNameLabel = new JLabel("ͼ������    ");
	private JTextField bookNameJTextField = new JTextField(15);
	private JLabel bookTypeJLabel = new JLabel("ͼ������    ");
	private String[] bookTypesStrings = {"��ͨͼ��","��ʦ����"};
	private JComboBox<String>bookTypeJComboBox = new JComboBox<String>(bookTypesStrings);
	private JLabel lossPageJLabel = new JLabel("��ҳ��    ");
	private JTextField lossPageJTextField = new JTextField(15);
	private JButton subJButton = new JButton("�ύ");
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
		//���ò��ֿؼ����ɼ�
		box4.setVisible(false);
		//����ѡ����ѡ���¼�
		bookTypeJComboBox.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange() ==ItemEvent.SELECTED) {
					if(e.getItem().equals("��ͨͼ��")) {
						box4.setVisible(false);
					}
					else {
						box4.setVisible(true);
					}
				}
				
			}
		});
		//�ύ��ť����¼�
		subJButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		//��ӿؼ�
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
						JOptionPane.showMessageDialog(null,"����,����д��ȷ����ҳ��");
						return;
					}
				
				
				}
				else {
					state = bookList.ReportLossBook(bookNameJTextField.getText());	
				}
				if(state==BookList.noexist) {
					JOptionPane.showMessageDialog(null,"����ʧ�ܣ������ڸ�ͼ��");
				}
				else if(state==BookList.reportLossSuccess) {
					JOptionPane.showMessageDialog(null,"����ͼ��ɹ�");
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
