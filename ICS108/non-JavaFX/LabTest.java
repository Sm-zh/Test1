import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LabTest {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("sortedStudent.dat");
        TreeMap<String, TreeSet<String>> keys = new TreeMap<>();
        try (Scanner in = new Scanner(file)) {
            while(in.hasNext()) {
                ArrayList<Integer> team = new ArrayList<>();
                ArrayList<Integer> team2 = new ArrayList<>();
                int group = in.nextInt();
                String groupAndTeam = group + " " + in.next();
                String groupAndTeam2 = group + " " + in.next();
                int g = in.nextInt();
                int g2 = in.nextInt();

                if (keys.containsKey(groupAndTeam)) {
                    
                    }

                else {
                    TreeSet<String> treeSet = new TreeSet<>();
                    TreeSet<String> treeSet2 = new TreeSet<>();
                    if (team.size()>0) {
                        if(g > g2) {
                            System.out.println(1);
                            team.set(0, team.get(0)+g-g2);
                            team.set(1, team.get(1)+3);
                            team2.set(0, team2.get(0)+g2-g);

                        }
                        else if (g == g2) {
                            System.out.println(2);
                            team.set(0, team.get(0)+1);
                            team2.set(0, team2.get(0)+1);
                        }
                        String t = team.get(0) + " " + team.get(1);
                        String t2 = team2.get(0) + " " + team2.get(1);
                        treeSet.add(t);
                        treeSet2.add(t2);
                        keys.put(groupAndTeam, treeSet);
                        keys.put(groupAndTeam2, treeSet2);
                    }

                    else {
                        if(g > g2) {
                            team.add(+g-g2);
                            team.add(+3);
                            team2.add(0, g2-g);
                            team2.add(0, 0);

                        }
                        else if (g == g2) {
                            team.add(0, team.get(0));
                            team.add(1, team2.get(0)+1);
                            team2.add(0, team.get(0));
                            team2.add(1, team2.get(0)+1);
                        }
                        String t = team.get(0) + " " + team.get(1);
                        String t2 = team2.get(0) + " " + team2.get(1);
                        treeSet.add(t);
                        treeSet2.add(t2);
                        System.out.println(treeSet + " " + treeSet2);
                        keys.put(groupAndTeam, treeSet);
                        keys.put(groupAndTeam2, treeSet2);
                        System.out.println(keys);
                    }
                }
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(keys);
    }
    
}
