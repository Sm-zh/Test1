package HW3;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {

        // long startTime = System.currentTimeMillis(); 
        // int i = 0;
        // while (i <= 1000000000) {
        //     i++;
        // }
        // long endTime = System.currentTimeMillis();
        // long executionTime = endTime - startTime;
        // System.out.println("Execution Time is: " + executionTime + "ms");
        

        for (int i = 0; i < 6; i++) {  
            int inputSize = 60000 * (i+1);
            int[] aList = new int[inputSize];
            for (int j = 0; j < (inputSize); j++) {
                int rand = (int)(Math.random() * inputSize);
                aList[j] = rand;
            } 

            int[] cloneArray, cloneArray2, cloneArray3, cloneArray4;
            cloneArray = Arrays.copyOfRange(aList, 0, aList.length);  
            cloneArray2 = Arrays.copyOfRange(aList, 0, aList.length);  
            cloneArray3 = Arrays.copyOfRange(aList, 0, aList.length);  
            cloneArray4 = Arrays.copyOfRange(aList, 0, aList.length);  

            System.out.println("Execution Time for " + inputSize + " elements is:");
            long startTime = System.currentTimeMillis(); 
            selectionSort(cloneArray);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Execution Time for Selection Sort is: " + executionTime + "ms");

            startTime = System.currentTimeMillis(); 
            bubbleSort(cloneArray2);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Execution Time for Bubble Sort is: " + executionTime+ "ms");

            startTime = System.currentTimeMillis(); 
            mergeSort(cloneArray3);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Execution Time for Merge Sort is: " + executionTime+ "ms");

            startTime = System.currentTimeMillis(); 
            quickSort(cloneArray4);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Execution Time for Quick Sort is: " + executionTime+ "ms\n");
        }
    }
 
    /*Selection Sort*/
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;
            for (int j = i + 1; j <list.length; j++) {
                if (currentMin > list [j]) {
                    currentMin = list [j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list [currentMinIndex] = list [i];
                list[i] = currentMin;
            }
        }
    }

    /*Bubble Sort */
    public static void bubbleSort(int[] list) {
        boolean needNextPass = true;
        for (int k = 1; k < list.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i + 1]) {
                    int temp = list[i];
                    list[i] = list[i + 1];
                    list [i + 1] = temp;
                    needNextPass = true;
                }
            }
        }
    }

    /*Merge Sort*/
    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int[] firstHalf = new int[list.length / 2];
            System.arraycopy(list, 0, firstHalf, 0, list.length / 2);
            mergeSort(firstHalf);

            int secondHalfLength = list.length - list.length / 2;
            int[] secondHalf = new int[secondHalfLength];
            System.arraycopy(list, list.length / 2, secondHalf, 0, secondHalfLength);
            mergeSort (secondHalf);
            merge(firstHalf, secondHalf, list);
        }
    }

    public static void merge(int[] list1, int[] list2, int[] temp) {
        int current1 = 0;
        int current2 = 0;
        int current3 = 0;

        while (current1 < list1.length && current2 < list2.length) {
            if (list1[current1] < list2 [current2]) {
                temp[current3++] = list1 [current1++];
            }
            else {
                temp[current3++] = list2 [current2++];
            }
        }
        while (current1< list1.length) {
            temp[current3++] = list1 [current1++];
        }

        while (current2<list2.length) {
            temp [current3++] = list2 [current2++];
        }
    }

    /*Quick Sort*/
    public static void quickSort(int[] list) {
        quickSort(list, 0, list.length - 1);
    }

    private static void quickSort(int[] list, int first, int last) {
        if (last > first) {
            int pivotIndex  = partition(list, first, last);
            quickSort(list, first, pivotIndex - 1);
            quickSort(list, pivotIndex + 1, last);
        }
    }

    private static int partition(int[] list, int first, int last) {
        int pivot = list[first];
        int low = first + 1;
        int high = last;

        while (high > low) {
            while (low <= high && list[low] <= pivot) {
                low++;
            }

            while (low <= high && list [high] > pivot) {
                high--;
            }

            if (high > low) {
                int temp = list[high];
                list[high] = list [low];
                list[low] = temp;
            }
        }

        while (high > first && list[high] >= pivot) {
            high--;
        }

        if (pivot > list[high]) {
            list[first] = list[high];
            list[high] = pivot;
            return high;
        }
        else {
            return first;
        }
    }
                
}