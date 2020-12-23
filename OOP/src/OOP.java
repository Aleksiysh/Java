
import textAnaliser.CheckLabels;

import java.math.BigDecimal;
import java.util.function.DoubleUnaryOperator;

public class OOP {
    public static void main(String[] args) {
    CheckLabels a = new CheckLabels();
    a.main1();


//        AsciiCharSequence str = new AsciiCharSequence("1234567890");
//        System.out.println(str.charAt(1));
//        System.out.println(str.length());
//        System.out.println(str);
//        System.out.println(str.subSequence(0,5));

//        double a = integrate(x -> 1, 0, 10);
//        System.out.println(a);
//        Timer timer = new Timer();
//        long time = timer.measureTime(OOP::bigDecimalPower);
//        System.out.println(time);
    }


    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        double step = 1e-6;
        double result =0;
        while(a+step<b){
            result+=f.applyAsDouble(a)*step;
            a+=step;
        }
        return result;
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
