
import java.math.BigDecimal;

public class OOP {
    public static void main(String[] args) {

        Timer timer = new Timer();
        long time = timer.measureTime(OOP::bigDecimalPower);
        System.out.println(time);
    }

    private static void bigDecimalPower() {
        new BigDecimal("1234567").pow(100000);
    }

//    private static class BigDecimalPower implements Runnable{
//        @Override
//        public void run(){new BigDecimal("1234567").pow(100000);
//        }
//    }

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
