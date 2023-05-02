import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;


public class MostFrequentNumber {

    public static void main(String[] arg) {
        var numbers = new int[] {1, 6, 9, 8, 6};
        System.out.println("More Frequently " + numberMostFrequency(numbers));
//        int target  =   10;
//        var twoIndexs = sumTwoNumber(numbers, target);
//        System.out.println("Indexes " + twoIndexs[0] + " - " +
//                twoIndexs[1]);
    }
//
//    private static int[] sumTwoNumber(int[] numbers, int target) {
//        Map<Integer, Integer> visitedNumbers = new HashMap<>();
//        for (int i = 0; i < numbers.length; i++) {
//            int delta = target - numbers[i];
//            if (visitedNumbers.containsKey(delta)) {
//                return new int[] {visitedNumbers.get(delta), i};
//            }
//            visitedNumbers.put(numbers[i], i);
//        }
//        return new int[] {-1, -1};
//    }

//    private static int[] sumTwoNumber(int[] numbers, int target) {
//        Map<Integer, Integer> visitedNumbers = new HashMap<>();
//        return IntStream.range(0, numbers.length).boxed()
//                .map(i -> visitedNumbers.put(numbers[i], i))
//                .filter(i -> visitedNumbers.containsKey(target - numbers[i]))
//        return new int[] {-1, -1};
//    }

    private static int numberMostFrequency(int[] arrayNumbers) {
        List<Integer> numbers = new ArrayList<Integer>();
        int moreTimes = 0;
        for(int element : arrayNumbers) {
            int repetitions = (int) counting(arrayNumbers, element);
            if (repetitions > 1 && repetitions > moreTimes) {
                moreTimes = repetitions;
                numbers.add(element);
            }
        }
        return numbers.stream().min((a, b) -> a-b ).get();
    }

    private static long counting(int[] arrayNumbers, int element) {
        return IntStream.of(arrayNumbers).boxed().filter(e -> element == e).count();
    }
}