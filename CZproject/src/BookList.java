
import java.util.Vector;

public class BookList {
	public final static int noexist = -1;
	public final static int exist = 0;
	public final static int borrowed = 1;
	public final static int damaged = 2;
	public final static int borrowSuccess = 3;
	public final static int returnSuccess = 4;
	public final static int reportLossSuccess = 5;
	private static Vector<Book> books = new Vector<Book>(10);

	private int searchBook(String bookName) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).BookName.equals(bookName)) {
				return i;
			}
		}

		return BookList.noexist;
	};

	private int borrowState(String bookName) {

		int booklocal = searchBook(bookName);
		if (booklocal == BookList.noexist) {
			return BookList.noexist;
		} else {
			Book tempBook = books.get(booklocal);
			if (tempBook.getBorrowState() == Book.exist) {
				return BookList.exist;
			} else if (tempBook.getBorrowState() == Book.borrowed) {
				return BookList.borrowed;
			} else {
				return BookList.damaged;
			}
		}
	};

	public int borrowBook(String bookName) {
		int state = borrowState(bookName);
		if (state != BookList.exist) {
			return state;
		} else {
			books.get(searchBook(bookName)).BorrowBook();
			return BookList.borrowSuccess;
		}
	}

	public int returnBook(String bookName, int borrowTimeLimit) {
		int state = borrowState(bookName);
		if (state == BookList.borrowed) {
			books.get(state).returnBook(borrowTimeLimit);
			return BookList.returnSuccess;
		}
		return state;
	};

	public float caculatePrice(String bookName) {
		int state = borrowState(bookName);
		if (state != BookList.noexist) {
			return books.get(state).caculatePrice();
		}
		return 0;
	}

	public int ReportLossBook(String NormalbookName) {
		int state = borrowState(NormalbookName);
		if (state == BookList.noexist) {
			return state;
		} else {
			books.get(state).setBookDamage(true, 0);
			return BookList.reportLossSuccess;
		}
	};

	public int ReportLossBook(String lectureNote, int damagePages) {
		int state = borrowState(lectureNote);
		if (state == BookList.noexist) {
			return state;
		} else {
			books.get(state).setBookDamage(true, damagePages);
			return BookList.reportLossSuccess;
		}
	}

	public static void addBook(String bookName, float price, boolean bookType) {
		if (bookType) {
			books.add(new LectureNotes(bookName, price));
		} else {
			books.add(new NormalBook(bookName, price));
		}
	};

	public static void test() {
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).BookName);
		}
	}
}
