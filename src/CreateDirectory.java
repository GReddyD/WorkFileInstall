import java.io.File;

public class CreateDirectory {
	private File dir;

	public CreateDirectory(File dir){
		this.dir = dir;
	}

	public static void create(File dir){
		StringBuilder dirLog = new StringBuilder();
		if (dir.mkdir() == true) {
			System.out.println("Каталог " + dir.getName() + " создан");
			CreateLog.writeLog("Каталог " + dir.getName() + " создан");
		} else {
			System.out.println("Не удалось создать каталог "  + dir.getName());
			CreateLog.writeLog("Не удалось создать каталог "  + dir.getName());
		}
	}
}
