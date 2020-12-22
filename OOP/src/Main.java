import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(Color.BLUE);
        Shape circle = new Circle(new Point(2,3),3.5,Color.blue);
        System.out.println(circle.getArea());
        Robot robot = new Robot(1,1,Direction.LEFT);
        robot.turnRight();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();
        moveRobot(robot,6,2);

        System.out.println(robot.printRobot());
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
