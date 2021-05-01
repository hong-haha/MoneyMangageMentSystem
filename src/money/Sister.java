package money;

import java.util.Scanner;

public class Sister extends Money {
	
	public Sister(Familymoney family){
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

			
			this.setDetail("");
			

		}
	}
}