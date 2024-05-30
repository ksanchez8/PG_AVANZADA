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
}
