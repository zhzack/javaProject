package libraryManage;

public class Book {
	private int bookNum;// ���
	private String bookName;// ����
	private int deadTime;// ����
	private int bookPages;// ҳ��
	private double bookPrice;// �۸�
	private boolean isBorrowed;
	public double Calculation() {//������Ҫ֧���Ľ��
		return 0;

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

	public Book(int bookNum, String bookName, int deadTime, int bookPages, double bookPrice) {
		super();
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.deadTime = deadTime;
		this.bookPages = bookPages;
		this.bookPrice = bookPrice;
	}

	@Override
	public String toString() {
		return "Book [bookNum=" + bookNum + ", bookName=" + bookName + ", deadTime=" + deadTime + ", bookPages="
				+ bookPages + ", bookPrice=" + bookPrice + "]";
	}

	public boolean getBorrowed() {
		return isBorrowed;
	}

	public void setBorrowed(boolean isBorrowed) {
		this.isBorrowed = isBorrowed;
	}

}
