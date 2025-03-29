/* Print the month of the year based on the number (1-12)  */
import java.util.Scanner;
import java.time.Month;
public class MonthofYear {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter month(1-12): ");
        int num =sc.nextInt();

        //Switch case ::

        if(num < 1 || num > 12) {
            System.out.println("Invalid input");
        } else {
            Month month= Month.of(num);
            System.out.println("Month name: "+month);
        }
    }    
}
