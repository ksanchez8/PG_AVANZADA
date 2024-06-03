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