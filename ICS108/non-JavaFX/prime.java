// import java.util.Scanner;

public class prime {
    public static void main(String[] args) {

        // Scanner input = new Scanner(System.in);
        // System.out.print("Enter your starting point that greater than 1: ");
        // int a = input.nextInt();
        // while (a <= 1) {
        //     System.out.print("Starting point must be grater than 1! \nEnter your starting point that greater than 1: ");
        //     a = input.nextInt();
        // }
        // System.out.print("Enter your ending point: ");
        // int b = input.nextInt();
        // while (a > b) {
        //     System.out.print("Ending point must be greater than the starting point! \nEnter your ending point: ");
        //     b = input.nextInt();
        // }
        // for (int i = a; i <= b; i++) {
        //     boolean cond = true;
        //     for (int j = 2; cond && j <= Math.sqrt(i); j++) {
        //         if (i % j == 0) {
        //         cond = false;
        //         }   
        //     }
        //     if (cond) {
        //         System.out.print(i + " --- ");
        //     }
        // }
        // input.close();

        /*--------------------------------------------------*/

        //n = 14923529
        int n = 14923529;
        while (true) {
            boolean cond = true;
		    for (int i = 2; cond && i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    cond = false;
                }
                
            }
            if (cond) {
                System.out.print(n + " --- ");
            }
            n++;
        }
    }
    
}