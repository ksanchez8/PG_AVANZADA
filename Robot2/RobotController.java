package Robot2;
import java.io.*;


public class RobotController {
    private Robot robot;

    public RobotController(Robot robot) {
        this.robot = robot;
    }

    public void moveRobot() {
        robot.moveForward();
    }

    public void turnRobotLeft() {
        robot.turnLeft();
    }

    public void turnRobotRight() {
        robot.turnRight();
    }

    public String getRobotStatus() {
        return "Posició: (" + robot.getX() + ", " + robot.getY() + ") Direcció: " + robot.getDirection();
    }

    public void saveRobotState() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("robot_state.txt"))) {
            writer.write(robot.getX() + "," + robot.getY() + "," + robot.getDirection());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
