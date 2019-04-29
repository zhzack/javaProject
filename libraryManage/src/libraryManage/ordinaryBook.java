package libraryManage;

public class ordinaryBook extends Book {

	public ordinaryBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		setDeadTime(30);
	}

	public String kindBook() {
		return "普通书籍";
	}
@Override
	public double Calculation(int time) {
	if (Damage) {
		if (getDeadTime()-time>0) {
			return getBookPrice();//损坏未超时
		}else {
			return getBookPrice() + (getDeadTime()-time) * 0.1;//损坏并超时
		}	
	}else {
		if (getDeadTime()-time>0) {
			return 0;//无
		}else {
			return   (getDeadTime()-time) * 0.1;//超时
		}
	}
	
		

	}//普通书刊损坏或丢失按价格赔赏,刊物借阅如果超过期限每天支付一角钱;
//	public int CalculationT() {// 计算时间
//		return 0;
//
//	}
}