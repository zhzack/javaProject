package libraryManage;

public class superBook extends Book {

	public superBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		setDeadTime(7);
	}

	public String kindBook() {
		return "��ʦ����";
	}

	public double Calculation(int time) {

		// ��ʦ �����𻵻�ʧ����ÿҳ1Ԫ��������,������������������ÿ��֧��һ��Ǯ;
		if (Damage) {
			if (getDeadTime() - time > 0) {
				return getBookPages();
			} else {
				return getBookPages() + (getDeadTime() - time) * 0.1;
			}
		} else {
			if (getDeadTime() - time > 0) {
				return 0;
			} else {
				return (getDeadTime() - time) * 0.1;
			}
		}

	}

}