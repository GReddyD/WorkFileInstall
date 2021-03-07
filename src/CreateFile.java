import java.io.File;
import java.io.IOException;

public class CreateFile {
	private File file;

	public CreateFile(File file) { this.file = file; }

	public static void create(File file) {
		try {
			if (file.createNewFile() == true) {
				System.out.println("Файл " + file.getName() + " создан");
				CreateLog.writeLog("Файл " + file.getName() + " создан");
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			CreateLog.writeLog(e.getMessage());
		}
	}

	public static void createFileLog(File file) {
		try {
			if (file.createNewFile() == true) {
				System.out.println("Лог файл " + file.getName() + " создан");
				CreateLog.writeLog("Файл " + file.getName() + " создан");
				CreateLog.writeLogToFile(file);
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
			CreateLog.writeLog(e.getMessage());
			CreateLog.writeLogToFile(file);
		}
	}
}
