package com.hupeng.java;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
//标准窗口布局
public class StandardFrame extends JFrame {
	protected Font titleFont = new Font("幼圆",Font.BOLD,30);
	protected Font normalFont = new Font("宋体",Font.PLAIN,22);
	//窗口初始化
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
