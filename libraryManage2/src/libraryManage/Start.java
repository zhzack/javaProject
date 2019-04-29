package libraryManage;

import java.util.ArrayList;

import javax.swing.JFrame;

public class Start {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			DataContainer.books.add(new ordinaryBook(001, "a", 10, 10, 10));
		}
		Users users1 = new Users("123", "123");
		DataContainer.users.add(users1);
		mainjFrame frame = new mainjFrame("图书馆管理平台");
		DataContainer.frames.add(frame);
		frame.setVisible(true);

	}

	static class DataContainer {
		
		static ArrayList<Book> books = new ArrayList<Book>();// 保存用户及书籍数据
		static ArrayList<Users> users = new ArrayList<Users>();
		static int isLogin = -1;// 用户索引，-1为未登录
		static ArrayList<JFrame> frames = new ArrayList<JFrame>();// 窗体容器
		//0	登陆注册退出
		//1	登录
		//2	图书馆 借阅 归还 退出
	}
}
