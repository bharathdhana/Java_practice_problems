/* Checking whether the Given number is Prime or NOT */

import java.util.Scanner;

public class PrimeNumber {

    public static boolean isPrime(int n){
       if(n<=1) return false;

       for (int i = 2 ; i < n ; i++ ) 
        if( n % i == 0 )
            return false;
        
       return true;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num =sc.nextInt();

        if (isPrime(num)) {
            System.out.print(" Prime number "); 
        } else {
            System.out.print(" Not a prime number ");
        }

    }
    
}
