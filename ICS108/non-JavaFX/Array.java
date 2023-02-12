//import java.util.Scanner;

public class Array {

    /*public static int[] ArrayFunctiin(int[] list) {
        for (int i = 0; i<list.length; i++) {
            list[i] = list[i] * -1;
        }
        return list;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];
        System.out.println("Enter your list: ");
        for (int i =0; i<arraySize; i++) {
            array[i] = input.nextInt();
        }
        int[] array2 = new int[arraySize];
        array2 = ArrayFunctiin(array);
        for (int i =0; i<arraySize; i++) {
            System.out.print(array2[i] + " ");
        }
        input.close();
    }*/

    public static void main(String[] args) {

        int[][] n = {{10}};
        change(n);
        System.out.print(n[0][0]);
    }
        public static void change(int[][] n) {
            int[][] m = {{20}};
            n = m;
           
        /*
        int max = 0;
        int checkedNumber = 0;
        int[]  array = {1,2,1,4,1,8};

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i+1]) {
                max = array[i];
                if (max > checkedNumber) {
                   checkedNumber = max;
                }
            }
            else {
                max = array[i+1];
                if (max > checkedNumber) {
                    checkedNumber = max;
                }
            }
        }
        System.out.print(checkedNumber);*/
    }
}



/*
 * Data_type  Variable name;
 * Variable_naem = value;
 * 
 * Each_position_data_type[]  Array name = new  Each_position_Data_type[Array_size];
 * 
 * Each_position_data_type[]  Array name;
 * Array_name = new  Each_position_Data_type[Array_size];
 * 
 * Each_position_data_type[]  Array name = {value_1, value_2, ..., value_n};
 */



/* *** in java
 * public class Array {
 *      public static void main(String[] args) {
 *          int[]  Array = {0, 1, 2, 3}; length = 152
            System.out.print(Array[Array.length - 1]);
 *      }
 * }
 */

 /* *** in python
  * list = [0, 1 2, 3]
  * print(list[-1])
  */

  /*
   * int max = 0;
   * checkedNumber = 0;
   * for (int i = 0; i < array.length, i++) {
   *    if (array[i] > array[i+1]) {
   *        max = array[i];
   *        if (max > checkedNumber) {
   *            checkedNumber = max
   *        }
   *    }
   * }
   * System.out.print(checkedNumber);
   */