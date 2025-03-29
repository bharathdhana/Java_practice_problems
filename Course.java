/* 
Design a Course class.
• Instance variables: courseName, enrolledStudents.
• Static variable: maxCapacity, the maximum number of students for any course.
• Instance methods: enrollStudent(String studentName), unenrollStudent(String studentName).
• Static method: setMaxCap
*/

import java.util.ArrayList;
import java.util.List;

public class Course {
 private String coursename;
 private List<String> enrolledStudents;
 private static int maxCapacity = 30;
 
 public Course(String coursename){
    this.coursename = coursename;
    this.enrolledStudents = new ArrayList<>();
 }
 public void enrolledStudents(String studentname) {
    if(enrolledStudents.size() < maxCapacity ){
        enrolledStudents.add(studentname);
        System.out.println(studentname + " has rolled in " + coursename);
    } else {
        System.out.println("Enrollment Failed " + coursename + " is at full capacity ");
    }
 }

 public void unenrollStudent(String studentname){
    if(enrolledStudents.remove(studentname)){
        System.out.println(studentname + " has unenrolled from " + coursename);
    } else {
        System.out.println(studentname + "is not enrolled in " + coursename);
    }
 }

 public static void setMaxCap(int capacity) {
    maxCapacity = capacity;
 }

 public static void main(String[] args) {
    Course javaCourse = new Course("Java Programming");
    javaCourse.enrolledStudents("Avinash");
    javaCourse.enrolledStudents("Dev");
    javaCourse.unenrollStudent("Dev");
    System.out.println(" Max Course Capacity "+maxCapacity);
 }
}
