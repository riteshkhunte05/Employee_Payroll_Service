package empPayrollTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Assert;
import org.junit.Test;

import empPayrollService.FileUtil;

public class FileTest {

	@Test
	public void givenFileName_AsInput_ShouldReturnTrue_IfExists() {
		FileUtil util = new FileUtil();
		util.isFileExists("demo.txt");
		Assert.assertTrue(util.isFileExists("demo.txt"));

	}

	@Test
	public void givenFileName_AsInput_ShouldReturnFalse_IfNotExists() throws IOException {
		FileUtil util = new FileUtil();
		util.deleteFile("demo2.txt");
		Assert.assertFalse(util.isFileExists("demo2.txt"));

	}
	
	@Test
	public void givenDirectoryName_ShoulCreateDirectory_ReturnTrue() throws IOException {
		FileUtil util = new FileUtil();
		util.createDirectory("lib");
		Assert.assertTrue(Files.isDirectory(Paths.get("E:\\Demo Files\\Employee Payroll service\\lib")));
	}
	
	@Test
	public void givenFileName_AsInput_ShouldCreateFile_ShouldReturntrue() throws IOException {
		FileUtil util = new FileUtil();
		util.createEmptyFile("demo2.txt");
		Assert.assertTrue(Files.exists(Paths.get("E:\\Demo Files\\Employee Payroll service\\demo2.txt")));
	}

}