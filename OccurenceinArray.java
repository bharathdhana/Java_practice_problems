/* Finding the Occurence in the element of an array - using for-each */

import java.lang.reflect.Array;
import java.util.*;
import java.util.Scanner;

public class OccurenceinArray {
    public static void main(String[] args) {
        int[] arr = { 10,20,30,50,10,20,30,50,70,80,100 };
        Arrays.sort(arr);

        System.out.println("Occurences of elements in array: ");

        int count = 1;
        for(int i = 1; i < arr.length;i++){
            if(arr[i] == arr[i-1]){
                count++;
            } else {
                System.out.println(arr[i-1] + " appears " + count + " times ");
                count = 1;
            }
        }
        System.out.println(arr[arr.length - 1 ] + " appears " + count + " times ");
    }
}
