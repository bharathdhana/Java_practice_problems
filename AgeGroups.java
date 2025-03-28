/* Categorize the person into different age groups */

import java.util.*;
public class AgeGroups {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if(age<=13){
            System.out.print("Child");
        } else if (age<=20) {
            System.out.print("Teen");
        } else if(age<=60) {
            System.out.print("Adult");
        } else if(age>60)
        {
            System.out.print("Senior");
        }
    }
    
}
