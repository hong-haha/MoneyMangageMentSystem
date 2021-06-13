package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.MoneyManager;

public class WindowFrame extends JFrame{
	
	MoneyManager moneyManager;
	
	MenuSelection menuselection;
	MoneyAdder moneyadder ;
	MoneyViewer moneyviewer ;
	
	public WindowFrame(MoneyManager moneyManager) {				
		this.setSize(500,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.moneyManager = moneyManager;
		this.menuselection = new MenuSelection(this);
		this.moneyadder = new MoneyAdder(this,this.moneyManager);
		this.moneyviewer = new MoneyViewer(this,this.moneyManager);	
		

		this.setupPanel(menuselection);


		this.setVisible(true);
	}
	
	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}
	
	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public MoneyAdder getMoneyadder() {
		return moneyadder;
	}

	public void setMoneyadder(MoneyAdder moneyadder) {
		this.moneyadder = moneyadder;
	}

	public MoneyViewer getMoneyviewer() {
		return moneyviewer;
	}

	public void setMoneyviewer(MoneyViewer moneyviewer) {
		this.moneyviewer = moneyviewer;
	}

}
