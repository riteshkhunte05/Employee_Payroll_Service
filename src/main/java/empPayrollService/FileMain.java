package empPayrollService;

import java.io.IOException;

/**
 * program to demonstrate File Operations like - Check File Exists - Delete File
 * and Check File Not Exist - Create Directory - Create Empty File - List Files,
 * Directories as well as Files with extensions
 */
public class FileMain {
	static String path = "E:\\Demo Files\\Employee Payroll service";
	public static void main(String[] args) throws IOException {
		FileUtil fileUtil = new FileUtil();
		// checking whether file exists or not
		System.out.println(fileUtil.isFileExists("demo.txt"));

		// deleting the file and checking whether file exists or not
		fileUtil.deleteFile("demo1.txt");
		System.out.println(fileUtil.isFileExists("demo1.txt"));

		// creating a directory
		fileUtil.createDirectory("lib");
		
		//create a empty file
		fileUtil.createEmptyFile("demo2.txt");
		
		//list directories and files
		fileUtil.listFilesDirectories(path);
	}
}