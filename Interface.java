/* Create Interface Shape with method area() - Rectangle and Circle Classes */



interface Shape{
    double area();
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    public double area(){
        return Math.PI *radius*radius;
    }
}

class Rectangle implements Shape{
    private double length, width;

    public Rectangle(double length, double width){
        this.length =length;
        this.width = width;
    }
    public double area(){
        return length * width;
    }
}

public class Interface {
    public static void main(String[] args) {
        Shape circ = new Circle(5);
        Shape rect = new Rectangle(5, 3);

        System.out.println("Circle area: "+circ.area());
        System.out.println("Rectangle area: "+rect.area());
    }
}
