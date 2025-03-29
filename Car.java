/* Crearting Class car and its attributes call using Object and print details */

import javax.swing.tree.VariableHeightLayoutCache;

public class Car {
    private String brand;
    private String model;

    public Car(String brand, String model){
        this.brand = brand;
        this.model = model;
    }

    public void details(){
        System.out.println("Car Brand : "+brand);
        System.out.println("Car Model : "+model);
    }

    public static void main(String[] args) {
        Car car = new Car("BMW", "M3 CS");
        car.details();
    }
}

