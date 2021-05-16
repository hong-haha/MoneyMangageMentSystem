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
				System.out.println("1���� 5���� ���ڸ� �Է��Ͻÿ�");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;

			}
		}
	}	

	public static void showMenu(){
		System.out.println("�ڡڡ� MoneyManagement System Menu �ڡڡ�");
		System.out.println("1. ���� ���(Add money)");
		System.out.println("2. ���� ����(Edit money)");
		System.out.println("3. ����(Delete money)");
		System.out.println("4. ��ü���뺸��(View all)");
		System.out.println("5. ������(Exit) ");
		System.out.print("Select one number between 1 - 6: ");
	}



}
