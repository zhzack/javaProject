package libraryManage;

public class ordinaryBook extends Book {

	public ordinaryBook(int bookNum, String bookName, int bookPages, double bookPrice, boolean isBorrowed) {
		super(bookNum, bookName, bookPages, bookPrice, isBorrowed);
		// TODO Auto-generated constructor stub
		setDeadTime(30);
	}

	public String kindBook() {
		return "��ͨ�鼮";
	}
@Override
	public double Calculation(int time) {
	if (Damage) {
		if (getDeadTime()-time>0) {
			return getBookPrice();//��δ��ʱ
		}else {
			return getBookPrice() + (getDeadTime()-time) * 0.1;//�𻵲���ʱ
		}	
	}else {
		if (getDeadTime()-time>0) {
			return 0;//��
		}else {
			return   (getDeadTime()-time) * 0.1;//��ʱ
		}
	}
	
		

	}//��ͨ�鿯�𻵻�ʧ���۸�����,������������������ÿ��֧��һ��Ǯ;
//	public int CalculationT() {// ����ʱ��
//		return 0;
//
//	}
}