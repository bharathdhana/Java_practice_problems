/* Left Shift Operator */
import java.util.Scanner;

public class LeftShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int num1 =sc.nextInt();
        System.out.println("Enter shift value: ");
        int val = sc.nextInt();

        int res = num1 << val;
        System.out.println("Result of Left shift Operation: "+res);

    }
}
