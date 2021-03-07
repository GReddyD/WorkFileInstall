import java.io.File;

public class Main {
  public static void main(String[] args) {
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/src"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/src/main"));
    CreateFile.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/src/main//Main.java"));
    CreateFile.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/src/main//Utils.java"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/src/test"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/res"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/res/drawables"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/res/vectors"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/res/icons"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/savegames"));
    CreateDirectory.create(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/temp"));
    CreateFile.createFileLog(new File("/Users/greddyd/IdeaProjects/WorkFileInstall/Games/temp//temp.txt"));
  }
}
