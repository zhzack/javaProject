package com.hupeng.java;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
//��׼���ڲ���
public class StandardFrame extends JFrame {
	protected Font titleFont = new Font("��Բ",Font.BOLD,30);
	protected Font normalFont = new Font("����",Font.PLAIN,22);
	//���ڳ�ʼ��
	public void FrameInit() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,600);
		setLocationRelativeTo(null);
		
		setLayout(new FlowLayout());
	}
	public StandardFrame() {
		super();
		FrameInit();
	}
	public StandardFrame(String name) {
		super();
		FrameInit();
	}
}
