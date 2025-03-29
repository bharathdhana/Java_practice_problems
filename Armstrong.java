/*  Checking the number is Armstrong number or not */

import java.util.Scanner;

public class Armstrong {
    public static boolean isArmstrong(int num){
        int originalnum = num;
        int sum= 0, digits = 0;

        int temp = num;
        while (temp!=0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while (temp!=0) {
            int digit = temp%10;
            sum += Math.pow(digit,digits);
            temp/=10;
        }
        return sum == originalnum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(isArmstrong(num)){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
