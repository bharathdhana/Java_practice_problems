/* Finding the Least Common Multiple of two numbers */
import java.util.Scanner;

public class LeastCommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  

        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        System.out.println("LCM of two numbers: " + lcm(a, b));
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a / gcd(a, b)) * b;
    }
}
