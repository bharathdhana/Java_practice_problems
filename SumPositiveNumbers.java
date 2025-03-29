/* Sum all Positive Numbers entered - Skip any negative numbers */

import java.util.Scanner;

public class SumPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (0 to 100): " );
        while (true) {
            int num = sc.nextInt();
            if(num == 0){
                break;
            }
            if(num < 0){
                continue;
            }
            sum += num;
            
        }
        System.out.println("Sum of Positive Numbers : "+sum);
    }
}
