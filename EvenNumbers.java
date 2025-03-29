/* Printing only Even numbers -- Skipping odd numbers */

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for(int i=1; i <= 20; i++){
            if(i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
        
    }
}
