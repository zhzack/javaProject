package libraryManage;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Start {

	public static void main(String[] args) {
		Font fnt = new Font("微软雅黑", Font.BOLD, 20);
		initGlobalFontSetting(fnt);
		String[] bookNameString = { "java", "PHP", "C++", "C语言", " 物理", " 英语", "数据库", "操作系统", "计算机 ", "web " };
		for (int i = 0; i < bookNameString.length; i++) {
			if (i < 5) {
				DataContainer.books.add(new ordinaryBook(i, bookNameString[i], 50 + (int) (Math.random() * 100),
						20 + (int) (Math.random() * 10), false));
			} else {
				DataContainer.books.add(new superBook(i, bookNameString[i], 50 + (int) (Math.random() * 100),
						50 + (int) (Math.random() * 10), false));
			}

		}
//		Users users1 = ;
		DataContainer.users.add(new Users("123", "123"));
		mainjFrame frame = new mainjFrame("图书馆管理平台");
		// DataContainer.frames.add(frame);
		frame.setVisible(true);

	}

	static class DataContainer {
	
		static int[] a = new int[5];
		static ArrayList<Book> books = new ArrayList<Book>();// 保存用户及书籍数据
		static ArrayList<Users> users = new ArrayList<Users>();
		static int isLogin = -1;// 用户索引，-1为未登录
		// static ArrayList<JFrame> frames = new ArrayList<JFrame>();// 窗体容器
		// 0 登陆注册退出
		// 1 登录
		// 2 图书馆 借阅 归还 退出
	}
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
