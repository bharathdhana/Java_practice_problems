/* Bitwise XOR operator of two numbers */

import java.util.Scanner;

public class XorOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int num1 = sc.nextInt();
        System.out.print("Enter b: ");
        int num2 = sc.nextInt();

        int res = num1 ^ num2;
        System.out.println("Bitwise XOR of two numbers is "+res);
    }
}
