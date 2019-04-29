package libraryManage;

public class ordinaryBook extends Book {

	public ordinaryBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		 setDeadTime(14);
	}

	public String kindBook() {
		return "∆’Õ® ÈºÆ";
	}
	public double Calculation() {
		return 0;

	}

}