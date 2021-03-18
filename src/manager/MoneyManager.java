package manager;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.*;

public class MoneyManager {

	public static void main(String[] args) {
		int num = 0;
		Scanner input = new Scanner(System.in);
		
		while (num!=6) {
			System.out.println("1. 수입입력(Income)");
			System.out.println("2. 지출입력(Disnursement)");
			System.out.println("3. 이체입력(Transfer)");
			System.out.println("4. 전체내용보기(View all)");
			System.out.println("5. 메뉴보기(Show a menu)");
			System.out.println("6. 나가기(Exit) ");
			System.out.print("Select one number between 1 - 6: ");
			num = input.nextInt();
			
			if (num == 1) {
				income();
			}
			else if(num == 2) {
				disnursemnet();
			}	
			else if(num == 3) {
				transfer();
			}	
			else if(num == 4) {
				viewall();
			}	
			else {
				continue;
			}
		}
	}	
			
	public static void income() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Details of Income: ");
		String incomeDetail= input.next();
		System.out.print("Amount of Income: ");
		int incomeAmount= input.nextInt();
		System.out.print("Date of Income(yyyymmdd): ");
		String incomeDate = input.next();
  
	}
	public static void disnursemnet() {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Details of Disnursement: ");
		String disnursemnetDetail= input.next();
		System.out.print("Amount of Disnursement: ");
		int disnursemnetAmount= input.nextInt();
		System.out.print("Date of Disnursement(yyyymmdd): ");
		String disnursemnetDate= input.next();		
	}	

	public static void transfer() {
			
		Scanner input = new Scanner(System.in);
		System.out.print("Details of Transfer: ");
		String transferDetail= input.next();
		System.out.print("Amount of Transfer: ");
		int transferAmount= input.nextInt();
		System.out.print("Date of Transfer(yyyymmdd): ");
		String transferDate= input.next();		
	}	
	public static void viewall() {
			
		
	}	



		
	
}
