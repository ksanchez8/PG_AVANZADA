package vehicles;

public class Automobile {
    private String model;
    private int speed;

    public Automobile(String model) {
        this.model = model;
        this.speed = 0;
    }

    public void accelerate() {
        speed += 10; 
    }
}
