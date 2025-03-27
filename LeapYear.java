/* Checking year is leap year or not */

import java.util.*;
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if((year%4==0 && year%100 != 0) || (year%400==0)) {
            System.out.print(year + " is a leap year ");
        }
        else {
            System.out.print(year + " is not leap year ");
        } 
        scanner.close();
    }
    
}
