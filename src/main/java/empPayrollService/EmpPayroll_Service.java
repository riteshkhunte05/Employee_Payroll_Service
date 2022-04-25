package empPayrollService;
/**
 * Create Employee Payroll Class of id, name and Salary
 */
public class EmpPayroll_Service {

	int empId;
	String empName;
	float salary;
	public EmpPayroll_Service(int empId, String empName, float salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeePayroll [empId=" + empId + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}