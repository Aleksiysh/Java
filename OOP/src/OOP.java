
import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Direction a = Direction.UP;

        Timer timer = new Timer();
        long time = timer.measureTime(new BigDecimalPower());
        System.out.println(time);
    }

    private static class BigDecimalPower implements Runnable{
        public void run(){new BigDecimal("1234567").pow(1000000);
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getX() < toX)
            while (robot.getDirection() != Direction.RIGHT)
                robot.turnRight();
        else if (robot.getX() > toX)
            while (robot.getDirection() != Direction.LEFT)
                robot.turnRight();
        while (robot.getX() != toX)
            robot.stepForward();

        if (robot.getY() < toY)
            while (robot.getDirection() != Direction.UP)
                robot.turnRight();
        else if (robot.getY() > toY)
            while (robot.getDirection() != Direction.DOWN)
                robot.turnRight();
        while (robot.getY() != toY)
            robot.stepForward();
    }
}
