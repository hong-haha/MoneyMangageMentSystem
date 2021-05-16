package manager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import money.Familymoney;
import money.Father;
import money.Money;
import money.MoneyInput;
import money.Mother;
import money.Sister;

public class MoneyManager {
	ArrayList<MoneyInput> moneys = new ArrayList<MoneyInput>();
	Scanner input;
	MoneyManager(Scanner input){
		this.input = input;
	}

	public void addmoney() {
		int who=0;
		MoneyInput moneyinput;
		while (who <1 || who >3) {
			try {
			System.out.print("Select  num for Whose Money ");
			System.out.print("1 for Father ");
			System.out.print("2 for Mother ");
			System.out.print("3 for Sister ");
			who = input.nextInt();
			if(who==1) {
				moneyinput = new Father(Familymoney.father);
				moneys.add(moneyinput);
				moneyinput.getUserInput(input);
				break;
			}
			else if(who==2) {
				moneyinput = new Mother(Familymoney.mother);
				moneys.add(moneyinput);
				moneyinput.getUserInput(input);
				break;
			}
			else if(who==3) {
				moneyinput = new Sister(Familymoney.sister);
				moneys.add(moneyinput);
				moneyinput.getUserInput(input);
				break;
			}
			else {
				System.out.println("Wrong Number Select 1~3");
			}
			}
			catch(InputMismatchException e) {
				System.out.println("1에서 3까지 숫자를 입력하시오");
				if(input.hasNext()) {
					input.next();
				}
				who = -1;

				
			}
		}


	}
	public void editmoney() {
		System.out.print("When will you edit the date? ");
		int date= input.nextInt();
		for(int i=0; i<moneys.size();i++) {
			MoneyInput moneyinput = moneys.get(i);
			if(moneyinput.getDate() == date) {
				int num =-1;
				int num2 =0;
				while (num != 3) {
					showEditMenu();
					num = input.nextInt();
					switch(num) {

					case 1:
						System.out.print("Edit your Date");
						num2 = input.nextInt();
						moneyinput.setDate(num2);
						break;
					case 2:
						System.out.print("Edit your money kind (1 or 2)");
						num2 = input.nextInt();
						moneyinput.setKind(num2);
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
		for(int i=0; i<moneys.size();i++) {
			moneys.get(i).printInfo();
		}			
	}	
	public void showEditMenu() {
		System.out.println("★★★ Money Info Edit Menu ★★★");
		
		System.out.println(" 1. Edit date");
		System.out.println(" 2. Edit kind");
//		System.out.println(" 3. Edit amount");
		System.out.println(" 3. Exit");
		
		System.out.println("Select one number between 1 - 3:");
	}



}
