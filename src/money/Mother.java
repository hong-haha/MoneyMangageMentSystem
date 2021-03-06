package money;

import java.util.Scanner;

public class Mother extends Money implements  MoneyInput{
	
	public Mother(Familymoney family){
		super(family);
	}

	public void getUserInput(Scanner input) {
		for(int i=0; i<max; i++) {
			System.out.print("Amount of money: ");
			amount[i]= input.nextInt();
			this.setAmount(amount);

			System.out.print("Date of money(yyyymmdd): ");
			int date = input.nextInt();
			this.setDate(date);

			System.out.print("수입: 1번입력 / 지출: 2번입력");
			int kind= input.nextInt();
			this.setKind(kind);

			if(kind == 1){
				inMoney[i] = amount[i];
				totalMoney += inMoney[i];
			}
			else if(kind == 2){
				outMoney[i] = amount[i];
				totalMoney -= outMoney[i];
			}

			System.out.print("Details of money: ");
			String detail = input.next();
			this.setDetail(detail);
		}
	}
	public void printInfo(){
		String sfamily ="none";
		switch(this.family) {
		case father:
			sfamily ="father";
			break;
		case mother:
			sfamily ="mother";
			break;
		case sister:
			sfamily ="sister";
			break;
		default:
		}
		for(int i=0; i<amount.length;i++) {
			System.out.println(sfamily+ "'s money"+  "detail:"+ detail + "amount:" + amount[i] + "date: " + date +" totalmoney :" + totalMoney );
		}
	}
	
}
