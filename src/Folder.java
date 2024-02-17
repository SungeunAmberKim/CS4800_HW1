import java.util.ArrayList;
import java.util.List;


public class Folder {
    private String name;
    private List<File> files;
    private List<Folder> subFolders;

    public Folder() {
        this.name = "";
        this.files = new ArrayList<>();
        this.subFolders = new ArrayList<>();
    }
    public void setName(String name) {
        this.name = name;
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void addSubFolder(Folder folder) {
        this.subFolders.add(folder);
    }

    public void deleteSubFolder(String folderName) {
        this.subFolders.removeIf(folder -> folder.getName().equals(folderName));
    }

    public String getName() {
        return name;
    }
    public void print(String indentation) {
        System.out.println(indentation + getName() + "/");
        String newIndentation = indentation + "   ";
        for (Folder subFolder : subFolders) {
            subFolder.print(newIndentation);
        }
        for (File file : files) {
            file.print(newIndentation);
        }
    }

}
