package quizgui;

public abstract class Employee {
	

	public static String name,age,department,position;
	public static int hourswork;
	public static String calling = GUI.tfHourswork.getText();
	
	Employee(String name,String department,char position,String age){
	setName(name);
	setAge(age);
	setDepartment(department);
	
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getHourswork() {
		return hourswork;
	}

	public void setHourswork(int hourswork) {
		this.hourswork = hourswork;
	}

	

}
