 

public class LectureNotes extends Book{
	private int Damagedpage;
	public LectureNotes(String BookName, float Price) {
		super(BookName, 7, Price);
	}

	@Override
	public float caculatePrice() {
		float price = 0;
		if(BookDamage) {
			price +=1*Damagedpage;
		}
		if(getOutTime()==-1) {
			return -1;
		}
		else {
			price+=getOutTime()*0.1;
		}
		return price;
	}
	public void setBookDamage(boolean state,int damagePage) {
		this.BookDamage =state ;
		this.Damagedpage = damagePage;
	}
}
