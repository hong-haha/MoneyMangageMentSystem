package listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.MoneyAdder;
import gui.WindowFrame;

public class MoneyAdderCancel implements ActionListener{
	WindowFrame frame;

	public MoneyAdderCancel(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		frame.getContentPane().removeAll();
		frame.getContentPane().add(frame.getMenuselection()); 
		frame.revalidate();
		frame.repaint();
	}

}
