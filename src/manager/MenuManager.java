package manager;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
public class MenuManager {



	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(input);

		selectMenu(input, moneyManager);

	}	
	public static void selectMenu(Scanner input, MoneyManager moneyManager) {
		int num = 0;
		while (num!=5) {
			try {
				showMenu();
				num = input.nextInt();
				if (num == 1) {
					moneyManager.addmoney();
				}
				else if(num == 2) {
					moneyManager.editmoney();
				}	
				else if(num == 3) {
					moneyManager.deletemoney();
				}	
				else if(num == 4) {
					moneyManager.viewall();
				}	
				else {
					continue;
				}
			}
			catch(InputMismatchException e) {
				System.out.println("1에서 5까지 숫자를 입력하시오");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;

			}
		}
	}	

	public static void showMenu(){
		System.out.println("★★★ MoneyManagement System Menu ★★★");
		System.out.println("1. 내역 등록(Add money)");
		System.out.println("2. 내역 편집(Edit money)");
		System.out.println("3. 삭제(Delete money)");
		System.out.println("4. 전체내용보기(View all)");
		System.out.println("5. 나가기(Exit) ");
		System.out.print("Select one number between 1 - 6: ");
	}



}
