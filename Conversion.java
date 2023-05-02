import java.util.HashMap;
import java.util.Map;

public class Conversion {

    public static void main(String[] args) {
        int num = 2721;
        String romanNum =   "DII";

        System.out.println("The number in Roman is "+ intToRoman(num));
        System.out.println("The Roman number to decimal is "+ romanToDec(romanNum));
    }

    private static String intToRoman (int num) {
        String[] thousands = new String[]{"","M","MM","MMM"};
        String[] hundreds = new String[]{"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String[] tens = new String[]{"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] units = new String[]{"","I","II","III","IV","V","VI","VII","VIII","IX"};

        return thousands[num/1000] +
                hundreds[(num % 1000)/100]  +
                tens[(num % 100)/10]  +
                units[num % 10];
    }


    private static int romanToDec(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int intValue = 0;
        int strLen = s.length() - 1;
        for (int i =  strLen; i >= 0; i--) {
            if (i < strLen && map.get(s.charAt(i)) < map.get(s.charAt(i+1))) {
                intValue -= map.get(s.charAt(i));
            } else {
                intValue += map.get(s.charAt(i));
            }

        }
        return intValue;
    }
}


