package libraryManage;

import java.awt.Font;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Start {

	public static void main(String[] args) {
		Font fnt = new Font("΢���ź�", Font.BOLD, 20);
		initGlobalFontSetting(fnt);
		String[] bookNameString = { "java", "PHP", "C++", "C����", " ����", " Ӣ��", "���ݿ�", "����ϵͳ", "����� ", "web " };
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
		mainjFrame frame = new mainjFrame("ͼ��ݹ���ƽ̨");
		// DataContainer.frames.add(frame);
		frame.setVisible(true);

	}

	static class DataContainer {
	
		static int[] a = new int[5];
		static ArrayList<Book> books = new ArrayList<Book>();// �����û����鼮����
		static ArrayList<Users> users = new ArrayList<Users>();
		static int isLogin = -1;// �û�������-1Ϊδ��¼
		// static ArrayList<JFrame> frames = new ArrayList<JFrame>();// ��������
		// 0 ��½ע���˳�
		// 1 ��¼
		// 2 ͼ��� ���� �黹 �˳�
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
