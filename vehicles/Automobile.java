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

    public void brake() {
        speed -= 10; 
        if (speed < 0) {
            speed = 0; 
        }
    }

    public int getCurrentSpeed() {
        return speed;
    }

}
