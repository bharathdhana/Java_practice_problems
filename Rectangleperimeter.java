import java.util.Scanner;

public class Rectangleperimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Length of rectangle: ");
        double len = scanner.nextDouble();

        System.out.print("Width of rectangle: ");
        double wid = scanner.nextDouble();

        double perimeter = 2*(len+wid);
        System.out.print("Perimeter of Rectangle: "+perimeter);
        scanner.close();
    }
}
