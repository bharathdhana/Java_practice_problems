/* Finding the sum and average of all elements in a array */

import java.util.Scanner;

public class SumandAverage{
public static void main(String[] args) {
  int[] arr = {10,20,30,40,50};
  int sum = 0;

  for (int num : arr){
    sum += num;
  }
  double average = (double)sum/arr.length;

  System.out.println("Sum : "+sum);
  System.out.println("Average : " +average);
  
} 
}