
public class Employee {
	public int empNum;
	public double empSal;
	
	
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public Employee() {
		this(1000,0.0);
	}
	public Employee(int empNum, double empSal) {
		super();
		this.empNum = empNum;
		this.empSal = empSal;
	}
	public  void sortArr(Employee emp[]) {
		int phase = 1;
		int size = emp.length;
		for (int i = 1 ; i<= size ; i++) {
			for (int j = 0 ; j< size-phase; j++) {
				if (emp[j].empNum > emp[j+1].empNum) {
					Employee temp = emp[j+1];
					emp[j+1]= emp[j];
					emp[j] = temp;
				}
			}phase++;
		}
		
	}
	@Override public  String toString(){
		String str = "Employee Number is  : " + empNum + "\nEmployeee Salary is : $" + empSal;
		return str;
		
	}

}
