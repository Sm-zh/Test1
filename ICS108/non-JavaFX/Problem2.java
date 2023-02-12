import java.util.Scanner;
public class Problem2 {

    public static boolean isSortedConstantInterval(int[] list) {
        int difference = 0;
        boolean condition = true;
        for (int i = 0; condition && i < list.length - 1; i++) {
            if (i == 0) {
                difference = list[i+1] - list[i];
                if (list[i] > list[i+1]) {
                    condition = false;
                }
            }
            else if (difference != list[i+1] - list[i] || list[i] > list[i+1]) {
                condition = false;
            }
        }
        return condition;
    }
    
    public static void main(String[] arga) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++ ) {
            array[i] = input.nextInt();
        }
        if (isSortedConstantInterval(array)) {
            System.out.print("The list is sorted with a constant interval");
        }
        else {
            System.out.print("The list is not sorted with a constant interval");
        }
        input.close();        
    }
} 