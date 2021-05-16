package money;

import java.util.Scanner;

public abstract class Money {
	int max=2;
	protected Familymoney family = Familymoney.father; 
	protected String detail;
	protected int amount[]= new int[max];
	protected int date;
	protected int kind;
	protected int inMoney[]= new int[max]; 
	protected int outMoney[]= new int[max]; 
	protected int totalMoney=0; 

	public int[] getAmount() {
		return amount;
	}

	public void setAmount(int[] amount) {
		this.amount = amount;
	}

	public int[] getInMoney() {
		return inMoney;
	}

	public void setInMoney(int[] inMoney) {
		this.inMoney = inMoney;
	}

	public int[] getOutMoney() {
		return outMoney;
	}

	public void setOutMoney(int[] outMoney) {
		this.outMoney = outMoney;
	}

	public int getTotalMoney() {
		return totalMoney;
	}

	public void setTotalMoney(int totalMoney) {
		this.totalMoney = totalMoney;
	}

	public Familymoney getFamily() {
		return family;
	}

	public void setFamily(Familymoney family) {
		this.family = family;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
	
		this.date = date;
	}

	public int getKind() {
		return kind;
	}

	public void setKind(int kind) {
		this.kind = kind;
	}

	public Money(){
	}
	
	public Money(Familymoney family){
		this.family=family;
	}

	public Money( int[] amount, int kind) {
		this.amount = amount;

	}


	public Money(String detail, int[] amount, int date , int kind) {
		this.detail = detail;
		this.amount = amount;
		this.date = date;
		this.kind = kind;
	}
	public Money(Familymoney family ,String detail, int[] amount, int date , int kind) {
		this.family = family;
		this.detail = detail;
		this.amount = amount;
		this.date = date;
		this.kind = kind;
	}

	public abstract void printInfo();
		
	


}
