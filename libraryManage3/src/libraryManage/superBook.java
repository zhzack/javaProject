package libraryManage;

public class superBook extends Book {

	public superBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		setDeadTime(7);
	}
	public String kindBook() {
		return "ΩÃ ¶Ω≤“Â";
	}
	public double Calculation() {
		return 0;

	}
}