/* Program to swap two numbers */
import java.util.*;

public class swap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.print("After Swapping: a = " + a + ", b = " + b);
        scanner.close();

    }
}
