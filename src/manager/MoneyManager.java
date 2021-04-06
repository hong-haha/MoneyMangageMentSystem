package manager;

import java.util.ArrayList;
import java.util.Scanner;

import money.Father;
import money.Money;

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
				money = new Father();
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
			else {

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
				while (num != 4) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						
						
						break;
					case 2:
						money.setDate(num);
						break;
					case 3:
						int kind;
						money.setKind(num);
						break;
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
		System.out.println(" 1. Edit amount");
		System.out.println(" 2. Edit date");
		System.out.println(" 3. Edit kind");
		System.out.println(" 4. Exit");
		System.out.println("Select one number between 1 - 4:");
	}



}
