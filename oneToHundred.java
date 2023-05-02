import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class oneToHundred {
    public static void main(String[] args) {
        IntStream.range(1, 101)
                .forEach(n -> {
                    if (n % 3 == 0) {
                        System.out.print("Fizz");
                    }
                    if (n % 5 == 0) {
                        System.out.print("Buzz");
                    }
                    if (n % 3 != 0 && n % 5 != 0) {
                        System.out.print(n);
                    }
                    System.out.print("\n");
                });
    }
}

