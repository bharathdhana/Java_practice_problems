/*  Printing Multiplication table using given number */
import java.util.Scanner;

public class Tables {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.print("Enter number: ");
    int num1 = sc.nextInt();

    for(int i = 1;i<=10;i++){
        System.out.println(num1 + " x " + i + " = " + (num1 * i));
    }
 }   
}
