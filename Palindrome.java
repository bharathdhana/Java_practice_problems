/*  Checking whether the number is Palindrome or not */

import java.util.Scanner;

public class Palindrome {   
    public static boolean isPalindrome(int num){
        int originalnum = num;
        int reversed= 0;

        while (num>0) {
            int digits = num%10;
            reversed = (reversed*10) + digits;
            num /= 10;
        }
        return originalnum == reversed;
    } 
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(isPalindrome(num)){
            System.out.print(" Palindrome number ");
        } else {
            System.out.print(" Not a Palindrome number ");
        }
    }
    
}
