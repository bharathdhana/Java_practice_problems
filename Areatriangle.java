import java.util.Scanner;

public class Areatriangle {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("base of triangle: ");
    double base = scanner.nextDouble();

    System.out.print("height of triangle: ");
    double height = scanner.nextDouble();

    double area = 0.5 * base * height;
    System.out.println("Area of triangle: "+area);
    scanner.close();
}   
}
