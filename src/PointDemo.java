public class PointDemo {
    public static void main(String[] args) {


        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("p1 = " + p1);
        System.out.println("p2 = " + p2);

        System.out.println("p1: (" + p1.x + " , " + p1.y + ")");
        System.out.println("p1: (" + p2.x + " , " + p2.y + ")");

        p1.x = 5;
        p1.y = -5;

    }
}
