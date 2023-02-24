package quizgui;

public class ComputeSalary extends Employee {

	public static int hourswork = Integer.parseInt(calling);
	public static int sss = 220;
	public static int pagibig = 100;

	
	ComputeSalary(String name, String department, char position, String age) {
		super(name, department, position, age);
		// TODO Auto-generated constructor stub
		
	}
	public static double getTax() {
		if(GUI.rbtnMess.isSelected()) {
		
			return 0.05;
		}
		else if(GUI.rdbtnEncoder.isSelected()) {
			
			return 0.06;
		}
		else if(GUI.rdbtnTechnician.isSelected()) {
			
			return 0.07;
		}
		else {
			
			return 0.08;
	}
		
}
	public static double getS() {
		if(GUI.rbtnMess.isSelected()) {
			return 5500;
			
		}
		else if(GUI.rdbtnEncoder.isSelected()) {
			return 6500;
		
		}
		else if(GUI.rdbtnTechnician.isSelected()) {
			return 7500;
			
		}
		else  {
			return 10000;
			
	}
	}
	
	public static double getWithTax() {
		return getS() * getTax();
	}
	
	public static double getOvertime() {
		if(hourswork > 160) {
			
			return (int) (getS() * 1.5);
		}
		else {
			return  getS();
		}
	}
	
	public static double getOT() {
		return (int) ((int) getOvertime() - getS());
	}
	
	public static double getDeductions() {
		return sss + pagibig + getWithTax();
	}
	
	public static double getNetSal() {
		return getOvertime() - getDeductions();
	}
	
	}

