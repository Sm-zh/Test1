import java.util.Arrays;  
import java.util.Scanner;
public class Problem1 {
    public static void main(String[] arga) {

        Scanner input = new Scanner(System.in);

        //Declare a main array that will hold the elements//
        int[] mainArray = new int[1];

        //Declare a temporary array that will hold the main array elements when the user add a new element//
        int[] tempArray = new int[1];

        System.out.print("Enter the integers between 1 and 50: "); 
        int inputValue = input.nextInt();

        //Ensure that the user entered value is between 1 and 50//  
        while (inputValue < 1 || inputValue > 51) {
            System.out.print("Enter the integers between 1 and 50: "); 
            inputValue = input.nextInt();
        }

        while (inputValue != 0) {
            for (int i = 0;  i < mainArray.length; i++) {
                mainArray[i] = inputValue;
                inputValue = input.nextInt();
                while ((inputValue < 1 || inputValue > 51) && inputValue != 0) {
                    System.out.print("Enter the integers between 1 and 50: "); 
                    inputValue = input.nextInt();
                }

                /*
                *when the user enter a new value the old values will hold temporary in tha temporary array 
                *and add one more position for the main array 
                *and then return the old elements from the temporary array and add the new value
                */
                if (inputValue != 0) {
                    for (int j = 0; j <mainArray.length; j++) {
                        tempArray[j] = mainArray[j];
                        }
                        mainArray = new int[i+2];
                    for (int k = 0; k < tempArray.length; k++) {
                        mainArray[k] = tempArray[k];
                    }
                    mainArray[mainArray.length - 1] = inputValue;
                    tempArray = new int[i+2];
                }
            }
            if (inputValue != 0) {
                inputValue = input.nextInt();
                while ((inputValue < 1 || inputValue > 51) && inputValue != 0) {
                    System.out.print("Enter the integers between 1 and 50: "); 
                    inputValue = input.nextInt();
                }
            }
        }

        //Sorting the array for efficiency//
        Arrays.sort(mainArray);

        //Declare a variable called count that will count the frequency of the number//
        int count;
        
        for (int i = 0; i < mainArray.length-1; i++) {
            count = 1;        
            while ( i < mainArray.length-1 && mainArray[i] == mainArray[i+1]) {
                count++;
                i++;
            }
            if (count > 1) {
                System.out.println(mainArray[i] + " occurs " + count +  " times ");
            }
            else {
                System.out.println(mainArray[i] + " occurs " + count +  " time ");
            }
        }

        //when the final value is not equal to the previous value, the For-loop will not print it. Therefore If-loop should be created to print it// 
        if (mainArray[mainArray.length-1] != mainArray[mainArray.length-2]) {
            System.out.println(mainArray[mainArray.length-1] + " occurs 1 time ");
        }
        input.close();
    }
}