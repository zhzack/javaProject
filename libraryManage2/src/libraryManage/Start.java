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
		mainjFrame frame = new mainjFrame("ͼ��ݹ���ƽ̨");
		DataContainer.frames.add(frame);
		frame.setVisible(true);

	}

	static class DataContainer {
		
		static ArrayList<Book> books = new ArrayList<Book>();// �����û����鼮����
		static ArrayList<Users> users = new ArrayList<Users>();
		static int isLogin = -1;// �û�������-1Ϊδ��¼
		static ArrayList<JFrame> frames = new ArrayList<JFrame>();// ��������
		//0	��½ע���˳�
		//1	��¼
		//2	ͼ��� ���� �黹 �˳�
	}
}
