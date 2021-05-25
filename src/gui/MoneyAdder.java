package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class MoneyAdder extends JFrame{
	
	public MoneyAdder() {
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
		
		panel.add(new JButton("SAVE"));
		panel.add(new JButton("CANCEL"));
		
		
		
		SpringUtilities.makeCompactGrid(panel, 4 ,2, 6 ,6 ,6,6);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);
		this.setContentPane(panel);
		this.setVisible(true);
	}

}
