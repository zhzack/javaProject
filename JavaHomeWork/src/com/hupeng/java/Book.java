package com.hupeng.java;

public abstract class Book {
	public final static int exist = 0;
	public final static int borrowed = 1;
	public final static int damaged = 2;
	protected int MaxBorrowTimeLimit;
	protected String BookName;
	protected static int BookNumber;
	//书的价格
	protected float Price;
	//借阅期限
	protected int BorrowTimeLimit;
	//图书损毁状态
	protected boolean BookDamage;
	//图书借阅状态
	protected boolean BorrowState;
	//归还超时时间
	public int getOutTime() {
		if(BorrowState) {
			return -1;
		}
		return this.BorrowTimeLimit-this.MaxBorrowTimeLimit>0?this.BorrowTimeLimit-this.MaxBorrowTimeLimit:0;
	}
	//计算借阅价格
	public  abstract float  caculatePrice();
	//获取借阅状态
	public int getBorrowState() {
		if(BookDamage) {
			return Book.damaged;
		}
		else {
			if (BorrowState) {
				return Book.borrowed;
			}
			else {
				return Book.exist;
			}
		}
	}
	//借书
	public void BorrowBook() {
		this.BorrowState = true;
	}
	//还书
	public  void returnBook(int BorrowTimeLimit) {
		this.BorrowState  = false;
		this.BorrowTimeLimit = BorrowTimeLimit;
	};
	//报损
	public void setBookDamage(boolean state,int damagePage) {
		this.BookDamage =state ;
	}
	public Book(String BookName,int MAXBorrowTimeLimit,float Price) {
		this.BookName = BookName;
		this.BookNumber++;
		this.MaxBorrowTimeLimit = MAXBorrowTimeLimit;
		this.Price = Price;
		this.BookDamage = false;
		BorrowState = false;
	}
}
