import java.util.ArrayList;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<> names = new ArrayList<>();
		
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[4];
//		Employee[] newEmp = new Employee[4];
		
		emp[0] = new Employee(1,105.5);
		emp[1] = new Employee(2,105.5);
		emp[2] = new Employee(4,105.5);
		emp[3] = new Employee(3,105.5);
//		newEmp = emp;
//		newEmp[0] = new Employee(111,11);
		
		for(Employee emps:emp) {
			System.out.println(emps);
		}
		
		emp[0].sortArr(emp);
		for(Employee emps:emp) {
			System.out.println(emps);
		}
		
		
		
		

	}

}
