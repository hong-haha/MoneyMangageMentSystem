package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import listener.MoneyAdderCancel;
import listener.MoneyAdderListener;
import manager.MoneyManager;

public class MoneyAdder extends JPanel{	
	WindowFrame frame;
	MoneyManager moneyManager;
	
	
	public MoneyAdder(WindowFrame frame,MoneyManager moneyManager) {
		this.frame = frame;
		this.moneyManager=moneyManager;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel labelmoney = new JLabel("Amount:",JLabel.TRAILING);
		JTextField fieldmoney = new JTextField(10);
		labelmoney.setLabelFor(fieldmoney);
		panel.add(labelmoney);
		panel.add(fieldmoney);
		
		JLabel labeldate = new JLabel("Date:",JLabel.TRAILING);
		JTextField fielddate = new JTextField(10);
		labeldate.setLabelFor(fielddate);
		
		
		
		panel.add(labeldate);
		panel.add(fielddate);
		
		JLabel labeldetail = new JLabel("Detail:",JLabel.TRAILING);
		JTextField fielddetail = new JTextField(10);
		labeldetail.setLabelFor(fielddetail);
		panel.add(labeldetail);
		panel.add(fielddetail);
		
		JButton saveButton =new JButton("SAVE");
		saveButton.addActionListener(new MoneyAdderListener(fieldmoney,fielddate,fielddetail,moneyManager));		
		JButton cancelButton =new JButton("CANCEL");
		cancelButton.addActionListener(new MoneyAdderCancel(frame));
		panel.add(saveButton);
		panel.add(cancelButton);
		
		
		
		SpringUtilities.makeCompactGrid(panel, 4 ,2, 6 ,6 ,6,6);
		
		
		this.add(panel);
		this.setVisible(true);
	}

}
