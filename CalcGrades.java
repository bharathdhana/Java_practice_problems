/* Calculating the grades based on marks */

import java.util.*;
public class CalcGrades {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      
      System.out.print("Enter marks (0-100): ");
      int marks = scanner.nextInt();

      String grade;

      if(marks>=90){
        grade = "A";
      } else if(marks>=75) {
        grade = "B";
      } else if(marks>=60) {
        grade = "C";
      } else if(marks>=30) {
        grade = "D";
      } else {
        grade = "F(Fail)";
      }
      System.out.println("Your grade is: "+grade);
      scanner.close();
    }
}