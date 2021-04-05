package manager;

public class Money {

	String detail;
	int amount;
	int date;
	int kind;




	public Money(){
	}

	public Money( int amount, int kind) {
		this.amount = amount;

	}
	public Money(String detail, int amount, int date , int kind) {
		this.detail = detail;
		this.amount = amount;
		this.date = date;
		this.kind = kind;
	}

	public void printInfo(){
		System.out.println("detail:"+ detail + "amount:" + amount + "date: " + date +"kind: " );
	}

}
