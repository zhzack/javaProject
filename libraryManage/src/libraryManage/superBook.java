package libraryManage;

public class superBook extends Book {

	public superBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		setDeadTime(7);
	}

	public String kindBook() {
		return "教师讲义";
	}

	public double Calculation(int time) {

		// 教师 讲义损坏或丢失按照每页1元进行赔赏,刊物借阅如果超过期限每天支付一角钱;
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