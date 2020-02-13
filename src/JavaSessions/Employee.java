package JavaSessions;

public class Employee {
	//Data members of the class
	//Variables - class variables
	//variables in methods are called local variables
	String name;
	int age;
	int employeeId;
	String deptname;
	boolean isPermanent;
	char gender;
	public void getname() {
		System.out.println("get method name");
	}

	public static void main(String[] args) {
		
	Employee emp = new Employee();
	emp.name = "Tresa";
	emp.age = 25;
	emp.employeeId = 1;
	emp.deptname = "QA";
	emp.isPermanent = true;
	emp.gender = 'f';
	
	Employee emp1 = new Employee();
	emp1.name = "Animesh";
	emp1.age = 28;
	emp1.employeeId = 2;
	emp1.deptname = "BA";
	emp1.gender = 'm';
	
	System.out.println(emp.name+ " "+emp.age+" "+emp.employeeId+ " "+" "+emp.deptname+" "+emp.isPermanent+" "+emp.gender);
	System.out.println(emp1.name+ " "+emp1.age+" "+emp1.employeeId+ " "+" "+emp1.deptname+" "+emp1.isPermanent+" "+emp1.gender);
	
	emp.getname();
	emp1.getname();

	}

}
