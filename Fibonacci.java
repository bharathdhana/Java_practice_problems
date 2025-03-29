/* Print the Fibonacci Series of certain integer */
import java.util.Scanner;
public class Fibonacci {
    static void fibonacci(int num){
        int a=0,b=1;
        System.out.print("Fibonacci Series: " + a + " " + b + " " );

        for(int i=2;i<num;i++){
            int next = a+b;
            System.out.print(next+ " ");
            a = b;
            b = next;
        }
        System.out.println();
    }    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num= sc.nextInt();

        //System.out.println("Fibonacci Series"+fibonacci(num));
        fibonacci(num);
        }
    }

