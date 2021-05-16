package money;

import java.util.Scanner;

public class Father extends Money implements  MoneyInput{
	
	public Father(Familymoney family){
		super(family);
	}
	
	public void setmoneydate(MoneyInput money, Scanner input) {
		System.out.print("Date of money(yyyymmdd): ");
		int date = input.nextInt();
		this.setDate(date);

	}
	public void getUserInput(Scanner input) {
		for(int i=0; i<max; i++) {
			System.out.print("Amount of money: ");
			amount[i]= input.nextInt();
			this.setAmount(amount);

			setmoneydate(this,input);
			
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

			char answer = 'x';
			while(answer != 'y' && answer != 'Y'&& answer != 'n' && answer != 'N' ) {
				System.out.print("Do you want to write down the details?  (Y/N) ");
				answer = input.next().charAt(0);
				if(answer =='y' || answer =='Y') {
					System.out.print("Details of money: ");
					String detail = input.next();
					this.setDetail(detail);
					break;
				}
				else if(answer =='n' || answer =='N') {
					this.setDetail("");
					break;
				}
				else {
				}
			}

		}
	}
	public void printInfo(){
		String sfamily= getfamilyString();
		for(int i=0; i<amount.length;i++) {
			System.out.println(sfamily+ "'s money"+  "detail:"+ detail + "amount:" + amount[i] + "date: " + date +" totalmoney :" + totalMoney );
		}
	}
	public String getfamilyString() {
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
		return sfamily;
		
	}
}