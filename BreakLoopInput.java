/*  Read the inputs from the user and break the loop - exit keyword  */

import java.util.Scanner;

public class BreakLoopInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter something (type 'exit' to quit): ");
            String input = sc.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Exiting the Loop....");
                break;
            } 
            System.out.println("Entered: "+input);
        }
    }
}
