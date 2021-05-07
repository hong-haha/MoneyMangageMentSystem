package money;

import java.util.Scanner;

public interface MoneyInput {

	public int getDate();
	
	public void setDate(int date);
	
	public void setKind(int kind);
	
	public void printInfo();
	
	public void getUserInput(Scanner input);
}
