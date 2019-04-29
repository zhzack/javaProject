package com.hupeng.java;

public abstract class Book {
	public final static int exist = 0;
	public final static int borrowed = 1;
	public final static int damaged = 2;
	protected int MaxBorrowTimeLimit;
	protected String BookName;
	protected static int BookNumber;
	//��ļ۸�
	protected float Price;
	//��������
	protected int BorrowTimeLimit;
	//ͼ�����״̬
	protected boolean BookDamage;
	//ͼ�����״̬
	protected boolean BorrowState;
	//�黹��ʱʱ��
	public int getOutTime() {
		if(BorrowState) {
			return -1;
		}
		return this.BorrowTimeLimit-this.MaxBorrowTimeLimit>0?this.BorrowTimeLimit-this.MaxBorrowTimeLimit:0;
	}
	//������ļ۸�
	public  abstract float  caculatePrice();
	//��ȡ����״̬
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
	//����
	public void BorrowBook() {
		this.BorrowState = true;
	}
	//����
	public  void returnBook(int BorrowTimeLimit) {
		this.BorrowState  = false;
		this.BorrowTimeLimit = BorrowTimeLimit;
	};
	//����
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
