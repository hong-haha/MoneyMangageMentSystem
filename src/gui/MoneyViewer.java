package gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MoneyViewer extends JFrame{
	
	public MoneyViewer() {
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("Amount");
		model.addColumn("Date");
		model.addColumn("Detail");

		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table);
		
		this.add(sp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300,300);

		this.setVisible(true);
	}
}
