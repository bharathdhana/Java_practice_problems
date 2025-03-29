/* Finding the Minimum of two numbers */

import java.util.Scanner;

public class MinofTwo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int min = ( a < b ) ? a : b;
        System.out.println("Minimum: "+min);
    }
}
