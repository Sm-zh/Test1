import java.util.ArrayList;

public class Lab23 {
    public static void main(String[] args ) {
        ArrayList <Integer> aList = new ArrayList<>();
        for (int i = 2; i < 101; i++) {
            aList.add(i);
        }

        for (int i = 0; i < aList.size(); i++) {
            for (int j = i+1; j < aList.size(); j++) {
                if (aList.get(j) % aList.get(i) == 0) {
                    aList.remove(j);
                }
            }  
            // int input = aList.get(i);
            // aList.removeIf(a->a != input && a%input ==0);
        }

        System.out.println(aList);
    }
    
}
