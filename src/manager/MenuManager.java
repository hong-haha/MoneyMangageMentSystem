package manager;

import java.util.Scanner;

import log.EventLogger;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
public class MenuManager {
	static EventLogger logger = new EventLogger("log.txt");
	

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		MoneyManager moneyManager = getObject("moneymanager.ser");
				
		if(moneyManager ==null) {
			 moneyManager =new MoneyManager(input);
		}
		selectMenu(input, moneyManager);
		putObject(moneyManager,"moneymanager.ser");
	}	
	public static void selectMenu(Scanner input, MoneyManager moneyManager) {
		int num = 0;
		while (num!=5) {
			try {
				showMenu();
				num = input.nextInt();
				if (num == 1) {
					moneyManager.addmoney();
					logger.log("add money");
				}
				else if(num == 2) {
					moneyManager.editmoney();
					logger.log("edit money");
				}	
				else if(num == 3) {
					moneyManager.deletemoney();
					logger.log("delete money");
				}	
				else if(num == 4) {
					moneyManager.viewall();
					logger.log("view money");
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
	public static MoneyManager getObject(String filename) {
		MoneyManager moneyManager =null;
		

		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			moneyManager = (MoneyManager)in.readObject();
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return moneyManager;

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return moneyManager;
	}
	
	public static MoneyManager putObject(MoneyManager moneyManager,String filename) {

		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(moneyManager);
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return moneyManager;
	}


}


