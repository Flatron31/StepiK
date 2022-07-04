import java.math.BigInteger;

public class Robot implements Consumer{
    @Override
    public void accept(Object o) {

    }

    private static Direction Direction;
    private int X;
    private int Y;

    public Robot(Direction direction, int X, int Y) {
        Direction = direction;
        this.X = X;
        this.Y = Y;
    }

    public Direction getDirection() {
        return Direction; // текущее направление взгляда
    }

    public int getX() {
        return X;// текущая координата X
    }

    public int getY() {
        return Y;// текущая координата Y
    }

    public void turnLeft() {
        switch (Direction){
            case LEFT: Direction = Direction.DOWN;
                break;
            case DOWN: Direction = Direction.RIGHT;
                break;
            case RIGHT: Direction = Direction.UP;
                break;
            case UP: Direction = Direction.LEFT;
                break;
        }
        // повернуться на 90 градусов против часовой стрелки
    }

    public void turnRight() {
        switch (Direction){
            case LEFT: Direction = Direction.UP;
                break;
            case DOWN: Direction = Direction.LEFT;
                break;
            case RIGHT: Direction = Direction.DOWN;
                break;
            case UP: Direction = Direction.RIGHT;
                break;
        }
        // повернуться на 90 градусов по часовой стрелке
    }

    public void stepForward() {
        switch (Direction) {
            case LEFT:
                X--;
                break;
            case DOWN:
                Y--;
                break;
            case RIGHT:
                X++;
                break;
            case UP:
                Y++;
                break;
        }
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (toX <= 0) {
            while (robot.getDirection() != Direction.LEFT)  {
                robot.turnLeft();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (toY <= 0) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            else {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

        else {
            while (robot.getDirection() != Direction.RIGHT)  {
                robot.turnRight();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
            if (toY >= 0) {
                robot.turnLeft();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
            else {
                robot.turnRight();
                while (robot.getY() != toY) {
                    robot.stepForward();
                }
            }
        }

    }
}

class factorial {
    public static BigInteger calculateFactorial(int value) {
        BigInteger res = BigInteger.ONE;
        for (long i = 1; i <= value; i++) {
            res = res.multiply(BigInteger.valueOf(i));
        }
        return res;
    }
}