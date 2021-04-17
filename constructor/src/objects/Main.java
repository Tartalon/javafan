package objects;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.scale(8, 6);

        System.out.println("New point is: x = " + point1.getX() + " y = " + point1.getY());
    }
}
