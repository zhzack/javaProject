package com.hupeng.java;

public class NormalBook extends Book {
	public NormalBook(String BookName, float Price) {
		super(BookName, 30, Price);
	}
	
	@Override
	public float caculatePrice() {
		if(getOutTime()==1) {
			return -1;
		}
		else {
			float price =0;
			if(BookDamage) {
				price = this.Price;
			}
			else {
				price = getOutTime()*0.1f;
				}

				return price;
			}
	}
}
