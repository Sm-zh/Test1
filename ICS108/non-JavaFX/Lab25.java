// import java.io.File;
// import java.io.FileNotFoundException;
// import java.util.Scanner;
// import java.util.TreeMap;
// import java.util.TreeSet;

// public class Lab25 {
//     public static void main(String[] args) {
//         TreeMap<String, TreeSet<Integer>> courses = new TreeMap<>();
//         File file = new File("sortedStudent.dat");
//         try (Scanner in = new Scanner(file)) {
//             while (in.hasNext()) {
//                 int id = in.nextInt();
//                 String course = in.next();
//                 String team = in.next();
//                 String team2 = in.next();
//                 int g = in.nextInt();
//                 int g2 = in.nextInt();

//                 if (courses.containsKey(course)) {
//                     courses.get(course).add(id);
//                 }

//                 else {
//                     TreeSet<Integer> treeSet = new TreeSet<>();
//                     treeSet.add(id);
//                     courses.put(course, treeSet);
//                 }
//             }
//         }
//         catch (FileNotFoundException e) {
//             e.printStackTrace();
//         }
//     }
    
// }
