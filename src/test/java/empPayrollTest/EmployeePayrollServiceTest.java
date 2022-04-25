package empPayrollTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import empPayrollService.EmpPayroll_Main;
import empPayrollService.EmpPayroll_Service;
import junit.framework.Assert;

public class EmployeePayrollServiceTest {

	@Test
	public void readData_FromConsole() {
		EmpPayroll_Main empPayroll_Main = new EmpPayroll_Main();
		empPayroll_Main.readEmployeeDetails();
		
	}
	
	@Test
	public void printData_ToConsole() {
		EmpPayroll_Main empPayroll_Main = new EmpPayroll_Main();
		empPayroll_Main.printData();
		
	}
	
	@Test
	public void given3EmployeeDetails_WhenWrittenToFile_ShouldMatchEntries() throws IOException {
		EmpPayroll_Main empPayroll_Main = new EmpPayroll_Main();
		EmpPayroll_Service employee = new EmpPayroll_Service(101, "Ragu", 10000);
		EmpPayroll_Service employee1 = new EmpPayroll_Service(102, "Sam", 20000);
		EmpPayroll_Service employee2 = new EmpPayroll_Service(103, "Mark", 30000);
		List<EmpPayroll_Service> list = new ArrayList<EmpPayroll_Service>();
		list.add(employee);
		list.add(employee1);
		list.add(employee2);
		empPayroll_Main.writeToFile(list);
		empPayroll_Main.printData();
		long entries = empPayroll_Main.countLines();
		Assert.assertEquals(3, entries);
	}
}