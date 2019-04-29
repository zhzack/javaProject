package libraryManage;

public class Book {
	private int bookNum;// ���
	private String bookName;// ����
	private int deadTime;// ����
	private int bookPages;// ҳ��
	private double bookPrice;// �۸�
	private boolean isBorrowed;
	private String date;
	public boolean Damage;

	public void setDamage() {
		if (Damage) {
			Damage = false;
		} else {
			Damage = true;
		}
	}

	public boolean isDamage() {
		return Damage;
	}

	public double Calculation(int a) {// ������Ҫ֧���Ľ��
		return 0;

	}

	public int CalculationT(String time1) {// ����ʱ��
		String s_date = getDate();
		int days = 0;
		int mounth = s_date.charAt(0) * 10 + s_date.charAt(1);// ���ַ���ת���������·�
		int day = s_date.charAt(3) * 10 + s_date.charAt(4);
		int mounth1 = time1.charAt(0) * 10 + time1.charAt(1);
		int day1 = time1.charAt(3) * 10 + time1.charAt(4);
		days = (mounth1 - mounth) * 30 + (day1 - day);
		return days;

	}

	public String kindBook() {
		return "";
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getDeadTime() {
		return deadTime;
	}

	public void setDeadTime(int deadTime) {
		this.deadTime = deadTime;
	}

	public int getBookPages() {
		return bookPages;
	}

	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}

	public double getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}

	public Book(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;

		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
		this.Damage = false;
		this.setBorrowed(isBorrowed);
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + ", deadTime=" + deadTime + ", bookPages="
				+ bookPages + ", bookPrice=" + bookPrice + "]";
	}

	public String getBorrowed() {
		if (isBorrowed()) {
			return "�ѱ���";
		} else {
			return "δ����";
		}

	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

	public boolean isBorrowed() {
		return isBorrowed;
	}

	public String getDate() {
		if (!isBorrowed) {
			return "";
		} else {
			return date;
		}

	}

	public void setDate(String date) {
		this.date = date;
	}

}
