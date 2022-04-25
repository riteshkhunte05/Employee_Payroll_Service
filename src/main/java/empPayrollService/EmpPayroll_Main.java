package empPayrollService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class EmpPayroll_Main {

	static List<EmpPayroll_Service> list = new ArrayList<EmpPayroll_Service>();

	public static void main(String[] args) {
		readEmployeeDetails();
		printEmployeeDetails();

	}

	private static void readEmployeeDetails() {

		Scanner scanner = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id ");
		int empId = scanner.nextInt();

		System.out.println("Enter employee name");
		String empName = sc.nextLine();

		System.out.println("Enter employee salary");
		float empSalary = sc.nextFloat();

		EmpPayroll_Service employee = new EmpPayroll_Service(empId, empName, empSalary);
		employee.setEmpId(empId);
		employee.setEmpName(empName);
		employee.setSalary(empSalary);
		list.add(employee);
	}


	private static void printEmployeeDetails() {

		System.out.println("Employee Details as follows :\n" + list);
	}

}