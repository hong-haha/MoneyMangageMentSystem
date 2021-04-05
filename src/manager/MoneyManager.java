package manager;

import java.util.Scanner;

public class MoneyManager {
	Money money;
	Scanner input;
	MoneyManager(Scanner input){
		this.input = input;
	}

	public void addmoney() {
			money = new Money();
			System.out.print("Amount of money: ");
			money.amount= input.nextInt();
			System.out.print("Date of money(yyyymmdd): ");
			money.date = input.nextInt();
			System.out.print("수입: 1번입력 / 지출: 2번입력");
			money.kind= input.nextInt();
			System.out.print("Details of money: ");
			money.detail = input.next();
		
	}
	public void editmoney() {
		System.out.print("When will you edit the date? ");
		int date= input.nextInt();	
		if(money.date==date) {
			money =null;
			System.out.println("money to be edited is " + date);
		}
	}	


	public void deletemoney() {
		System.out.print("When will you delete the date? ");
		int date= input.nextInt();
		if (money==null) {
			return;
		}
		if(money.date==date) {
			money =null;
			System.out.println("money is deleted");
		}
	}


	public void viewall() {
		System.out.print("Money date:");
		int date =input.nextInt();
		if(money.date==date) {
			money.printInfo();
		}

	}	



}
