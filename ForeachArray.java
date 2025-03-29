/* For-each to find the maximum number in the array */

import java.util.Scanner;

public class ForeachArray {
    public static void main(String[] args) {
        int[] arr = { 1,20,30,5,50,70,80,56  };
        int max = Integer.MIN_VALUE;

        for(int num : arr){
            if( num > max) {
                max = num;
            }
        }
        System.out.println("The Maximum number in the array : "+ max);
    }
}
