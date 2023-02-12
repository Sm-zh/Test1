import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Lab01 {
    public static void main(String[] atgs) {
        Scanner input = new Scanner(System.in);
        ArrayList <String> students = new ArrayList<>();
        File Sfile = new File("StudentsName.txt");
        try (Scanner inputname = new Scanner(Sfile)){
            while(inputname.hasNext()){
                String name = inputname.next();
                students.add(name);

            }  
        }
        catch(FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Option 1: Number of groups\nOption 2: set Maximum");
        int option = input.nextInt();
        int groupNum;
        boolean cond;
        if (option == 1) {
            System.out.print("Number of groups: ");
            groupNum = input.nextInt();
            String[][] groups = new String[groupNum][];
            int studentNum = students.size();
            int x = studentNum/groupNum;
            cond = studentNum % groupNum != 0;
            for (int i = 0; i < groupNum; i++) {
                String[] group;
                if (cond && i == groupNum-1) {
                    group = new String[x+1];
                }
                else {
                    group = new String[x];
                }
                for (int j = 0; j < x; j++) {
                    int rand = (int) (Math.random() * (students.size()));
                    group[j] = students.get(rand);
                    students.remove(rand);
                }
                if (cond && i == groupNum-1) {
                    group[x] = students.get(0);
                }
                groups[i] = group;
            }
            int c = 1;
            for (String[] teams: groups) {
                System.out.println("\nGroup " + c++ + ":");
                for (String name: teams) {
                    if (name != null)
                        System.out.println(name);
                }
                System.out.println("\n");
            }
        }
        else {
            System.out.print("Maximum number of students for each group: ");
            int maxStudents = input.nextInt();
            if (students.size() % maxStudents != 0){    
                int maxCount = 1;
                ArrayList <String[]> maxGroups = new ArrayList<>();
                String[] group = new String[maxStudents];
                for (int i = 0; i < maxStudents; i++) {
                    int rand = (int) (Math.random() * (students.size()));
                    group[i] = students.get(rand);
                    students.remove(rand);
                    if (i == maxStudents -1) {
                        maxGroups.add(group);
                    }
                }
                while (students.size() % (maxStudents-1) != 0) {
                    maxCount++;
                    group = new String[maxStudents];
                    for (int i = 0; i < maxStudents; i++) {
                        int rand = (int) (Math.random() * (students.size()));
                        if (students.size() > 0) {
                            group[i] = students.get(rand);
                            students.remove(rand);
                        }
                        if (i == maxStudents -1) {
                            maxGroups.add(group);
                        }
                    }
                }
                groupNum = students.size() / (maxStudents-1);
                int x;
                if (groupNum != 0)
                    x = students.size() / groupNum;

                else 
                    x = 0;

                String[][] groups = new String[groupNum+maxCount][];
                for (int i = 0; i < groupNum; i++) {
                    group = new String[x];
                    for (int j = 0; j < x; j++) {
                        int rand = (int) (Math.random() * (students.size()));
                        group[j] = students.get(rand);
                        students.remove(rand);
                    }
                    groups[i] = group;
                }
                for (int i = groupNum; i < groupNum + maxCount; i++) {
                    groups[i] = maxGroups.get(0);
                    maxGroups.remove(0);
                }
                int c = 1;
                for (String[] teams: groups) {
                    System.out.println("Group " + c++ + ":");
                    for (String name: teams) {
                        if (name != null)
                            System.out.println(name);
                    }
                    System.out.println("\n");
                }
            }
            else {
                groupNum = students.size() / maxStudents;
                String[][] groups = new String[groupNum][];
                for (int i = 0; i < groupNum; i++) {
                    String[] group;
                    group = new String[maxStudents];
                    for (int j = 0; j < maxStudents; j++) {
                        int rand = (int) (Math.random() * (students.size()));
                        group[j] = students.get(rand);
                        students.remove(rand);
                    }
                    groups[i] = group;
                }
                int c = 1;
                for (String[] teams: groups) {
                    System.out.println("Group " + c++ + ":");
                    for (String name: teams) {
                        if (name != null)
                            System.out.println(name);
                    }
                    System.out.println("\n");
                }
            }
        }
        input.close();
    }
}