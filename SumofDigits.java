/*Computes the sum of the digits of an integer */

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int sum=0;
        while(num != 0) {
            sum += num % 10;
            num /= 10;
        }
        System.out.println("Sum of digits: "+sum);
    }
}
