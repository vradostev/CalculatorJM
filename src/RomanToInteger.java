import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        final Map<Character, Integer> map = Map.of('I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000);

        int result = 0;
        for (int index = 0; index < roman.length(); index++) {
            final int currentNum = map.get(roman.charAt(index));

            if (index > 0 && currentNum > map.get(roman.charAt(index - 1))) {

                result += currentNum - 2 * map.get(roman.charAt(index - 1));
            } else {
                result += currentNum;
            }
        }
        return result;
    }

    }
