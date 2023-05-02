
import java.util.stream.IntStream;


public class ReverseInteger {

    public static void main(String[] args) {
        int input = 2700;
        String reversed = "";
        while (input != 0) {
            reversed = reversed + input % 10;
            input /= 10;
            int intReverse = Integer.valueOf(reversed);
            if ( intReverse > Integer.MAX_VALUE || intReverse < Integer.MIN_VALUE) {
                System.out.println("Limit of integer was exceeded");
            }
        }
        System.out.println("Reverse integer "+ reversed);
    }
}