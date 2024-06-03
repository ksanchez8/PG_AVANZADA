package Robot2;

public class Robot {
    private int x; 
    private int y; 
    private String direction; 

    public Robot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (direction) {
            case "NORTH":
                y -= 1;
                break;
            case "SOUTH":
                y += 1;
                break;
            case "EAST":
                x += 1;
                break;
            case "WEST":
                x -= 1;
                break;
        }
    }


