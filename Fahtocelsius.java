/* Fahrenheit to Celsius */

import java.util.*;
public class Fahtocelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Fahreinheit: ");
        double Fahreinheit = scanner.nextDouble();
        
        double Celsius = (Fahreinheit-32)*5/9;
        System.out.println("Temperature in Celsius:"+Celsius);
        scanner.close();
    }
    
}
