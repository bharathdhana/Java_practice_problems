/* Crearting Class Student and its attributes call using Object and print details */

public class Student {
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void details(){
        System.out.println("Student Name : " + name);
        System.out.println("Student Age : " + age);
    }

    public static void main(String[] args) {
        Student stu = new Student(" Krishna ", 25);
        stu.details();
    }
}
