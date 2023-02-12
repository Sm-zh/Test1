import java.util.Scanner;

public class lab3 {

    public static boolean equals(int[] list1, int[] list2) {
        boolean cond = true;
        if (list1.length == list2.length) {
                for (int i = 0; i < list1.length; i++) {
                    if (list1[i] != list2[i]) {
                        cond = false;
                    }
                }
        } else {
            cond = false;
        }
        return cond;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list1 size");
        int list1Size = input.nextInt();
        int[] array1 = new int[list1Size];
        System.out.println("Enter list1");
        for (int i = 0; i < list1Size; i++) {
            array1[i] = input.nextInt();
        }
        System.out.println("Enter list2 size");
        int list2Size = input.nextInt();
        int[] array2 = new int[list2Size];
        System.out.println("Enter list2");
        for (int i = 0; i < list2Size; i++) {
            array2[i] = input.nextInt();
        }
        if (equals(array1, array2)) {
        System.out.println("list1 and list2 are equal");
        } else {
            System.out.println("list1 and list2 are not equal");
        }
        input.close();
    }
}
