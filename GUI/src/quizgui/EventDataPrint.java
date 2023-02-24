package quizgui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class EventDataPrint implements ActionListener{

	 String descrptn = "";
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(GUI.rbtnMess.isSelected()) {
			descrptn = "Messenger";
		}
		else if(GUI.rdbtnEncoder.isSelected()) {
			descrptn =  "Encoder";
		}
		else if(GUI.rdbtnTechnician.isSelected()) {
			descrptn = "Technician";
		}
		else if(GUI.rdbtnProgrammer.isSelected()) {
			descrptn =  "Programmer";
		
	}
		
		
		
		
		String[] header = {"Name", "Age", "Position", "Department","Hours Worked","Salary",
				"Overtime", "Deductions", "Net Salary"};
		String[][] data = {{GUI.tname.getText(), GUI.tage.getText(), (String)descrptn,
			(String) GUI.cmbdept.getSelectedItem(),GUI.tfHourswork.getText(),
			Double.toString(ComputeSalary.getS()), Double.toString(ComputeSalary.getOT()), 
			Double.toString(ComputeSalary.getDeductions()), Double.toString(ComputeSalary.getNetSal())}};
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(530, 45, 540, 213);
		GUI.contentPane.add(panel_2);
		panel_2.setBorder(new TitledBorder(null, "Printed Output", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();scrollPane.setBounds(6, 16, 524, 186);panel_2.add(scrollPane);
		
		GUI.table = new JTable(data, header);
		scrollPane.setViewportView(GUI.table);
		GUI.table.setBorder(new LineBorder(Color.BLACK));
		GUI.table.setFillsViewportHeight(true);
		
		
	}
	
	
}
