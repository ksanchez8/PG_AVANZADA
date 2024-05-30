package vehicles;

public class Bicycle {
    private String type;
    private int speed;

    public Bicycle(String type) {
        this.type = type;
        this.speed = 0;
    }

    public void accelerate() {
        speed += 5; // Incrementa la velocidad en 5
    }

    public void brake() {
        speed -= 5; // Decrementa la velocidad en 5
        if (speed < 0) {
            speed = 0;
        }
    }

    public int getCurrentSpeed() {
        return speed;
    }

    public int getCurrentSpeed() {
        return speed;
    }
}
