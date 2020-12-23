package ru.aleks.OOP;
public class Robot {

    private Direction direction;
    private int x;
    private int y;

    public Robot(int x,int y,Direction direction){
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public Robot(){
        this(0,0,Direction.UP);
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void turnLeft() {
        switch (direction){
            case UP -> direction=Direction.LEFT;
            case LEFT -> direction = Direction.DOWN;
            case DOWN -> direction = Direction.RIGHT;
            case RIGHT -> direction = Direction.UP;
        }
    }

    public void turnRight() {
        switch (direction){
            case DOWN -> direction=Direction.LEFT;
            case RIGHT -> direction = Direction.DOWN;
            case UP -> direction = Direction.RIGHT;
            case LEFT -> direction = Direction.UP;
        }
    }

    public void stepForward() {
        switch (direction){
            case DOWN -> y--;
            case RIGHT -> x++;
            case UP -> y++;
            case LEFT -> x--;
        }
    }

    public String printRobot(){
        return "x:"+x+" y:"+ y +" duration:"+ direction.name();
    }
}