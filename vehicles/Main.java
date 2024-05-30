package vehicles;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Automobile con el modelo "Toyota Corolla"
        Automobile car = new Automobile("Toyota Corolla");
        
        // Crear una instancia de Bicycle con el tipo "Mountain"
        Bicycle bike = new Bicycle("Mountain");

        car.accelerate(); // Acelera el automóvil
        car.accelerate(); // Acelera el automóvil nuevamente
        car.brake(); // Frena el automóvil
        System.out.println("Automobile (" + car.getModel() + ") current speed: " + car.getCurrentSpeed() + " km/h");

        bike.accelerate(); // Acelera la bicicleta
        bike.accelerate(); // Acelera la bicicleta nuevamente
        bike.brake(); // Frena la bicicleta
        System.out.println("Bicycle (" + bike.getType() + ") current speed: " + bike.getCurrentSpeed() + " km/h");
    }
}
