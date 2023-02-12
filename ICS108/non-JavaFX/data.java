import java.util.Scanner;
public class data {


    public static boolean isSorted(int[] array) {
        boolean cond = true;
        for (int i = 0; cond && i < array.length -1; i++) 
            if (array[i] > array[i+1]) 
                cond = false;
        return cond;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = input.nextInt();
        System.out.println("Enter the contents of the array: ");
        int[] list = new int[size];
        for (int i=0; i<size; i++) 
            list[i] = input.nextInt();
        if (isSorted(list))
            System.out.print("The array is sorted");
        else
            System.out.print("The array is not sorted");
        input.close();
    }
}