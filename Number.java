/* If a number is positive, negative or zero */

import java.util.*;
public class Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        if (number>0){
            System.out.print("The number is positive.");   
        }
        else if(number<0){
            System.out.print("The number is negative.");
        }
        else {
            System.out.print("The number is zero.");
        }
        scanner.close();
        }
     }
    
