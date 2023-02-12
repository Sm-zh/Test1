package HW3;

import java.io.File;

public class Problem2 {
    public static void main(String[] args) {
        File folder = new File("C:\\Users\\Nawaf\\OneDrive\\DeskTop\\sample");
        System.out.println(folder.getName());
        Directorystructure(folder);
    }

    public static void Directorystructure(File folder) {
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("+--" + listOfFiles[i].getName());
            }
            else if (listOfFiles[i].isDirectory()) {
                System.out.println("+--" + listOfFiles[i].getName());
                Directorystructure2(listOfFiles[i]);
            }
        }
    }

    public static void Directorystructure2(File folder) {
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println("    +--" + listOfFiles[i].getName());
            }
            else if (listOfFiles[i].isDirectory()) {
                System.out.println("    +--" + listOfFiles[i].getName());
                System.out.print("    ");
                Directorystructure2(listOfFiles[i]);
            }
        }
    }
    
}
