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
	
	public void setTotalMoney(int totalMoney) ;
		
	public void setDetail(String detail);
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
