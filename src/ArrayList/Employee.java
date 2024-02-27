package ArrayList;



public class Employee {
	
	String empName;
	String empid;
	double empSalary;
	String empAddress;
	public Employee() {
		
	}
	
	public Employee(String empName, String empid, double empSalary, String empAddress) {
		super();
		this.empName = empName;
		this.empid = empid;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empid=" + empid + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}
	
	
	
	
	

}
