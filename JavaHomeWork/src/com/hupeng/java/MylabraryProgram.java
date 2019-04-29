package com.hupeng.java;

public class MylabraryProgram {
	public static void addBook() {
		
		BookList.addBook("demo", 18.0f, false);
		BookList.addBook("Java程序设计", 55.0f, false);
		BookList.addBook("Java讲义", 75, true);
	};
	public static void main(String[] args) {
		addBook();
		MainFrame mainFrame = new MainFrame("图书管管理系统");
		mainFrame.setTitle("图书管理系统");
		mainFrame.setVisible(true);
	}

}
