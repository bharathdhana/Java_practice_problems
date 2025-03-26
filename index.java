/* Program to respond with - name with skill development */

import java.util.*;

class index{
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = str.nextLine();
        System.out.println(" Welcome, "+name+" to Skill Development ");
        str.close();
    }
}