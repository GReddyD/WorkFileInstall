import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateLog {
	private String textLog;

	public CreateLog(String textLog) {
		this.textLog = textLog;
	}

	static StringBuilder Log = new StringBuilder();
	public static void writeLog(String textLog){
		Log.append(textLog).append("\n");
	}

	public static void writeLogToFile(File writeFile){
		try (FileWriter writer = new FileWriter(writeFile, true)){
			writer.write(String.valueOf(Log));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
