package manager;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MenuManager {

	 

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = new MoneyManager(input);

		
		int num = 0;
		while (num!=6) {
			System.out.println("�ڡڡ� MoneyManagement System Menu �ڡڡ�");
			System.out.println("1. ���� ���(Add money)");
			System.out.println("2. ���� ����(Edit money)");
			System.out.println("3. ����(Delete money)");
			System.out.println("4. ��ü���뺸��(View all)");
			System.out.println("5. ������(Exit) ");
			System.out.print("Select one number between 1 - 6: ");
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
	}	
			


		
	
}
