 

public class MylabraryProgram {
	public static void addBook() {
		
		BookList.addBook("demo", 18.0f, false);
		BookList.addBook("Java�������", 55.0f, false);
		BookList.addBook("Java����", 75, true);
	};
	public static void main(String[] args) {
		addBook();
		MainFrameCZ mainFrame = new MainFrameCZ("ͼ��ܹ���ϵͳ");
		mainFrame.setTitle("ͼ�����ϵͳ");
		mainFrame.setVisible(true);
	}

}
