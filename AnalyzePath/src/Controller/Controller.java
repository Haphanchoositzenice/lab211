package Controller;

import java.io.File;
import java.util.Scanner;

public class Controller {
    public String checkInputString() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String result = in.nextLine().trim();
            if (result.length() == 0) {
                System.err.println("Not empty.");
            } else {
                return result;
            }
        }
    }

    public void checkInputPath() {
        System.out.print("Please input Path: ");
        String path = checkInputString();
        File file = new File(path);
        if (file.exists() && file.isFile()) {
            System.out.println("Disk: " + getDisk(path));
            System.out.println("Extension: " + getExtension(path));
            System.out.println("File name: " + getFileName(path));
            System.out.println("Path: " + getPath(path));
            System.out.println("Folders: " + getFolder(path));
        } else {
            System.err.println("Path isn't file.");
        }
    }
    String getPath(String path) {

        int toNameFile = path.lastIndexOf("\\");
        return path.substring(0, toNameFile);
    }

    String getFileName(String path) {
        int positionFrom = path.lastIndexOf("\\");
        int positionTo = path.lastIndexOf(".");
        return path.substring(positionFrom + 1, positionTo);
    }

    String getExtension(String path) {
        int positionDot = path.lastIndexOf(".");
        return path.substring(positionDot+1, path.length());
    }

    String getDisk(String path) {
        int positionColon = path.indexOf("\\");
        return path.substring(0, positionColon);
    }

    String getFolder(String path) {
        int positionSlash = path.lastIndexOf("\\");
        String folderPath = path.substring(0, positionSlash);
        int positionSlashInFolder = folderPath.lastIndexOf("\\");
        return "["+folderPath.substring(positionSlashInFolder + 1, positionSlash)+"]";
    }
}
