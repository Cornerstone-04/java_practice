import java.util.Date;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        /**
         * primitive types
         * There are 8 primitive types:
         * byte, short, long, int, float, double, char, boolean.
         */
        byte age = 30;
        short pump = 345;
        long viewsCount = 3_123_456_789L;
        int x = 50;
        float price = 10.99F;
        double y = 5.566D;
        char letter = 'A';
        boolean isEligible = false;

        /**
         * Reference types
         * 
         */
        byte old = 30;
        Date now = new Date();
        System.out.println(now);

        byte a = 1, b = a;
        a = 2;
        System.out.println(b);

        Point point = new Point(1, 1);
        Point point2 = point;
        point.x = 4;
        System.out.println(point2);

        String message = "Hello World" + "!!";
        System.out.println(message.endsWith("!!"));
        System.out.println(message);
    }
}
