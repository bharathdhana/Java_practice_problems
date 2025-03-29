/* Do-while to implement a number Guessing Game */
import java.util.Scanner;
import java.nio.ReadOnlyBufferException;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random ran = new Random();
        int SecretNum = ran.nextInt(100)+1;
        int guess;
        int attempts = 0;

        System.out.print("Guess the number btw 1 to 100 : ");

        do{
            System.out.println("Guess the number: ");
            guess = sc.nextInt();
            attempts++;

            if(guess>SecretNum){ 
                System.out.println("Too High, Try Again! ");
            } else if(guess<SecretNum) {
                System.out.println("Too Low,Try Again! ");
            } else {
                System.out.println("Congrats! , You guessed the number in " + attempts + " attempts ");
            }
         } while(guess != SecretNum);
    }    
}
