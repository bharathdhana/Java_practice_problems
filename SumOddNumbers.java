/* Sum of all odd numbers from 1 to specified range N */

import java.util.Scanner;

public class SumOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number :");
        int num = sc.nextInt();

        int sum = 0;
        for(int i=1;i<=num;i += 2){
            sum += i;
        }
        System.out.println("Sum of all odd numbers:" + num + " is " +sum );
    }
}
