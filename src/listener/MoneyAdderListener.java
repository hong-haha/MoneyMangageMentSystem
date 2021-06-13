package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JTextField;

import manager.MoneyManager;
import money.Familymoney;
import money.Father;
import money.Money;
import money.MoneyInput;

public class MoneyAdderListener implements ActionListener {
	

	JTextField fieldmoney;
	JTextField fielddate;
	JTextField fielddetail;
	
	MoneyManager moneyManager;
	
	public MoneyAdderListener(
			JTextField fieldmoney,
			JTextField fielddate,
			JTextField fielddetail,
			MoneyManager moneyManager) {
		
		this.fieldmoney = fieldmoney;
		this.fielddate = fielddate;
		this.fielddetail = fielddetail;
		this.moneyManager=moneyManager;
	}
	public void actionPerformed(ActionEvent e) {	
		
	
		MoneyInput money= new Father(Familymoney.father);
		
		try {
		money.setTotalMoney(Integer.parseInt(fieldmoney.getText()));
		money.setDate(Integer.parseInt(fielddate.getText()));		
		money.setDetail(fielddetail.getText());
		moneyManager.addmoney(money);
		putObject(moneyManager,"moneymanager.ser");
		money.printInfo();
		}catch(Exception e1) {			
			e1.printStackTrace();
		}
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
