/* Bitwise Complement of a number */

import java.util.Scanner;

public class Complement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int num1 = sc.nextInt();

        int res = ~num1;
        System.out.println("Complement of number is: "+res);
        }    

}
