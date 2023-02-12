package LabProject;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class DPReader {
    public static TreeMap<String, ArrayList<String>> dPReader(File file) {
        TreeMap<String, ArrayList<String>> DPlan = new TreeMap<>();
        try (Scanner input = new Scanner(file)) {
            input.nextLine();
            while(input.hasNext()){
            ArrayList <String> quest = new ArrayList<>();
            String Line = input.nextLine();
            String [] info = Line.split(",");
            quest.add(info[2]);
            quest.add(info[3]);
            DPlan.put(info[0], quest);
            
            }
            
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return DPlan;
    }
    
}
