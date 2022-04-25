package empPayrollService;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

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

		// create a empty file
		fileUtil.createEmptyFile("demo2.txt");

		// list directories and files
		fileUtil.listFilesDirectories(path);

		//watch service example
		Path dir = Paths.get(path);
		new Java8WatchServiceExample(dir).processEvents();
	}
}