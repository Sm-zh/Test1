import java.io.File;

public class Lab21 {

    public static void main(String[] args) {
        // File aFile = new File("C:/Users/Nawaf/test-folder");
        // int depth = directoryDepth(aFile);
        // System.out.println(depth);
    }
    public static int directoryDepth(File folder) {
        int maxSize = 0;
        if (folder.isDirectory()) {
            File[] folders = folder.listFiles();
            for (int i = 0; i  < folders.length; i++) {
                int size = 1;
                size += directoryDepth(folders[i]);
                if (size > maxSize) {
                    maxSize = size;
                }
            }
        }
        return maxSize;

    }
    
}
