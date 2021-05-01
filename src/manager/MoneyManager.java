package manager;

import java.util.ArrayList;
import java.util.Scanner;

import money.Familymoney;
import money.Father;
import money.Money;
import money.Sister;

public class MoneyManager {
	ArrayList<Money> moneys = new ArrayList<Money>();
	Scanner input;
	MoneyManager(Scanner input){
		this.input = input;
	}

	public void addmoney() {
		int who=0;
		Money money;
		while (who !=1 && who !=2) {
			System.out.print("Select  num for Whose Money ");
			System.out.print("1 for Father ");
			System.out.print("2 for Mother ");
			System.out.print("3 for Sister ");
			who = input.nextInt();
			if(who==1) {
				money = new Father(Familymoney.father);
				moneys.add(money);
				money.getUserInput(input);
				break;
			}
			else if(who==2) {
				money = new Money();
				moneys.add(money);
				money.getUserInput(input);
				break;
			}
			else if(who==3) {
				money = new Sister(Familymoney.sister);
				moneys.add(money);
				money.getUserInput(input);
				break;
			}
			else {
				System.out.print("Wrong Number Select 1~3");
			}
		}


	}
	public void editmoney() {
		System.out.print("When will you edit the date? ");
		int date= input.nextInt();
		for(int i=0; i<moneys.size();i++) {
			Money money = moneys.get(i);
			if(money.getDate() == date) {
				int num =-1;
				int num2 =0;
				while (num != 3) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {

					case 1:
						System.out.print("Edit your Date");
						num2 = input.nextInt();
						money.setDate(num2);
						break;
					case 2:
						System.out.print("Edit your money kind (1 or 2)");
						num2 = input.nextInt();
						money.setKind(num2);
						break;
//					case 3:
//						System.out.print("Edit your Money");
//						num2 = input.nextInt();
//						int index = -1;
//						
//						
//						money.setAmount(i);
//
//
//						break;	
					default:
						continue;
					}
				} 
				break;
			}
		} 
	}


	public void deletemoney() {
		System.out.print("When will you delete the date? ");
		int date= input.nextInt();
		int index = -1;
		for(int i=0; i<moneys.size();i++) {
			if(moneys.get(i).getDate() == date) { 
				index = i;
				break;

			}
		}
		if (index >=0) {
			moneys.remove(index);
			System.out.println("money"+ date +" is deleted");
		}
		else {
			System.out.println("Nothing");
			return;
		}

	}


	public void viewall() {
		//		System.out.print("Money date:");
		//		int date =input.nextInt();
		for(int i=0; i<moneys.size();i++) {
			moneys.get(i).printInfo();
		}			
	}	
	public void showEditMenu() {
		System.out.println("¡Ú¡Ú¡Ú Money Info Edit Menu ¡Ú¡Ú¡Ú");
		
		System.out.println(" 1. Edit date");
		System.out.println(" 2. Edit kind");
//		System.out.println(" 3. Edit amount");
		System.out.println(" 3. Exit");
		
		System.out.println("Select one number between 1 - 3:");
	}



}
