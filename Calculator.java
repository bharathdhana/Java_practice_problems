/* Simple Calculator using Switch statement to perform arithmetic OPerations */

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        int Option;
        System.out.print("Enter option: ");
        int option = sc.nextInt();
        switch (option) {
            case 1: System.out.println("Addition: "+(a+b)); break;
            case 2: System.out.println("Subtraction: "+(a-b)); break; 
            case 3: System.out.println("Multiplication: "+(a*b)); break;
            case 4: System.out.println("Division: "+(a/b)); break;
            default:
                break;
        }
    }
}
