package empPayrollService;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class EmpPayroll_Main {

	static List<EmpPayroll_Service> list = new ArrayList<EmpPayroll_Service>();
	String path = "E:\\Demo Files\\Employee Payroll service\\employee.txt";

	public void readEmployeeDetails() {

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

	
	private void printEmployeeDetails() {

		System.out.println("Writing employee details to console :\n" + list);
	}

	
	public void writeToFile(List<EmpPayroll_Service> employeeList) {
		final StringBuffer empBuffer = new StringBuffer();
		employeeList.forEach(new Consumer<EmpPayroll_Service>() {
			public void accept(EmpPayroll_Service employee) {
				String employeeDataString = employee.toString().concat("\n");
				empBuffer.append(employeeDataString);
			}
		});

		try {
			Files.write(Paths.get(path), empBuffer.toString().getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	public void printData() {
		try {
			Files.lines(new File(path).toPath()).forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	
	
	public long countLines() throws IOException {
		long entries = 0;
		entries = Files.lines(new File(path).toPath()).count();
		return entries;
	}

}