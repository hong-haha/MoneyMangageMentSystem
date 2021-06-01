package money;

import java.util.Scanner;

public interface MoneyInput {

	public int getDate();
	
	public String getDetail();
	public int getKind();
	
	public void setDate(int date);
	
	public void setKind(int kind);
	
	public int[] getAmount();
	
	public int[] getInMoney();
	
	public int[] getOutMoney();
	
	public int getTotalMoney();
	
	
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
