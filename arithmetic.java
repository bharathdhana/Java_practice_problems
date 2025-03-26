import java.util.*;

public class arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        int add = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;
        
        System.out.println("addition of two numbers: "+add);
        System.out.println("subtraction of two numbers: "+sub);
        System.out.println("multiplication of two numbers: "+mul);
        System.out.println("division of two numbers: "+div);
        System.out.println("modulus of two numbers: "+mod);

        scanner.close();
    }
}
